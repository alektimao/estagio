package br.com.maplebearsystem.view;

import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

public class HeaderFooterPageEvent extends PdfPageEventHelper {

    protected Phrase header;

    public void setHeader(Phrase header) {
        this.header = header;
    }

    @Override
    public void onEndPage(PdfWriter writer, Document document) {
    	String img = "C:\\Imagens\\maple.png";
	    Image image;
        int pageNumber = document.getPageNumber();
        if (pageNumber == 1)
        {
        	try {
        		image = Image.getInstance(img);
        		image.setAlignment(Element.ALIGN_CENTER);
        		image.setAbsolutePosition(260, 760);
        		image.scalePercent(20.5f, 20.5f);
        		writer.getDirectContentUnder().addImage(image, false);
        	} catch (IOException | DocumentException e) {
        		System.out.println(e);
        	}
        	PdfContentByte canvas = writer.getDirectContentUnder();
        	//ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, header, 559, 806, 0);
        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, header, (document.left() + document.right())/2 , document.bottom()-20, 0);        	
        }
        return;
    }
}
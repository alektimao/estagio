package br.com.maplebearsystem.view;


public interface FXMLDefaultControllerInterface {
	
	public void reset();
	
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception;
	
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception;
	
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception;
	
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception;
}

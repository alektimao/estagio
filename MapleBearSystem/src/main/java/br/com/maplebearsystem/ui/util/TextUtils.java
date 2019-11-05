package br.com.maplebearsystem.ui.util;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TextUtils {

	public static String formatCurrency(Object value, Locale locale) {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		return numberFormat.format(value);
	}

	public static String formatCurrencyWithLocalePTBR(BigDecimal value) {
		return formatCurrency(value, new Locale("pt", "BR"));
	}

	public static String formatCurrencyWithLocalePTBR(double value) {
		return formatCurrency(value, new Locale("pt", "BR"));
	}

	public static String formatDateMediumStyle(Date sqlDate) {
		java.util.Date utilDate = new java.util.Date(sqlDate.getTime());
		return formatDateMediumStyle(utilDate);
	}

	public static String formatDateMediumStyle(java.util.Date utilDate) {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault());
		return dateFormat.format(utilDate);
	}

	public static String formatDateMediumStyle(LocalDate localDate) {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault());

		return dateFormat.format(localDate);
	}

	public static String formatDateTimeMediumStyle(LocalDate localDate, LocalTime localTime) {

		try {

			DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
			DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
			String result = "";

			// LocalDateTime ldt = LocalDateTime.of(localDate, localTime);

			// result = result + ldt.format(dateFormatter);

			result += localDate.format(dateFormatter) + " " + localTime.format(timeFormatter);
			return result;
		} catch (Exception e) {
			return "";
		}
	}

	public static String formatDecimalWithTwoDecimalDigits(BigDecimal value) {
		return formatDecimalWithTwoDecimalDigits(value.doubleValue());
	}

	public static String formatDecimalWithTwoDecimalDigits(Double value) {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		DecimalFormat decimalFormat = new DecimalFormat("0.00", symbols);
		return decimalFormat.format(value);
	}

	public static String formatDecimalWithTwoDecimalDigits(String value) {
		Double doublevalue = new Double(value);
		return formatDecimalWithTwoDecimalDigits(doublevalue);
	}

	public static String formatNumberWithLeadingZeroes(Number number, int size) {
		String zeroes = "";

		for (int i = 0; i < size; i++) {
			zeroes += "0";
		}

		try {
			return (zeroes + number.toString()).substring(number.toString().length());
		} catch (Exception e) {
			return "";
		}
	}

	public static String trimLeadingAndTrailingWhiteSpaces(String text) {
		return text.replaceAll("^\\s+|\\s+$", "");
	}

	public static String localizedYesOrNo(boolean yes) {

		return yes ? "Sim" : "Não";
	}
}

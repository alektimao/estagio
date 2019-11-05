package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

public class UserInputExceptionCombo extends Exception {

	private static final long serialVersionUID = 1L;

	private List<UserInputException> userInputExceptionsList;

	public UserInputExceptionCombo() {
		super();
		this.setUserInputExceptionsList(new ArrayList<UserInputException>());
	}

	public UserInputExceptionCombo(String arg0) {
		super(arg0);
	}

	public void add(UserInputException userInputException) {
		this.userInputExceptionsList.add(userInputException);

	}

	public void addAll(UserInputExceptionCombo userInputExceptionCombo) {
		this.userInputExceptionsList.addAll(userInputExceptionCombo.getUserInputExceptionsList());
	}

	public List<UserInputException> getUserInputExceptions() {
		return this.getUserInputExceptionsList();
	}

	public List<UserInputException> getUserInputExceptionsList() {
		return userInputExceptionsList;
	}

	public boolean isEmpty() {
		return this.userInputExceptionsList.isEmpty();
	}

	public void remove(UserInputException userInputException) {
		this.userInputExceptionsList.remove(userInputException);

	}

	public void setUserInputExceptionsList(List<UserInputException> userInputExceptionsList) {
		this.userInputExceptionsList = userInputExceptionsList;
	}

	public String getMessagesInLines() {
		String text = "";

		for (UserInputException e : this.userInputExceptionsList) {
			text = text + e.getMessage() + "\n";
		}

		return text;
	}

}

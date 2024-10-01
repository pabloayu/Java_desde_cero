package io.keepcoding.keeptrivial.model;

public class Question {
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private int rightOption;
	
	public Question(String question, String answer1, String answer2, String answer3, String answer4, int rightOption) {
		super();
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.rightOption = rightOption;
	}

	public String getQuestion() {
		return question;
	}

	public int getRightOption() {
		return rightOption;
	}

	public void setRightOption(int rightOption) {
		this.rightOption = rightOption;
	}
	
	public boolean checkQuestion(int option) {
		return rightOption == option;
	}
	
	public String getRightAnswer() {
		String res = "Opción";
		if (rightOption == 1) {
			res = Integer.toString(1) + ". " + answer1;
		} else if (rightOption == 2) {
			res = Integer.toString(1) + ". " + answer2;
		} else if (rightOption == 3) {
			res = Integer.toString(1) + ". " + answer3;
		} else if (rightOption == 4) {
			res =Integer.toString(1) + ". "+  answer4;
		}
		return res;
	}
	
	public String toString() {
		
		return new StringBuilder()
				.append(" - " + question + "\n")
				.append("1. " + answer1 + "\n")
				.append("2. " +answer2 + "\n")
				.append("3. " +answer3 + "\n")
				.append("4. " +answer4 + "\n")
				.toString();
	}
}

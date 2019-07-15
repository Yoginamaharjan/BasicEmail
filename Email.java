//Name: Yogina Maharjan
package com.yogi.email;

public class Email {
	
	private String emailAddress;
	private String subject;
	private String message_body;
	boolean msgSent = false;
	
	public Email() {
		
	}
	public String getMessage_body() {
		return message_body;
	}
	public void printEmailAddress() {
		System.out.println("The email address is " + this.emailAddress);
	}
	
	public boolean msgSent() {
		return msgSent;
	}
	
	public void printSubject() {
		System.out.println("The subject of the email is "+ this.subject);
	}
	
}

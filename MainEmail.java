package com.yogi.email.email;

import com.yogi.email.Email;

public class MainEmail {

	public static void main(String[] args) {
		Email Email = new Email();
		Email.msgSent();
		System.out.println("Message sent is" +Email.msgSent());
		boolean temp;
		temp = Email.msgSent();
		temp = true;
		System.out.println("Message sent is" + temp);
		
	}

}

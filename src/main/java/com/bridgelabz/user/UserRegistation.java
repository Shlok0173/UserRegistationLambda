package com.bridgelabz.user;

import java.util.regex.Pattern;


import java.util.regex.Matcher;
public class UserRegistation {

	public void main(String args[]) {
		
		   FirstName firstname1= ( firstName) -> {
			String regex="^[A-Z]{1}[a-z}*$";
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(firstName);
			if(matcher.matches()) {
				
			}else {
				new UserRegistationException(UserRegistationException.ExceptionType.INVALID_FIRST_NAME,"Invalid FirstName");
			}
		};
	}
	
	    LastName lastname=(lastName)->{
		String regex="^[A-Z]{1}{a-z}*$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(lastName);
		if(matcher.matches()) {
		}else {
			new UserRegistationException(UserRegistationException.ExceptionType.INVALID_LAST_NAME,"Invalid LastName");
		}
	};
	
	   Email email=(email)->{
		String regex="^[a-z][a-z0-9]*@[a-z]*.[a-z]*$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		if(matcher.matches()) {
		}else {
			new UserRegistationException(UserRegistationException.ExceptionType.INVALID_EMAIL,"Invalid Email");
		}
	};
	
	   Mobile mobile=(mobile)->{
		String regex="+(0/91)[7-9]{1}[0-9]{9}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(mobile);
		if(matcher.matches()) {
		}else {
			new UserRegistationException(UserRegistationException.ExceptionType.INVALID_PHONE_NUMBER,"Invalid mobile");
		}
	};


	
	
	   Password  password=(password)->{
		String regex="^[A-Z]{1}@[a-z]";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(regex);
		if(matcher.matches()) {
		}else {
			new UserRegistationException(UserRegistationException.ExceptionType.INVALID_PASSWORD,"Invalid Password");
		}
	};
}

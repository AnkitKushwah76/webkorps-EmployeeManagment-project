package com.validation;

import java.util.regex.Pattern;

public class EmpValidation {
	
	public static String validateEmail(String email) {
		if(email==null||email.isEmpty()) {
			return "Invaild";
		}
		String str="[a-zA-Z0-9]+[@][a-z]+[\\.][a-z]{2,3}";
	      
		boolean result = email.matches(str);
		 //System.out.println(result);
		if(result){
			return "Vaild";
			
		}
		else
		{
			return "Invaild";
		}
		
		
	}

}

package com.bdqn.service.user;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserServiceTest {

	
	public static void main(String[] args) {
		String a = "1234.5";
		int b= a.indexOf(".");
		String c = a.substring(0,b+1);
		
		System.out.println(b);
		System.out.println(c);
	}

}

package com.firstpackage;

import java.util.Scanner;

import com.firstproject.userProcess.UserProcessing;
import com.firstproject.userProcess.UserProcessingImpl;

public class BootStrap {

	public static void main(String[] args) {

		System.out.println("Application has started");
		System.out.println("please enter your name.");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		UserProcessing up = new UserProcessingImpl();
		up.welcomeUser(name);
	}

}

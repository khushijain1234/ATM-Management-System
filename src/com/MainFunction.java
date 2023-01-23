package com;
import java.util.*;

import java.io.IOException;

public class MainFunction {
private static Scanner sc;

public static void main(String args[]) throws IOException {
	sc = new Scanner(System.in);
	
	Info obj[]= new Info[2];
	System.out.println("WELCOME....");
	for(int i=0;i<2;i++) {
		obj[i]=new Info();
	}
	for(int i=0;i<2;i++) {
		obj[i].input();
	}
	Working w= new Working();
	int ch,accnoo=0;
	int amount;
	do {
		System.out.println("ATM MANAGEMENT SYSTEM....");
		System.out.println("1-DEPOSIT");
		System.out.println("2-WITHDRAW");
		System.out.println("3-DISPLAY");
		System.out.println("4-CHANGE PIN");
		System.out.println("5-CHANGE MOBILE NUMBER");
		System.out.println("6-EXIT");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		if(ch<6) {
			System.out.println("Enter the account number");
			accnoo=sc.nextInt();
		}
		int i=0;
		switch(ch)
		{case 1:
			System.out.println("Enter the amount to be deposited");
			amount=sc.nextInt();
			for(i=0;i<2;i++) {
				if(obj[i].getAccno()==accnoo) {
					w.deposit(amount);
					break;
				}
			}
			if(i==2) {
				System.out.println("the given account number is not found");
			}
			break;
		case 2:
			System.out.println("Enter the amount to be withdraw");
			amount=sc.nextInt();
			for(i=0;i<2;i++) {
				if(obj[i].getAccno()==accnoo) {
					w.withdraw(amount);
					break;
				}
			}
			if(i==2) {
				System.out.println("the given account number is not found");
			}
			break;
		case 3:
			for(i=0;i<2;i++) {
				if(obj[i].getAccno()==accnoo) {
					obj[i].show();
					break;
				}
			}
			if(i==2) {
				System.out.println("the given account number is not found");
			}
			break;
		case 4:
			for(i=0;i<2;i++) {
				if(obj[i].getAccno()==accnoo) {
					w.changePin();
					break;
				}
			}
			if(i==2) {
				System.out.println("the given account number is not found");
			}
			break;
		case 5:
			for(i=0;i<2;i++) {
				if(obj[i].getAccno()==accnoo) {
					w.changeMobileNo();
					break;
				}
			}
			if(i==2) {
				System.out.println("the given account number is not found");
			}
			break;
		case 6:
				System.out.println("Thank You...:)");
				System.exit(0);
		default:
			System.out.println("Wrong Choice...:(");
		}
	}while(true);
}
}

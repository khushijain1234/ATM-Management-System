package com;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Working {
Info info= new Info();
Scanner sc= new Scanner(System.in);
BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
String Pin;
long mobileno,m;
void deposit(int amt) {
	info.balance+=amt;
	System.out.println("Your amount is deposited");
}
void withdraw(int amt) {
	if(info.balance-1000>=amt) {
		info.balance-=amt;
		System.out.println("Withdrawn Sucessfull");
	}
	else
		System.out.println("You have insufficient balance");
}
void balanceEnquiry() {
	System.out.println("Your current Balance is : "+info.getBalance());
}
void changePin() throws IOException {
	System.out.println("Enter your current PIN password");
	Pin = reader.readLine();
	if(Pin.equals(info.pin)) {
		System.out.println("Enter New Pin");
	info.pin=sc.nextLine();
	if(info.pin.length()!=4) {
		System.out.println("Enter only 4-digit pin");  
	}
	int t=0;
	while(t!=0) {
		System.out.println("Confirm Pin");
		info.pinno=sc.nextLine();
		if(info.pin==info.pinno) {
			t=1;
			break;	
		}
		else
			System.out.println("Enter correct pin");
	}
}
	else {System.out.println("Enter correct pin");
	}
		
	
}
void changeMobileNo() {
	System.out.println("Enter your current Mobile Number ");
	mobileno=sc.nextLong();
	if(mobileno!=info.mobno) {
		System.out.println("Enter Correct Mobile Number");
	}
	else {
		System.out.println("Enter New Mobile Number");
		info.mobno=sc.nextLong();
}
	int t=0;
	while(t!=0) {
		System.out.println("Confirm Mobile Number");
		m= sc.nextLong();
		if(m==info.mobno) {
			t=1;
			System.out.println("Your Mobile Number has changed successfully!");
			break;	
		}
		else
			System.out.println("Enter correct Mobile Number");
	}

}
}
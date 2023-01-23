package com;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Info {
	int accno;
String name,type,address,pin,pinno;
float balance;
long mobno;

Scanner sc= new Scanner(System.in);
BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
void input() throws IOException {
	System.out.println("ENTER THE DETAILS->");
	System.out.println("Enter the Name");
	name=sc.nextLine();
	System.out.println("Enter the Account Number");
	accno=sc.nextInt();
	

		System.out.println("Enter the account type as saving or current only");
		type = reader.readLine();
		
	System.out.println("Enter the Address");
	address= reader.readLine();
	System.out.println("Enter the Mobile no.");
	mobno=sc.nextLong();
	System.out.println("Enter the Balance");
	balance=sc.nextFloat();
	System.out.println("Enter any 4-digit pin");
	pin = reader.readLine();
	if(pin.length()!=4)
		System.out.println("Enter only 4-digit pin");
	int t=0;
	while(t==0) {
		System.out.println("Confirm Pin");
		pinno = reader.readLine();
		if(pin.equals(pinno)) {
			t=1;
			break;	
		}
		else
			System.out.println("Enter correct pin");
	}

}
void show() {
	System.out.println("DETAILS->");
	System.out.println("Name: "+name);
	System.out.println("Type of account: "+type);
	System.out.println("Address: "+address);
	System.out.println("Mobile no. "+mobno);
}
int getAccno() {
	return accno;
}
int getPin() {
	int p=Integer.parseInt(pin);
	return p;
}
float getBalance() {
	return balance;
}
}

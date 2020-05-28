package org.bank;

public class Icici extends Rbi{
private void branch() {
System.out.println("branch name is omr");
}
public static void main(String[] args) {
	Icici i=new Icici();
	i.branch();
	i.aadhar();
	i.pan();
			
}
}

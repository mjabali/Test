package com.marcelo.test;

public class VendingMachine {

	/**
	 * @param args
	 */

	private static int amountReceived;
	private static int changeDue;
		
	public static void main(String[] args){
	
		amountReceived = new Integer(args[0]).intValue();
		checkChange();
	}

	private static void checkChange() {
		// TODO Auto-generated method stub
		int productPrice = 31;
		changeDue = amountReceived - productPrice;
		System.out.println("Change Due: " + changeDue);
		checkQuarters();
		
	}
	private static void checkQuarters(){
		int quarters = 0;
		while(changeDue >= 25){
			changeDue -= 25;
			quarters++;
		}
		System.out.println("Quarters: "  + quarters);
		checkDimes();
	}
	private static void checkDimes(){
		int dimes = 0;
		while(changeDue >= 10){
			changeDue -= 10;
			dimes++;
		}
		System.out.println("Dimes: " + dimes);
		checkFives();
	}
	private static void checkFives(){
		int fives = 0;
		while(changeDue >= 5){
			changeDue -= 5;
			fives++;
		}
		System.out.println("Fives: " + fives);
		checkNickels();
	}
	private static void checkNickels(){
		int nickels = 0;
		while(changeDue >= 1){
			changeDue -= 1;
			nickels++;
		}
		System.out.println("Nickels: " + nickels);
	}

}

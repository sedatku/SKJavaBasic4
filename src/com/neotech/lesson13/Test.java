package com.neotech.lesson13;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Please enter the array: ");
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};

	  // Do not touch above
	  // Write your code below
	    
	   
	    String shrString="";
	    int shr =str[0].length();
	    for(int i=1; i <str.length; i++){
	  
	    if(str[i].length() < shr){
	      shrString = str[i];

	      shr = str[i].length();
	       
	    }
	    else {
	    	shrString = str[0];
	    }
	      
	    }
	  
	  System.out.println(shrString);

	}

}

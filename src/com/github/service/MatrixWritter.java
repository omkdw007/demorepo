package com.github.service;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;


/**
 * These are some of the programming puzzles which I tried to resolve.
 *
 * @author owadkar
 *
 */
public class MatrixWritter {
  /**
   * 
   * @param text
   * @param encoding
   * @return
   * @throws UnsupportedEncodingException
   */
	public boolean isEncoded(String text,String encoding) throws UnsupportedEncodingException{
       
		try{
			
			Charset charset = Charset.forName(encoding);
			String checked=new String(text.getBytes(charset),charset);
			return !checked.equals(text);
		} 
		 catch(Exception ex){
			 
			throw new UnsupportedEncodingException();
		 }
	    
	    
	    
	    

	}
	/**
	 * Read 2D matrix in a spiral way
	 * @param args
	 */
	public static  void main(String [] args){
		
		
		
	
		int [] []  matrix = new int [5][5];
		int count= 1;
	    for(int i= 0 ; i < matrix.length; i++){
	    	System.out.println("");
	    	for(int j=0; j<matrix.length; j++){
	    		 matrix[i][j]= count;
	    		 //System.out.print(matrix[i][j]+"  ");
	    		 count++;
	    	}
	    	
	    }
		count = 0;
		int i= 0;
    	int j =0;
    	int topLevel=0;
    	int leftLevel=0;
    	int bottumLevel =0;
    	int rightLevel= 0;
	    while(count<25){
	    	
	    	
	    	//move L-R 
	    	i=topLevel;
	    	j=leftLevel;
	    	for(;j <= 4-rightLevel ;j++){
	    		System.out.println(matrix[i][j]);
	    		count ++;
	    	}
	    	topLevel++;
	    	//move T-B
	    	for(i=topLevel;i<=4-bottumLevel;i++){
	    		System.out.println(matrix[i][j-1]);
	    		count ++;
	    	}
	    	rightLevel++;
	        //Move R-L 
	    	if(i==j){
	    		i=j=i-1;
	    		for(j=j-1;j>=leftLevel;j--){
	    			System.out.println(matrix[i][j]);
	    			count ++;
	    		}
	    		bottumLevel++;
	    	}
	    	//Move B-T
	    	j++;
	    	for(i=i-1;i>=topLevel;i--){
	    		System.out.println(matrix[i][j]);
	    		count ++;
	    	}
	    	leftLevel++;
	    	
	    	
	    	
	    }
		
	}
	
	
	/**
	 * finds first repeating sequence in a given String
	 * @param input
	 * @return
	 */
	public static String findRepeatingSequence(String input){
	 char [] inputArray  = input.toCharArray();
	 StringBuffer sequence = new StringBuffer();
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (Character.toString(inputArray[i]).equals(Character.toString(inputArray[i + 1]))) {
				
				sequence.append(Character.toString(inputArray[i]));
				
					while (Character.toString(inputArray[i]).equals(Character.toString(inputArray[i + 1]))) {
						sequence.append(Character.toString(inputArray[i]));
						if (i + 1 < inputArray.length - 1) {
							i++;
						} else
							break;
					}
			    

			}else{
				if (sequence.length()>0){
					break;
				}
			}
			

	 }
	
	return sequence.toString();	
	}
	
	
	/**
	 *  check if number is Prime
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number){
		boolean isPrime = true;
		if(number == 1){
			isPrime = true;
			System.out.println(number);
		}
		
		for(int i= 2 ;i < number;i++ ){
			if(number % i == 0){
				isPrime = false;
			}
			
		}
		
		
		return isPrime;
	}
	/**
	 * Check if Number is ArmStrongs number.
	 * @param number
	 * @return
	 */
	public static  boolean checkIfArmstrongsNumber(int number){
		boolean isAremstrongNumber = false;
		int sum =0;
		char [] numberArray =Integer.toString(number).toCharArray();
	    for(char numbers:numberArray){
	    	  Integer num=Integer.parseInt(Character.toString(numbers));
	    	  sum=sum+(num*num*num);
	    	  
	    }
		if(sum == number){
			isAremstrongNumber = true;
			System.out.println(sum);
		}
		
		return isAremstrongNumber;
		
	}
	
   /*
    * String reversal without string functions
    */
	public static String reverseString(String input) {
		StringBuffer output=new StringBuffer();
		char[] charArray = input.toCharArray();
		for (int i = charArray.length-1; i >= 0; i--) {
			output.append(charArray[i]);
		}
        return output.toString();
	}
	
	/**
	 * Print fibbonacci upto given number
	 * @param limitNumber
	 */
	public static void printFibbonacci(int limitNumber){
		int number = 0;
		int lastNumber =0;
		ArrayList<Integer> fibbonacciSequanse = new ArrayList<Integer>();
		while(lastNumber < limitNumber){
		if(number == 0){
			fibbonacciSequanse.add(0);
			lastNumber = fibbonacciSequanse.get(fibbonacciSequanse.size()-1);
			
		}
		else if(number == 1){
		    fibbonacciSequanse.add(1);
		    fibbonacciSequanse.add(number+(number-1));
		    lastNumber = fibbonacciSequanse.get(fibbonacciSequanse.size()-1);
		}
		else
		{
			 lastNumber = fibbonacciSequanse.get(fibbonacciSequanse.size()-1);
			int secondLast = fibbonacciSequanse.get(fibbonacciSequanse.size()-2);
			if((lastNumber+secondLast)>limitNumber){
				break;
			}
			fibbonacciSequanse.add(lastNumber+secondLast);
			 lastNumber = fibbonacciSequanse.get(fibbonacciSequanse.size()-1);
		}
		number++;
	}
		
		// display the fibbonacci seriese 
		for(Integer num :fibbonacciSequanse){
			System.out.print(" "+num);
		}
	}

}

package com.hkit.bbg;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;
		
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
		
		for(int i = 0; i < NO_COUNT ; i++) {
			// Math.random ---> 0 ~ 0.999999
			int randomValue = (int)(Math.random() * 9) +1 ;
			//1 ~ 9
			
			for(int j = 0; j < i + 1; j++)
				if(randomNoArray[j] == randomValue) {
					i--;
					break;
				}
				else if(randomNoArray[j] == 0) {
					randomNoArray[j] = randomValue;
					break;
				}
		}
		for(int item : randomNoArray) {
			System.out.println(item);
		}
	
	}	
}


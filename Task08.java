package lesson03;

import java.util.Random;

public class Task08 {
	

	public static void main (String[] args) {
		
		int i = 333;
		int [] mas = new int [10];
		Random rand = new Random(); 
		
		for (int x = 0; x<mas.length; x++) {
			mas[x] = rand.nextInt(1000);
			
			
			if (mas[x]>i) 
			{System.out.println(mas[x]);
		}
		
	
	}

	}
		
}

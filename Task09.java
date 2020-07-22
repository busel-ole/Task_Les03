package lesson03;

import java.util.Random;

public class Task09 {
	
	public static void main (String[] args) {
		
	   int plus = 0;
	   int minus = 0;
	   int nol = 0;
	   
	   int [] mas = new int [20];
       Random rand = new Random(); 
		
	    for (int i = 0; i<mas.length; i++) {
			mas[i] = rand.nextInt(100); }
			
	    for (int i = 0; i<mas.length; i++) {
			System.out.print(mas[i] + ", ");
		     }
	    
		for (int i = 0; i<mas.length; i++) {
			if (mas[i] > 0) { plus = plus + 1;} 
		} 
			    
		System.out.print("Количество положительных чисел - " + plus + ", ");
			
		for (int i = 0; i<mas.length; i++) {
			if (mas[i] < 0) { minus = minus + 1;} 
		} 	
		
		System.out.println("количество отрицательных чисел - " + minus + ", " );
		
		for (int i = 0; i<mas.length; i++) {
			if (mas[i] < 0) { nol = nol + 1;} 
		} 	
		
		System.out.println("количество нулей - " + nol + ". " );
		

}   

	}

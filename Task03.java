package lesson03;
import java.util.Random;

public class Task03 {

	public static void main (String[] args) {
		
		
		
		int [] mas = new int [3];
		Random rand = new Random(); 
		
		for (int i = 0; i<mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
		
		
		
		for (int i = 0; i<mas.length; i++) {
			System.out.println(mas[i]);
		     }
		 
			if (mas[0]<mas[1] | mas[1]<mas [2]) {
			
			System.out.println("Последовательность возрастающая"); }
			
		    else { System.out.print("Последовательность не возрастающая");
		    }
		    
	}
				 
}
			
			
		
   
	
		
	

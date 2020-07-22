package lesson03;

public class Task06 {
	
public static void main (String[] args) {
		
		
		int [] mas = new int [] {2, 3, 6, 9, 10, 27, 55};
        int Z = 8;
        int x = 0;
        
        for(int i=1; i < mas.length; i++) {
	    	 if (mas[i] > Z)  {
	    		 mas[i] = Z;
	    		 x = x+1; }
	    			
	    	 }
        
        System.out.println("Количество замененных чисел - " + x);
  }
   }
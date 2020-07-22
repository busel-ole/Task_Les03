package lesson03;

public class Task01 {

	public static void main (String[] args) {
		
		int k = 3;
		int sum = 0;
		
		int [] a = new int [] {2, 3, 6, 9, 10};
		
	     for(int i=0; i < a.length; i++) {
			 if (a[i] % k == 0)
				 sum = sum + a[i]; 
	    
		  }
	     
	     System.out.println("Сумма чисел, кратных К = " + sum);
	}

	}



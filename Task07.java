package lesson03;

public class Task07 {

	public static void main (String[] args) {
		
		
		int [] a = new int [] {2, 3, 6, 9, 10, 27, 55};
		
		
		 int min = a [0];
		 int indexmin = 0; 
	     for(int i=1; i < a.length; i++) {
	    	 if (min>a[i]) {
	     		 min = a[i];
	     		 indexmin = i; 
	                   	   }        
	    	                             }
	     
	     int max = a [0];
	     int indexmax = 0; 
	     for(int i=1; i < a.length; i++) {
	    	 if (max<a[i]) {
	     		 max = a[i];
	     		 indexmax = i;
	                   	   }        
	    	                             }
	     
	   
	     
	     System.out.println("����������� ����� - " + min + " ��� ������ - " + indexmin);
	     System.out.println("������������ ����� - " + max + " ��� ������ - " + indexmax);
	     
	     
	     a [indexmax] = min;
	     a [indexmin] = max;
	     
	     
	  //�������� ������� �� �����((
	     
}
	

	
	
}

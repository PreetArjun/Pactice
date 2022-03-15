package Pune;

public class Construtor  extends Practicee {
	public static  int a = 63; //global variable 
      int b=45; // global variable       
     int c =8552;
   
     void lemo()
      {
    	int  a = 78; // local variable
    	 int  b = 34;
  		 System.out.println(this.b);
    	 System.out.println(super.a);
      }

	public static void main(String[] args) {
		
		Construtor x = new Construtor();
		x.lemo();	
	}

}


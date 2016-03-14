package main;
  class Rect{
	  int x,y,W,H;
	  double Area,Perimeter;

	  void getWidth(){
		  Area= W*H;
		  return;
	  }
	  
	  void getHeight(){
		  Perimeter= (W+H)*2;
		  return;
	  }
	  
	  void Show(){
		  System.out.println("java.Rectangle[X="+ x + ",y=" + y + ",width="+ W + ",height="+H+"]");
		  System.out.println("Area = " + Area );
		  System.out.println("Perimeter =" + Perimeter);
		  System.out.println("     ");
	  }
	 }
	  
  


public class RectangleTester {
	   public static void main(String args []){
	    
		   Rect Rect1=new Rect();
		   Rect Rect2=new Rect();
		   Rect1.x=15;
		   Rect1.y=25;
		   Rect1.W=57;
		   Rect1.H=18;	
		   Rect2.x=0;
		   Rect2.y=12;
		   Rect2.W=60;
		   Rect2.H=47;		   
		   Rect1.getWidth();
		   Rect1.getHeight();
		   Rect2.getWidth();
		   Rect2.getHeight();		   
		   Rect1.Show();      
		   Rect2.Show();    
		   System.out.println("End of Output!");
	    
			   
   }
}

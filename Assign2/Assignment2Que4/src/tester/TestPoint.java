package tester;
import com.app.geometry.*;

public class TestPoint {

	public static void main(String[] args) 
	{
	  	Point2D p1=new Point2D(1,1);
	  	Point2D p2=new Point2D(2,2);
	  	boolean b= p1.isEqualTo(p2);
	  	if (b) 
	  	{
			System.out.println("point p1 and p2 are located at same point!!");
		}
	  	else
	  		p1.calDistance(p2);	
        
	}

}

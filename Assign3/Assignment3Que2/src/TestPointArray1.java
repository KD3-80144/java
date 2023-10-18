import java.util.Scanner;
import com.rutvikjavaprograms.Point2D;
public class TestPointArray1 
{

	public static void main(String[] args) 
	{
		
		int choice;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no. of points you want:");
		Point2D[] points=new Point2D[sc.nextInt()];
		for (int i=0;i<points.length;i++)
		{
			points[i]=new Point2D();
			points[i].accept();	
		}
		do
		{
			
			System.out.println("1. Display details of a specific point:");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. User i/p : 2 indices for the points , validate the indices");
			System.out.println("0. To Exit!!");
			choice=sc.nextInt();
			
			switch (choice) 
			{
			case 1:
				System.out.println("Enter the index :");
				int index=sc.nextInt();
				points[index].display();
				break;
			case 2:
				for(Point2D element:points)
					element.display();
				break;
			case 3:
				System.out.println("Enter start index and end index:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				if ((-1<a && a<points.length)&&(-1<b && b<points.length))
				{
					boolean result=points[a].equals(points[b]);
					if (result) 
					{
						System.out.println("Both the co-ordinates are equal!!!!");
					}
					else
						points[a].calDistance(points[b]);
						
				}
				else
					System.out.println("Enter valid indexes!!!");
				
			default:
				break;
			}
				
		} while (choice!=0);
	

	}

}

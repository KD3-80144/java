
public class DiamondFull
{

	public static void main(String[] args) 
	{
		int num=5;
		int count=1;
		for(int i=0;i<num;i++)
         {
			for(int k=num-i; k>0;k--)
			{
			  System.out.print(" ");
			}
			for(int j=0;j<count;j++)
	         {
		       System.out.print("* ");
	         }
			System.out.println("");
			count++;
       }
		

	}

}

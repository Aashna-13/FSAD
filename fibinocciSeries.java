package projectTwo;
import java.util.*;
public class fibinocciSeries 
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.print("Enter Number ");
		int n=a.nextInt();
		System.out.print("Fibinocci Series is: ");
		series(n);
		a.close();
	}
	public static void series(int n)
	{
		if(n<0) return;
		System.out.print("0 ");
		if(n==0) return;
		System.out.print("1 ");
		int n1=0,n2=1;
		while(n1+n2 <n)
		{
			int t=n1+n2;
			System.out.print(+t+" ");
			n1=n2;
			n2=t;
		}
	}
}

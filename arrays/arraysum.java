package arrays;
import java.util.Scanner;
public class arraysum {
public static void main(String args[])
{
	int i ,j,a,b,c,d;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number of rows");
	i=in.nextInt();
	System.out.println("enter the number of columns");
	j=in.nextInt();
	System.out.println("enter the values of first array");
	int first[][]=new int[i][j];
	for(a=0;a<i;a++)
	{
		for(b=0;b<j;b++){
			c=in.nextInt();
			first[a][b]=c;
			
		}
	
	}
	System.out.println("enter the values of second array");
	int second[][]=new int[i][j];
	for(a=0;a<i;a++)
	{
		for(b=0;b<j;b++){
			d=in.nextInt();
			second[a][b]=d;
			
		}
	
	}
	int sum[][]=new int[i][j];
	for(a=0;a<i;a++)
	{
		for(b=0;b<j;b++){
			sum[a][b]=first[a][b]+second[a][b];
			
		}
		
	
	}
	System.out.println("the sum is");
	for(a=0;a<i;a++)
	{
		for(b=0;b<j;b++){
			System.out.print(sum[a][b]+" ");
			
		}
		System.out.println();
		
	
	}
	
}
}

package arrays;

import java.util.Scanner;

public class twodarray {
	public static void main(String args[])
	{
		int i ,j,a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number of rows");
		i=in.nextInt();
		System.out.println("enter the number of columns");
		j=in.nextInt();
		System.out.println("enter the values");
		int first[][]=new int[i][j];
		for(a=0;a<i;a++)
		{
			for(b=0;b<j;b++){
				c=in.nextInt();
				first[a][b]=c;
				
			}
		
		}
		for(a=0;a<i;a++)
		{
			for(b=0;b<j;b++){
				System.out.print(first[a][b]+" ");
				
			}
			System.out.println();
		
		}
		
	}
}

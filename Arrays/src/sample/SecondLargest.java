package sample;

import java.util.Scanner;

public class SecondLargest
{

	public static void main(String args[])
	{
		
		SecondLargest obj = new SecondLargest();
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("The unsorted array is : ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + "\t");
		System.out.println();
		
		obj.sort(arr);
		
		System.out.println("The sorted array is : ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + "\t");
		System.out.println();
		
		System.out.println("Second Largest Element is =  :" + arr[1]);
		
		sc.close();
	}
	
	public void sort(int a[])
	{
		int n = a.length;
		for(int i = 0; i < n-1; i++)
		{
			int max_i = i;
			
			for(int j = i+1; j<n; j++)
				if(a[j]>a[max_i])
					max_i = j;

			int temp = a[max_i];
			a[max_i] = a[i];
			a[i] = temp;
		}
	}
}


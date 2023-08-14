package com.construction.main;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args)  

	{

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the total no of floors in the building: ");

		int n=sc.nextInt();

		int max=n;

		Queue<Integer> queue=new PriorityQueue<Integer>(MyComparator());

		int disks[]=new int[n];

		for(int i=0;i<n;i++)

		{
			System.out.println("Enter the floor size given on day-"+(i+1)+": ");

			disks[i]=sc.nextInt();

			queue.add(disks[i]);

			while(!queue.isEmpty() && queue.peek()==max)
			{
				System.out.print(queue.poll()+" ");
				max--;
			}
			System.out.println();
		}

	}

	private static Comparator<? super Integer> MyComparator() {
		// TODO Auto-generated method stub
		return null;
	}

}

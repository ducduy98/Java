package Bai3;

import java.util.Iterator;

public class main {
	public static void main(String args[]) {
		int i=1;
		int j=1;
		 while(i<=5)
		{
			 System.out.println(i+"-"+j);
			 j++;
			 if(j>10) 
				{
					j=1;
					i++;
				}
		}
		
	}
}

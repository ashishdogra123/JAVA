import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	private static Scanner dogra;
	 public static void main(String[] args) {
		 dogra = new Scanner(System.in);
		 System.out.print("Enter the length of the array ");
		 int size=dogra.nextInt();
		 int[] a=new int[size];
		 int big=0;
		 for(int i=0;i<size;i++)
		 {
			 System.out.print("a["+i+"] = ");
			 a[i]=dogra.nextInt();
			 int v=a[i];
			 if(v>big)
			 {
				 big=v;
			 }
		 }
		 System.out.print(+big+"\n");
		 countingSort(big,a);
		 for(int i=0;i<size;i++)
		 {
			 System.out.print("a["+i+"] = "+a[i]);
		 }
	 }
	 static void countingSort(int b,int[] a)
	 {
		 int[] c=new int[b+1];
		 for(int j=0;j<b+1;j++)
		 {
			 for(int i=0;i<a.length;i++)
			 {
				 if(a[i]==j)
				 {
					 c[j]+=1;
				 }
			 }
		 }
		 int l=0;
		 for(int j=0;j<b+1;j++)
		 {
			 if(c[j]!=0)
			 {
				 for(int k=0;k<c[j];k++)
				 {
					 a[l]=j;
					 l++;
				 }
			 }
		 }
	 }
}

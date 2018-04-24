
import java.util.Scanner;
public class Quicksort {
	private static Scanner dogra;
	public static void main(String[] args)
	{
		dogra=new Scanner(System.in);
		System.out.print("Enter the number of elements ");
		int n=dogra.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=dogra.nextInt();
		}
		int start=0;
		int end=n-1;
		quickSort(a,start,end);
		for(int i=0;i<n;i++)
		{
			System.out.print(+a[i]+" ");
		}
	}
	static void quickSort(int[]a,int start,int end)
	{
		if(start<end)
		{
			int pindex=partion(a,start,end);
			quickSort(a,start,pindex-1);
			quickSort(a,pindex+1,end);
		}
		
	}
	public static int partion(int[] a,int start,int end)
	{
		int pindex=0;
		for(int i=start+1;i<=end;i++)
		{
			pindex=end;
			int pivot=a[start];
			if(a[i]>=pivot)
			{
				int swap=a[i];
				a[i]=a[pindex];
				a[pindex]=swap;
				pindex--;
			}
		}
		int s=a[pindex];
		a[pindex]=a[start];
		a[start]=s;
		return pindex;
	}
}
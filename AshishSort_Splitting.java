import java.util.*;
public class AshishSort_Splitting {
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
		int[] b=new int[n];
		ashishSort(a,b,start,end);
		for(int i=0;i<n;i++)
		{
			System.out.print(+b[i]+" ");
		}
	}
	static void ashishSort(int[]a,int[] b,int start,int end)
	{
		int p;
		if(start<end)
		{
			p=ashishPartion(a,b,start,end);
			ashishSort(a,b,start,p-1);
			ashishSort(a,b,p+1,end);
		}
	}
	public static int ashishPartion(int[] a,int[] b,int start,int end)
	{
		int j=start;
		int k=end;
		int equal=a[start];
		for(int i=start+1;i<=end;i++)
		{
			if(a[i]<equal)
			{
				b[j]=a[i];
				j++;
			}
			else if(a[i]>equal)
			{
				b[k]=a[i];
				k--;
			}
		}
		b[j]=equal;
		for(int l=0;l<=end;l++)
		{
			a[l]=b[l];
		}
		return j;
	}
}

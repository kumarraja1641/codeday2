import java.util.*;
public class Movezeroend
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        for(int k=j;k<n;k++)
        {
            arr[k]=0;
        }
         movezero(arr);


        System.out.println("array after moving zeros to the end:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        
    }
    public static void movezero(int[] arr)
    {
        System.out.println("array before moving zeros to the end: " + Arrays.toString(arr));
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[j];
                
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        System.out.println("after moving zeros to the end: " + Arrays.toString(arr));
       
    }

}
import java.util.*;
public class Squresortarray {
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
        Arrysort(arr);
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
         
        Arrays.sort(arr);
        


        System.out.println("array after squaring and sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void Arrysort(int[] arr)
    {
        System.out.println("array before squaring and sorting: " + Arrays.toString(arr));
        int n=arr.length;
        int i=0,j=n-1;
        int[] result=new int[n];
        for(int id=n-1;id>=0;id--)
        {
            if(Math.abs(arr[i])>arr[j])
            {
                result[id]=arr[i]*arr[i];
                i++;
            }
            else
            {
                result[id]=arr[j]*arr[j];
                j--;
            }
        }
        System.out.println("after squaring and sorting: " + Arrays.toString(result));
    }
    
}

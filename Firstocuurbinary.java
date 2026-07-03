import java.util.*;
public class Firstocuurbinary {
    public static void main(String[] args)
    {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter thr target elemnt to be searched");
        int tg=sc.nextInt();

        int res=leftoccur(arr,tg);
        if(res==-1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("first occurence of element is at index: " + res);
        }


    }
    public static int leftoccur(int[] arr,int tg)
    {
        int l=0,r=arr.length-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==tg)
            {
               // ans=mid;
                r=mid-1;
            }
            else if(arr[mid]<tg)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        if(l<arr.length && arr[l]==tg)
        {
            return l;
        }
        else
        {
            return -1;
        }
    }
}

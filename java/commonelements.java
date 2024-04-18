import java.util.Arrays;

class commonelements
{
    public static void main(String[] args)
    {
     int arr[]={1,2,3,4,5,1,5,9};
     int arr1[]={2,1,7,5,8,9};
     int arr2[]=new int[6];
     int i,j,index=0;
     int c=0;
     int brr[]=new int[arr.length];
     for(i=0;i<arr.length;i++)
     {
        for(j=0;j<arr1.length;j++)
        {
            if(arr[i]==arr1[j])
            {
                c++;
                System.out.print(arr1[j]+" ");
                 //brr[index++]=arr1[j];
                // break;
            }
            j--;
            
        }
     }
//System.out.println(Arrays.toString(Arrays.copyOf(brr,brr.length-c)));
    }
}
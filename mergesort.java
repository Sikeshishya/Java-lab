
import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {

        int[] arr1={5,4,3,2,1};
        int[] arr2={6,7,8,9,10};
        Arrays.sort(arr1);
        int[] res=ans(arr1, arr2);
        System.out.println(Arrays.toString(res));
        
    }

    static int[] ans(int[] arr1,int[] arr2)
    {
        int i=0;
        int j=0;
        int k=0;
        int arr3[]=new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                arr3[k]=arr1[i];
                i++;
                k++;
            }

           else
            {
                arr3[k]=arr2[j];
                j++;
                k++;
            }


        }

        while(i<arr1.length)
        {
            arr3[k]=arr1[i];
                i++;
                k++;
        }

        while (j<arr2.length) {
            arr3[k]=arr2[j];
                j++;
                k++;
            
        }

        return arr3;
    }
}

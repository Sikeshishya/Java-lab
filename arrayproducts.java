
import java.util.Arrays;

public class arrayproducts {
    public static void main(String[] args) {
        int[] arr1={5,4,3,2,1};
        int[] arr2={5,4,3,2,1};

        int[] res=ans(arr1, arr2);
        System.out.println(Arrays.toString(res));
        
    }

    static int[] ans(int[] arr1,int[] arr2)
    {
        int[] product=new int[5];

        for(int i=0;i<arr1.length;i++)
        {
            product[i]=arr1[i]*arr2[i];
        }

        return product;
    }
}

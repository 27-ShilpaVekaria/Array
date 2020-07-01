import java.util.Arrays;

public class A4_EqualityOf2Arrays
{

        public static void main(String[] args) throws Exception
        {
            int[] a = {1,2,3,4,5,6};
            int[] a1 = {1,2,3,4,5,6};
            int[] a2 = {1,2,3,4};
            System.out.println("Is array 1 equal to array 2?? " + Arrays.equals(a, a1));
            System.out.println("Is array 1 equal to array 3?? " + Arrays.equals(a, a2));
        }


    }

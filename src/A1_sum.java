public class A1_sum
{


        public static void main(String[] args) {
            int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sum = 0;

            for (int i : a)
                sum += i;
            System.out.println("The sum is " + sum);
        }

}


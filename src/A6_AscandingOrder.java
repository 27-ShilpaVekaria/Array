import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class A6_AscandingOrder {
    public static void main(String[] args)
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}


   /* public static void main(String[] args) {

    }
        public static String matrixToString ( int[][] a){
            int m = a.length;
            int n = a[0].length;

            String tmp = "";
            System.out.println(tmp);

            for (int y = 0; y < m; y++) {
                for (int x = 0; x < n; x++) {
                    tmp = tmp + a[y][x] + " ";
                }
                tmp = tmp + "\n";
            }

            return tmp;

        }*/



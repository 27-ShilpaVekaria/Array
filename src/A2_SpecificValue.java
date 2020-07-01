public class A2_SpecificValue
{

        public static boolean contains(String[] a, String t) {
            for (String n : a) {
                if (t == n) {
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args) {
            String[] my_array1 = {
                    "Mango","Banana","Cherry","Orange"

            };
                   /* 1789, 2035, 1899, 1456, 2013,
                    1458, 2458, 1254, 1472, 2365,
                    1456, 2265, 1457, 2456};*/
            System.out.println(contains(my_array1, "Mango"));
            System.out.println(contains(my_array1, "Pinapple"));
        }

}

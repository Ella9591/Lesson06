public class Solution1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i)
        {
            for (int x = 5; x > i; --x)
                System.out.print(" ");
            for (int x = 1; x < 2 * i; ++x)
                System.out.print("*");
            System.out.println();
        }

    }

    /*

     *
    ***
   *****
  *******
 *********

     */
}

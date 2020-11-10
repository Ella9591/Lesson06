public class Romb {

    public static void main(String[] args) {
        int x = 11;
        int y = 11;

        for(int i = 0; i < x; i++) {

            for(int j = 0; j < y; j++) {

                if(j==y/2-i||j==y/2+i||j==i-y/2||j==x-i+x/2-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

       /*  System.out.println("Введите размер");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println();
        System.out.println("Ромб");

        int z = (num % 2 == 0) ? 2 : 1;
        int position = (num % 2 == 0) ? num / 2 - 1 : num / 2;

        boolean firstPart = true;

        for (int i = 0; i < num; i++) {

            int starCounter = 0;

            for (int j = 0; j < num; j++) {
                if (j == position || starCounter < z && starCounter != 0) {
                    System.out.print("*");
                    starCounter++;
                } else {
                    System.out.print(" ");
                }
            }

            if (firstPart) {
                z += 2;
                position--;
            } else {
                z -= 2;
                position++;
            }

            if (position == 0) {
                firstPart = false;
            }

            System.out.println();

        }
    }


        */
    /* отв реш 1

      *
     * *
    *   *
   *     *
  *       *
 *         *
  *       *
   *     *
    *   *
     * *
      *


     */
    /* отв реш 2

    Введите размер
       7

        Ромб
          *
         ***
        *****
       *******
        *****
         ***
          *

           */

}

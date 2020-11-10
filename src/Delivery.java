import java.util.Scanner;
public class Delivery {
    public static void main(String[] args){
      /*  Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f = 2;

        do {
            f *= num--;
        } while (num > 0);

        System.out.println("Количество возможных вариантов доставки товара - " + f); // 12

       */
        int c = 3;
        int f = 2;
        int counter = 2;
        do {
            f = f * counter;
            counter ++ ;
        } while (counter <= c);

        System.out.println("Количество возможных вариантов доставки товара - "  + f); //12

    }
}

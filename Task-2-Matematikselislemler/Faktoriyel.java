import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        System.out.println(sayi + "! = " + faktoriyel);
    }
}

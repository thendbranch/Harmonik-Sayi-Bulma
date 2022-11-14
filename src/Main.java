// https://app.patika.dev/
// https://app.patika.dev/thendbranch


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev :
            Java ile girilen sayının harmonik serisini bulan program yazacağız.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısını Giriniz : ");
        int sayi = input.nextInt();

        double toplam = 0.0;

        for (double i = 1; i <= sayi; i++) {
            toplam += (1/i);
        }
        System.out.println("Harmonik Değer : " + toplam);
    }
}
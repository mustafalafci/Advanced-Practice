package practiceAdvanced.practice06;

import java.util.Scanner;

public class Q01_RastgeleSayiMatriksi {
    /*

Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.

Input: 10

Output:
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0

*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int sayi = input.nextInt();


        for (int i = 0; i < sayi; i++) {
            for (int k = 0; k < sayi; k++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}

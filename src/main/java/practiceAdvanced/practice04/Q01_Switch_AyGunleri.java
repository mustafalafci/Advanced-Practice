package practiceAdvanced.practice04;

import java.util.Scanner;

public class Q01_Switch_AyGunleri {
    /*

Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
   Girdi yıl: 2000 ay: 2
   Çıktı: 29

*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Yili Giriniz");
        int yil = input.nextInt();
        System.out.println("Ay numarasini giriniz");
        int ay = input.nextInt();

        int gun;

        switch (ay){
            case 1: case 3:
            case 5: case 7:
            case 8: case 10:
            case 12:
                gun = 31;
                System.out.println("Girdiginiz ayin gun sayisi: "+gun);
                break;
            case 4: case 6:
            case 9: case 11:
                gun=30;
                System.out.println("Girdiginiz ayin gun sayisi: "+gun);
                break;
            case 2:
                if(((yil%4==0 && yil%100!=0) || yil%400==0)){
                    gun=29;
                    System.out.println("Girdiginiz ayin gun sayisi: "+gun);
                }else {
                    gun=28;
                    System.out.println("Girdiginiz ayin gun sayisi: "+gun);
                }
                break;
            default:
                System.out.println("Gecerli bir ay numarasi giriniz");

        }
    }
}
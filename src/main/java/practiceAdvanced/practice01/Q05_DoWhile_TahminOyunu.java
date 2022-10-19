package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {

    //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
    //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;
        int rastgeleSayi = (int)(Math.random()*100)+1;
        int sayac = 0;


        do {
            System.out.println("1-100 arası bir sayı tahmini giriniz");
            sayac++;

            sayi = input.nextInt();
            if(sayi==rastgeleSayi){
                System.out.println("Tebrikler!!");
            } else if (sayi<rastgeleSayi) {
                System.out.println("Daha büyük bir sayı giriniz");
                System.out.println(10-sayac+" hakkınız kaldı!");
            }else {
                System.out.println("Daha küçük bir sayı giriniz");
                System.out.println(10-sayac+" hakkınız kaldı!");
            }
            if(sayac==10){
                System.out.println("Hakkınız bitti oyunu kaybettiniz.\nTekrar oynamak için 1, çıkmak için herhangi bir sayı girin");
                int secenek = input.nextInt();
                if(secenek==1){
                    sayac = 0;
                    rastgeleSayi = (int)(Math.random()*100)+1;
                }else{
                    break;
                }
            }

        }while (sayi!=rastgeleSayi);
    }
}

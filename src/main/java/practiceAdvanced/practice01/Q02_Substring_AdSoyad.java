package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    public static void main(String[] args) {


    /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */
    Scanner input=new Scanner(System.in);
        System.out.println("Ad ve soyadınızı aralarında bir bosluk olacak sekilde giriniz.");
        String adSoyad = input.nextLine();
        String ad=adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyAd=adSoyad.substring(adSoyad.indexOf(" ")+1);

        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+soyAd);




}
}

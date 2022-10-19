package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {
    /*
       Q04_IfStatement_DikUcgen

        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı:

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
        Bu bir dik üçgendir

        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci Kenari giriniz: ");
        int birinciKenar= input.nextInt();
        System.out.println("Ikinci Kenari giriniz: ");
        int ikinciKenar= input.nextInt();
        System.out.println("Ucuncu Kenari giriniz: ");
        int ucuncuKenar= input.nextInt();

        if ((birinciKenar*birinciKenar) + (ikinciKenar*ikinciKenar)==ucuncuKenar*ucuncuKenar){
            System.out.println("Bu bir dik ucgendir");
        } else if (birinciKenar*birinciKenar + ucuncuKenar*ucuncuKenar==ikinciKenar*ikinciKenar) {
            System.out.println("Bu bir dik ucgendir");
        }else if (ikinciKenar*ikinciKenar + ucuncuKenar*ucuncuKenar==birinciKenar*birinciKenar) {
            System.out.println("Bu bir dik ucgendir");
        }else {
            System.out.println("Bu bir dik ucgen degildir");
        }

    }
}

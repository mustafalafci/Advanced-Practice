package practiceAdvanced.practice03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q04_DoWhile_TopunSicramasi {
    /*
    Bir top belirli yukseklikten atilmaktadir.(Scanner ile yuksekligi al)
    Atildiktan sonra, atildigi yuksekligin 1/4u kadar yerden yukari dogru zıplamaktadir.
    Top ziplama yuksekligi 1 metrenin altina indiginde durmaktadir.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayisini bulan do while code blogu create ediniz.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Birakilan yuksekligi gir : ");
        double yukseklik=input.nextDouble();
        double toplamYol=0;
        int vurmaSayisi=0;

        do {
                vurmaSayisi++;
                toplamYol+=yukseklik;
                yukseklik=yukseklik*0.75;
                toplamYol+=yukseklik;

        }while (yukseklik>1);
        System.out.println("vurma sayisi = "+vurmaSayisi);
        System.out.println("toplam yol= "+toplamYol);

        NumberFormat numberFormat=new DecimalFormat(".#");
        System.out.println(numberFormat.format(toplamYol));
    }
}

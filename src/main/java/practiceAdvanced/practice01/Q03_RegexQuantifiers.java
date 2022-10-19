package practiceAdvanced.practice01;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {
        //Bir String degerin belirli sayida karakter icerip belirli bir karakter ile bitip bitmedigini kontrol eden bir kod yaziniz.
        String str ="as";
        System.out.println(str.matches(".s")); //true==>herhangi bir karakter ile baslayip 's' harfi ile bitiyor.
        //matches() methodu regex ile calisip String degerin regex ile karsilastimasini yapar.
        System.out.println(str.matches("..s"));//false==> 3 karakterli olmadigi icin

        //Bir String degerin ikinci karakterinin belirli bir karakter olup olmadigini kontrol eden bir kod yaziniz.
        System.out.println("dsakfmalskfa".matches(".s.*"));

        //.* ==> esnek sayida karakter(0 yada daha fazla)
        System.out.println("asdaff".matches(".r.*"));//false ikinci karakter uyusmuyor

        //Bir String degerin sadece harf icerip icermedigini kontrol eden bir kod yaziniz.
        System.out.println("ca".matches("[a-zA-Z]*"));

        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.
        System.out.println("asdsd".matches("[a-zA-Z]{5}")); //true 5 karakterli ve hepsi de harf
        System.out.println("asdsdX".matches("[a-zA-Z]{5}")); // false 5ten fazla karakter iceriyor
        System.out.println("a1ssX".matches("[a-zA-Z]{5}")); // false harf dısında karakter iceriyor

        //Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("123456".matches("[0-9]{6,}")); //true ==> en az 6 rakam iceriyor.

        System.out.println("123456".matches("[0-9]{6,}")); //false==> 6'dan az karakter iceriyor.
        System.out.println("12345X".matches("[0-9]{6,}")); //false==> rakam disi karakter iceriyor.

        //Bir String degerin belirli karakterleri en az ve en cok belirli sayida icerip icermedigini kontrol eden bir kod yaziniz.
        System.out.println("abcd123xAc".matches("\\w{7,10}")); //true ==> en fazla 10 karakter(\\w) iceriyor.

        // \\w = [a-zA-Z0-9_]
        System.out.println("abcd123_".matches("\\w{7,10}")); //true ==> en az 7 karakter (\\w) iceriyor

        // ilk karakter 1,ikinci karakter noktalama isareti ve kalan 8 karakter rakam toplam 10 karakter olmali
        System.out.println("1?1234567".matches("[1][\\p{Punct}]{3}[0-9]{8}")); //true ==> tum kosullari sagliyor


    }
}

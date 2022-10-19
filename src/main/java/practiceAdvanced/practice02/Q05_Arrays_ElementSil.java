package practiceAdvanced.practice02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {
    /*
    Elementlerini kullanıcan alarak bir integer Array oluşturunuz.
    Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        for(int i=0; i<arr.length; i++){
            System.out.println("Giriniz: Indeks "+i);
            arr[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        //1. Yol
        System.out.println("Silmek istediğiniz indeksi giriniz");
        int removeIndex=input.nextInt();
        int idx = 0;
        int[] brr = new int[limit-1];
        for(int i=0; i<arr.length;i++){

            if(removeIndex!=i){
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
        //2. Yol
        List<Integer> numberList = new ArrayList<>();
        for (int w : arr){
            numberList.add(w);
        }
        System.out.println(numberList);
        System.out.println("Silmek istediğiniz elementin indeksini giriniz.");
        int silinecekIdx = input.nextInt();
        numberList.remove(silinecekIdx);//index ile siliyoruz
        System.out.println(numberList);
        System.out.println("Silmek istediğiniz elementi giriniz");
        numberList.remove(numberList.indexOf(input.nextInt()));//elementin indeksini alarak siliyoruz.
        System.out.println(numberList);

    }
}
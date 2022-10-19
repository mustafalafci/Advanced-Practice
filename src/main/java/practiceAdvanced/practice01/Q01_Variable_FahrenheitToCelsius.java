package practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {
    public static void main(String[] args) {
        // Fahrenheit degeri, Celcius degere ceviren kod yaziniz.
        // formul: c=(f-32)*5/9
        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz");

        double f = input.nextDouble();
        double c = (f-32)*5/9;
        System.out.println(c);

        NumberFormat numberFormat=new DecimalFormat(".00");
        String formatedC=numberFormat.format(c);
        System.out.println("formatedC= "+ formatedC+1); //Concatenation
        double doubleC =Double.valueOf(formatedC);
        System.out.println("doubleC= "+(doubleC+1)); //Matematik Islemi (+)

    }
}

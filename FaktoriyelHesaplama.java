import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        int sayi,faktoriyel=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        sayi = input.nextInt();

        if (sayi >0){
            for (int i = 1; i <= sayi;i+=1){
                faktoriyel *= i;
            }

            System.out.println("Girdiğiniz sayının faktöriyeli:"+faktoriyel);
        }else {
            System.out.println("Negatif bir sayı giremezsin.");
        }
    }
}

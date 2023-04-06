import java.util.Scanner;

public class RecursiveFonksiyonlaAsalSayiBulma {

    static void asalMi(){

        int sayac = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int n = input.nextInt();

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                sayac += 1;
            }
        }

        if (sayac == 0){
            System.out.println(n +" sayısı ASALDIR.");
        }else{
            System.out.println(n +" sayısı ASAL değildir.");
        }
    }



    public static void main(String[] args) {
        asalMi();
    }
}

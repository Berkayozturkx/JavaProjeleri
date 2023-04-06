import java.util.Scanner;

public class RecursiveFonksiyonlaUsAlma {

    static int usAlma(int tabanSayi,int us){
        int sonuc = 1;
        if (us == 0){
            return 1;
        }
        if (us == 1){
            return tabanSayi;
        }
        sonuc = tabanSayi*usAlma(tabanSayi,(us-1));
        return sonuc;
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak olan sayıyı giriniz:");
        int tabanSayi = input.nextInt();

        System.out.print("Girdiğiniz sayının kaçıncı kuvvetini almak istediğinizi giriniz:");
        int us = input.nextInt();

        int sonuc = usAlma(tabanSayi,us);
        System.out.println("Sonuç:" + sonuc);
    }
}

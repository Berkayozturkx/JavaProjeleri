import java.util.Scanner;

public class UsluSayiHesaplamaWHILE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sayi,us,i=1,sonuc=1;

        System.out.print("Üssünü alacağınız sayıyı giriniz:");
        sayi = input.nextInt();
        System.out.print(sayi +" sayısının kaçıncı kuvvetini almak istediğinizi giriniz:");
        us = input.nextInt();
        if (sayi >0 && us >= 0){
            while (i <= us){
                sonuc *=sayi;
                i +=1;
            }



        }else{
            System.out.println("Hatalı giriş yaptınız.");
        }
        System.out.println("Sonuç:"+sonuc);
    }
}

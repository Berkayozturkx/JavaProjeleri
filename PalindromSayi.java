import java.util.Scanner;

public class PalindromSayi {


    static boolean palindromMu(int sayi){
        int geciciSayi = sayi, tersSayi = 0,sonBasamak;

        while(geciciSayi != 0){
            sonBasamak = geciciSayi % 10;
            tersSayi = (tersSayi*10)+ sonBasamak;
            geciciSayi /= 10;
        }
        if (sayi == tersSayi){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int sayi = input.nextInt();

        if (palindromMu(sayi) == true){
            System.out.println(sayi+" bir palindrom sayıdır.");
        }else {
            System.out.println(sayi+" palindrom sayı değildir.");
        }

    }
}

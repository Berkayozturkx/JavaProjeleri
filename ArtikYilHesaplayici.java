import java.util.Scanner;

public class ArtikYilHesaplayici {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz:");
        yil = input.nextInt();

        if (yil > 0){
            if (yil%4 == 0 || yil%400 == 0){
                System.out.println(yil+" bir artık yıldır.");
            }else{
                System.out.println(yil+" bir artık yıl değildir.");
            }
        }else {
            System.out.println("Hatalı yıl girdiniz.");
        }
    }
}

import java.util.Scanner;

public class MaxVeMinDegerBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayiAdedi,max = 0,min = 0,sayi;

        System.out.print("Kaç tane sayı gireceksiniz:");
        sayiAdedi = input.nextInt();

        for (int i = 1; i <= sayiAdedi;i +=1){
            System.out.print(i+". Sayıyı giriniz:");
            sayi = input.nextInt();
            if (i == 1){
                min = sayi;
                max = sayi;
            }else {
                if (sayi > max){
                    max = sayi;
                }else {
                    min = sayi;
                }
            }
        }
        System.out.println("En büyük sayı:"+max);
        System.out.println("En küçük sayı:"+min);
    }
}

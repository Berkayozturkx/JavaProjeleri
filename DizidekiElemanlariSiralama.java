import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin kaç elemanlı olmasını istediğinizi giriniz:");
        int n = input.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz:");
            int sayi = input.nextInt();
            list[i] = sayi;
        }
        for (int i = 0; i < list.length; i++) {
            for (int k = 0; k < (list.length-1); k++) {
                int geciciSayi;
                if (list[k] > list[k+1]){
                    geciciSayi = list[k];
                    list[k] = list[k+1];
                    list[k+1] = geciciSayi;
                }
            }
        }

        System.out.print("Sıralama: ");
        for (int i = 0 ; i < list.length ; i++){
            System.out.print(list[i] + " ");
        }
    }

}

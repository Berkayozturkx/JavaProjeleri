import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        /*
        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü

        C(n,r) = n! / (r! * (n-r)!)
         */

        int N,r,fark;
        float sonuc,NFaktoriyel=1F,rFaktoriyel=1F,farkFaktoriyel=1F;
        Scanner input = new Scanner(System.in);

        System.out.println("Kombinasyon Hesaplama Programına Hoşgeldiniz.");

        System.out.print("Kümenin eleman sayısını giriniz:");
        N = input.nextInt();

        System.out.print("Kombinasyon oluşturulacak eleman sayısını giriniz:");
        r = input.nextInt();
        fark = (N-r);
        if (r <= N){
            for (int i = 1;i <= N; i +=1){
                NFaktoriyel = NFaktoriyel * i;
            }

            for (int j = 1; j<=r; j+=1){
                rFaktoriyel = rFaktoriyel * j;
            }

            for (int k = 1; k <= fark;k += 1){
                farkFaktoriyel = farkFaktoriyel * k;
            }
            sonuc = (NFaktoriyel)/(rFaktoriyel*farkFaktoriyel);
            System.out.println("Kombinasyon:"+sonuc);

        }else {
            System.out.println("Kombinasyon oluşturulucak eleman sayısı, kümenin eleman sayısından büyük olamaz.");
        }
    }
}

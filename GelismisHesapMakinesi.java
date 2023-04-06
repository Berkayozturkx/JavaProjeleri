import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int toplama(int sayi1,int sayi2){
        int toplam = sayi1+sayi2;
        System.out.println("Girilen sayıların toplamı: " + toplam);
        return toplam;
    }

    static int cikarma(int sayi1,int sayi2){
        int fark = 0;
        if (sayi1 > sayi2){
            fark = sayi1-sayi2;
        }else {
            fark = sayi2-sayi1;
        }
        System.out.println("Girilen sayıların farkı: "+ fark);
        return fark;
    }

    static int carpma(int sayi1,int sayi2){
        int carpim = sayi1*sayi2;
        System.out.println("Girilen sayıların çarpımı: "+ carpim);
        return carpim;
    }

    static double bolme(double bolunenSayi,double bolenSayi){
        if (bolenSayi == 0){
            return 0;
        }

        double bolum = bolunenSayi/bolenSayi;
        System.out.println("Girilen sayıların bölümü: " + bolum);
        return bolum;
    }

    static int usAlma(int tabanSayi,int us){
        int sonuc = 1;
        for (int i = 1 ; i <= us ; i++){
            sonuc *= tabanSayi;
        }
        System.out.println("Girilen" + tabanSayi + " sayısının "+ us +". kuvveti: "+ sonuc);
        return sonuc;
    }

    static int faktoriyel(int sayi){
        int faktoriyel = 1;
        for (int i = 1 ; i <= sayi ; i++){
            faktoriyel *= i;
        }
        System.out.println("Girilen sayının faktoriyeli: " + faktoriyel);
        return faktoriyel;
    }

    static int modAlma(int sayi,int modAlinacakSayi){
        int sonuc = 0;
        sonuc = sayi % modAlinacakSayi;
        System.out.println("Girilen " + sayi +"'nın " + modAlinacakSayi+ " modu:" + sonuc);
        return sonuc;
    }

    static int dikdortgenAlan(int kisaKenar,int uzunKenar){
        int alan;
        alan = kisaKenar*uzunKenar;
        System.out.println("Bilgileri girilen dikdörtgenin alanı: "+ alan);
        return alan;
    }

    static int dikdortgenCevre(int kisaKenar,int uzunKenar){
        int cevre;
        cevre = 2*(kisaKenar+uzunKenar);
        System.out.println("Bilgileri girilen dikdörtgenin çevresi: "+cevre);
        return cevre;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = "Hesap Makinesine Hoşgeldiniz.\n\n1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme\n5)Üs Alma\n6)Faktöriyel\n7)Mod Alma\n8)Dikdörtgen Alanı Hesaplama\n9)Dikdörtgen Çevresi Hesaplama\n0)Çıkış";
        System.out.println(menu);
        int secenek;

        while (true){
            System.out.print("Lütfen yapmak istediğiniz işlem numarasını giriniz: ");
            secenek = input.nextInt();

            if (secenek == 0){
                System.out.println("Hesap makinesinden başarıyla çıkış yapıldı.");
                break;
            }
            else {

                System.out.print("İlk sayıyı giriniz:");
                int sayi1 = input.nextInt();

                System.out.print("İkinci sayıyı giriniz:");
                int sayi2 = input.nextInt();


                switch (secenek){
                    case 1:
                        toplama(sayi1,sayi2);
                        break;

                    case 2:
                        cikarma(sayi1,sayi2);
                        break;

                    case 3:
                        carpma(sayi1,sayi2);
                        break;

                    case 4:
                        if (bolme(sayi1,sayi2) == 0){
                            System.out.println("Bölen sıfır olamaz. Sıfırdan farklı bir sayı giriniz.");
                        }else {
                            bolme(sayi1,sayi2);
                        }
                        break;

                    case 5:
                        usAlma(sayi1,sayi2);
                        break;

                    case 6:
                        faktoriyel(sayi1);
                        break;

                    case 7:
                        modAlma(sayi1,sayi2);
                        break;

                    case 8:
                        dikdortgenAlan(sayi1,sayi2);
                        break;

                    case 9:
                        dikdortgenCevre(sayi1,sayi2);
                        break;
                    case 0:
                        System.out.println("Hesap makinesinden başarıyla çıkış yapıldı.");
                        break;
                    default:
                        System.out.println("Yanlış işlem numarası girdiniz.");
                        break;
                }
            }


        }

    }
}

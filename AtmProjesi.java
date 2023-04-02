import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sistemTC = "32165498798", sistemSifre="2151";
        int bakiye = 15000;
        int secenek;
        int paraYatirma;
        int denemeHakki = 3;
        int paraCekme;

        while (denemeHakki >0){
            System.out.print("T.C. Kimlik Numaranızı Giriniz:");
            String TC = input.nextLine();

            System.out.print("Şifrenizi Giriniz:");
            String sifre = input.nextLine();

            if (sistemSifre.equals(sifre) && sistemTC.equals(TC)){
                System.out.println("Merhaba, Patika.dev Bankasına Hoşgeldiniz.");

                do{
                    System.out.print("1)Para Yatırma\n2)Para Çekme\n3)Bakiye Sorgulama\n4)Çıkış\nLütfen işlem seçiniz:");
                    secenek = input.nextInt();
                    if (secenek == 1){
                        System.out.print("Yatıracağınız para tutarını giriniz:");
                        paraYatirma = input.nextInt();
                        if (paraYatirma >0){
                            bakiye += paraYatirma;
                            System.out.println("Para Yatırma İşlemi Başarılı.");
                        }else{
                            System.out.println("Hatalı tutar girişi yaptınız.Tekrar Deneyiniz.");
                        }

                    } else if (secenek == 2) {
                        System.out.print("Çekeceğiniz para tutarını giriniz:");
                        paraCekme = input.nextInt();
                        if (paraCekme <=bakiye){
                            bakiye -= paraCekme;
                            System.out.println("Para Çekme İşlemi Başarılı.");
                        }else {
                            System.out.println("Hatalı tutar girişi yaptınız.Tekrar Deneyiniz.");
                        }
                    } else if (secenek == 3) {
                        System.out.println("Güncel Bakiye Tutarınız:"+bakiye);
                    } else if (secenek == 4) {
                        System.out.println("Başarıyla Çıkış Yapıldı.");
                        break;
                    }else{
                        System.out.println("Hatalı işlem numarası girişi yaptınız. Lütfen Tekrar Deneyiniz.");
                    }
                }while (secenek !=4);
                break;



            }else{
                denemeHakki--;
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");

                if (denemeHakki == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankayla iletişime geçin.");
                }else {
                    System.out.println("Kalan deneme hakkınız:"+denemeHakki);
                }
            }
        }
    }
}

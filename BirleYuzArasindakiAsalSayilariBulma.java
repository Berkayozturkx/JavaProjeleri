public class BirleYuzArasindakiAsalSayilariBulma {
    public static void main(String[] args){
        int sayi = 100;

        for (int i = 2; i <= sayi; i++) {


            boolean asal = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}

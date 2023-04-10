public class DizidekiElemanlarinFrekansiniBulma {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        int sayac = 0;
        for (int i = 0; i < list.length; i++) {
            for (int k = 0; k < list.length; k++) {
                if (list[i] == list[k]) {
                    if (k < i) {
                        break;
                    }
                    sayac++;
                }
            }
            if (sayac > 0) {
                System.out.println(list[i]+" sayısı "+ sayac + " kere tekrar edildi.");
                sayac = 0;
            }
        }
    }
}

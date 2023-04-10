public class CokluDizilerdeYildizlaHarfYazdirma {
    public static void main(String[] args) {
        String[][] matris = new String[7][4];

        for (int i = 0 ; i < matris.length ; i++){
            for (int k = 0 ; k < matris[i].length ; k++){
                if (i == 0 || i == 3 || i == 6){
                    matris[i][k] = " * ";
                }else if(k == 0 || k == 3){
                    matris[i][k] = " * ";
                }else {
                  matris[i][k] = "   ";
                }
            }
        }

        for (String[] row: matris){
            for (String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

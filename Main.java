public class Main {

    public static int minimumUretimSuresi(int[][] sureMat, int[][] gecisMaliyet) {
        int isAdedi = sureMat.length;
        int makineAdedi = sureMat[0].length;

        int[][] toplamMaliyet = new int[isAdedi][makineAdedi];

        for (int m = 0; m < makineAdedi; m++) {
            toplamMaliyet[0][m] = sureMat[0][m];
        }

        for (int i = 1; i < isAdedi; i++) {
            for (int j = 0; j < makineAdedi; j++) {
                int minMaliyet = Integer.MAX_VALUE;
                for (int k = 0; k < makineAdedi; k++) {
                    int gecis = toplamMaliyet[i - 1][k] + gecisMaliyet[k][j];
                    if (gecis < minMaliyet) {
                        minMaliyet = gecis;
                    }
                }
                toplamMaliyet[i][j] = minMaliyet + sureMat[i][j];
            }
        }

        int enKisaToplam = Integer.MAX_VALUE;
        for (int m = 0; m < makineAdedi; m++) {
            if (toplamMaliyet[isAdedi - 1][m] < enKisaToplam) {
                enKisaToplam = toplamMaliyet[isAdedi - 1][m];
            }
        }

        return enKisaToplam;
    }

    public static void main(String[] args) {
        int[][] isSureleri = {
                {8, 2, 10},
                {6, 7, 3},
                {1, 5, 6},
                {7, 4, 9}
        };

        int[][] makineGecis = {
                {0, 4, 5},
                {2, 3, 1},
                {5, 1, 0}
        };

        int sonuc = minimumUretimSuresi(isSureleri, makineGecis);
        System.out.println("Hesaplanan minimum üretim süresi: " + sonuc + " zaman birimi.");
    }
}

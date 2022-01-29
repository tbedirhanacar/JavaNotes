package interviewquestions;

    /*
            Bir e-ticaret siteniz var ve buradan yapılan son N siparişin kaydın tutmak istiyorsunuz. Şu işlemleri yapacak bir veri yapısı yazınız:

            - kaydet(siparis_id)
            - sondan(i), kayıtlı siparişler arasında sondan i. elemanı döndürür.
     */


import java.util.Arrays;

public class UnluAlgoritmaSorulari03 {

    static int n = 3;
    static int[] siparisListesi = new int[n];
    static int sonsSiparisIdx = -1;


    public static void main(String[] args) {
        kaydet(1402);
        System.out.println(sonsSiparisIdx);
        kaydet(1330);
        System.out.println(sonsSiparisIdx);
        kaydet(1453);
        System.out.println(sonsSiparisIdx);
        kaydet(1652);
        System.out.println(sonsSiparisIdx);
        kaydet(2356);
        System.out.println(sonsSiparisIdx);
        kaydet(3350);
        System.out.println(sonsSiparisIdx);
        kaydet(1472);
        System.out.println(sonsSiparisIdx);
        System.out.println(Arrays.toString(siparisListesi));
        sondan(1);
        sondan(2);
        sondan(4);
    }

    public static void kaydet(Integer siparisId) {
        int idx = sonsSiparisIdx < n-1 ? sonsSiparisIdx+1 : 0;
        siparisListesi[idx] = (siparisId);
        if (sonsSiparisIdx < (n-1)) {
            sonsSiparisIdx++;
        } else {
            sonsSiparisIdx = 0;
        }
    }

    public static void sondan(int i){
        if (i > n) {
            System.err.println("En fazla sondan " + n + ".siparişi görüntüleyebilirsiniz");
        } else {
            int idx = sonsSiparisIdx;
            int j = 1;
            while (j != i){
                if (idx == 0) {
                    idx = n-1;
                } else {
                    idx--;
                }
                j++;
            }
            System.out.println(siparisListesi[idx]);
        }
    }





}

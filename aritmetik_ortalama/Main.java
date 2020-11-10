package aritmetik_ortalama;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i <= 2000; i++) {
            if (i % 3 == 0 && i %5 == 0 && i % 7 == 0 && i % 53 == 0) {
                list.add(i);
            }
        }
        int toplam = 0;
        for(int j = 0 ; j <= list.toArray().length ;j++){

            toplam = toplam + j;
        }
        float aritmetik_ortama = toplam /  list.toArray().length;
        System.out.println(aritmetik_ortama);


    }
}

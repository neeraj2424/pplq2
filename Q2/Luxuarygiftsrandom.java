package pplq2;

/**
 * Created by root on 27/2/17.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Luxuarygiftsrandom {
    private static double price,value,l_rate,diff;
    public static ArrayList<Luxuarygifts> generator(){
        ArrayList<Luxuarygifts> l_giftsArrayList = new ArrayList<>(20);
        int i;

        for(i=0;i<10;i++){
            price = 1000 + (int)(Math.random() * 3000);
            value = 1000+ (int)(Math.random() * 3000);
            l_rate = 1000 + (int)(Math.random() * 3000);
            diff = 1000 + (int)(Math.random() * 3000);
            Luxuarygifts l = new Luxuarygifts(price,value,l_rate,diff);
            l_giftsArrayList.add(l);
        }
        Collections.sort(l_giftsArrayList, new MyPriceComp_lux());
        return l_giftsArrayList;
    }
}
class MyPriceComp_lux implements Comparator<Luxuarygifts> {
    public int compare(Luxuarygifts l1, Luxuarygifts l2) {
        if (l1.getPrice() > l2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}

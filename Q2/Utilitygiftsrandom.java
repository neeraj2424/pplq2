package pplq2;

/**
 * Created by root on 27/2/17.
 */

import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;

/**
 * Create
 */
public class Utilitygiftsrandom {
    private static double price,value,u_value,u_class;
    public static ArrayList<Utilitygifts> generator(){
        ArrayList<Utilitygifts> u_giftsArrayList = new ArrayList<>(20);
        int i;

        for(i=0;i<10;i++){
            price = 1000+ (int)(Math.random() * 3000);
            value = 1000 + (int)(Math.random() * 3000);
            u_value = 1000 + (int)(Math.random() * 3000);
            u_class = 1000 + (int)(Math.random() * 3000);

            Utilitygifts u = new Utilitygifts(price,value,u_value,u_class);
            u_giftsArrayList.add(u);
        }
        Collections.sort(u_giftsArrayList, new MyPriceComp_util());
        return u_giftsArrayList;
    }
}
class MyPriceComp_util implements Comparator<Utilitygifts> {
    public int compare(Utilitygifts u1, Utilitygifts u2) {
        if (u1.getPrice() > u2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}


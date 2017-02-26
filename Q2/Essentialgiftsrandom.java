package pplq2;

/**
 * Created by root on 27/2/17.
 */
import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;

public class Essentialgiftsrandom{
    private static double price,value;
    public static ArrayList<Essentialgifts> generator(){
        ArrayList<Essentialgifts> e_giftsArrayList = new ArrayList<>(20);
        int i;
        for(i=0;i<10;i++){
            price = 1000 + (int)(Math.random() * 3000);
            value = 1000+ (int)(Math.random() * 3000);
            Essentialgifts e = new Essentialgifts(price,value);
            e_giftsArrayList.add(e);
        }
        Collections.sort(e_giftsArrayList, new MyPriceComp_Ess());
        //System.out.println("Size of Essential Gift ArrayList " + e_giftsArrayList.size());
//        for(e_gifts e:e_giftsArrayList){
//            System.out.println((int)e.getPrice());
//        }
//        System.out.println();
        return e_giftsArrayList;
    }

}

class MyPriceComp_Ess implements Comparator<Essentialgifts> {
    public int compare(Essentialgifts e1, Essentialgifts e2) {
        if (e1.getPrice() > e2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}

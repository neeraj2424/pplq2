package pplq2;

/**
 * Created by root on 27/2/17.
 */
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public Main(ArrayList<Commited> couplesArrayList) throws FileNotFoundException {
        int count = 0;
        for(Commited couples:couplesArrayList ){
            couples.makeBasket();

        }
        CSVGifts csVgenerator_gift = new CSVGifts();
        csVgenerator_gift.generate(couplesArrayList);
        Collections.sort(couplesArrayList, new MyCouple_happy());
        int k = 10;
        System.out.println("K Most Happy Couples");
        for( Commited c: couplesArrayList){
            count++;
            System.out.println(c.getB_name()+" "+c.getG_name()+" "+c.happiness_couple());
            if(count == k){
                break;
            }
        }
        count = 0;
        System.out.println("");
        System.out.println("K Most Compatible Couples");
        Collections.sort(couplesArrayList, new MyCouple_Compatible());
        for( Commited c: couplesArrayList){
            count++;
            System.out.println(c.getB_name()+" "+c.getG_name()+" "+c.compat());
            if(count == k){
                break;
            }
        }
    }
}

class MyCouple_happy implements Comparator<Commited> {
    public int compare(Commited u1, Commited u2) {
        if (u1.happiness_couple() < u2.happiness_couple()) {
            return 1;
        } else {
            return -1;
        }
    }
}
class MyCouple_Compatible implements Comparator<Commited> {
    public int compare(Commited u1, Commited u2) {
        if (u1.compat() < u2.compat()) {
            return 1;
        } else {
            return -1;
        }
    }
}

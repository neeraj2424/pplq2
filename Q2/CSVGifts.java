package pplq2;

/**
 * Created by root on 27/2/17.
 */



import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.PrintWriter;
        import java.util.ArrayList;

public class CSVGifts {
    public void generate(ArrayList<Commited> arrayListcouples) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("Gift.csv"));
        StringBuilder sb = new StringBuilder();
        sb.append("Boy_Name");
        sb.append(',');
        sb.append("Boy_Budget");
        sb.append(',');
        sb.append("Boy_Type");
        sb.append(',');
        sb.append("Boy_Happiness");
        sb.append(',');
        sb.append("Girl_Name");
        sb.append(',');
        sb.append("Girl_Maintenece");
        sb.append(',');
        sb.append("Girl_Happiness");
        sb.append(',');
        sb.append("Ess_Gifts");
        sb.append(',');
        sb.append("Luxury_Gifts");
        sb.append(',');
        sb.append("Utility_Gifts");
        sb.append(',');
        sb.append("Couple_Happiness");
        sb.append(',');
        sb.append('\n');

        for (Commited couples : arrayListcouples) {
            sb.append(couples.getB_name());
            sb.append(',');
            sb.append(couples.getB_budget());
            sb.append(',');
            sb.append(couples.getBoy_c_type());
            sb.append(',');
            sb.append(couples.getB_happy_lvl());
            sb.append(',');
            sb.append(couples.getG_name());
            sb.append(',');
            sb.append(couples.getGirl_maint());
            sb.append(',');
            sb.append(couples.getG_happy_lvl());
            sb.append(',');
            sb.append('\n');
        }
        System.out.println("Size of Gifting ArrayList " + arrayListcouples.size());
        pw.write(sb.toString());
        pw.close();
        System.out.println("Gifts.csv Done!");
    }
}

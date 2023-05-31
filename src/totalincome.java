import java.lang.reflect.Parameter;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class totalincome {

    protected caculateManual d1 = new caculateManual();
    protected caculateAutomatic d2 = new caculateAutomatic();
    private int totincome = 0;
    private int totalcar = 0;

    public void totalincome(String startTime, String endTime) throws ParseException {
        Date e1=new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(startTime);
        Date e2=new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(endTime);
        for (int i = 0; i <caculateManual.manodate.size(); i++) {
            if (d1.manodate.get(i).compareTo(e1) >= 0 && d1.manodate.get(i).compareTo(e2) <= 0) {
                totalcar++;
                totincome = totincome + caculateManual.manoprice.get(i);
            }
        }
        for (int i = 0; i < caculateAutomatic.autodate.size(); i++) {
            if (d2.autodate.get(i).compareTo(e1) >= 0 && d2.autodate.get(i).compareTo(e2) <= 0) {
                totalcar++;
                totincome = totincome + caculateAutomatic.autoprice.get(i);
            }
        }
System.out.println("the total income is "+totincome+" and the total vehicles is "+totalcar);
    }
}

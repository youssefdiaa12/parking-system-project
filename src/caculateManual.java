import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class caculateManual {
    protected entryGate d1=new entryGate();
    protected owner d3=new owner();
    protected exitGate d2=new exitGate();
    protected Date leavetime;
protected long manualpayment=0;
    static List<Date> manodate = new ArrayList<>(100);
    static List<Integer> manoprice = new ArrayList<Integer>(100);
public long calculatepayment(String start,String leave) throws ParseException {
    Date e1=new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(leave);
    leavetime=e1;
    Date e2=new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(start);
    d1.time1=e2;
    if (d3.opengate()==true) {
        for (int i = 0; i <10; i++) {
            Date re=entryGate.arrivdate.get(i);
            if (re.compareTo(e2)==0){
                entryGate.arr[i]=0;
                manodate.add(leavetime);
                long difftime = e1.getTime() - e2.getTime();
                long diffinyears = TimeUnit.MILLISECONDS.toDays(difftime) / 3651;
                long diffInHours = (((e1.getTime() - e2.getTime()) / (1000 * 60 * 60)) % 24);
                long diffindays = ((e1.getTime() - e2.getTime()) / (1000 * 60 * 60 * 24) % 365);
                diffindays = diffindays * 24;
                diffinyears = diffinyears * 365;
                diffinyears = diffinyears * 24;
                long diffinmin=((e1.getTime()-e2.getTime())/(1000*60))%60;
                if (diffinmin>0){
                    diffinmin=1;
                }
                long totaltime = diffindays + diffinyears + diffInHours+diffinmin;
                manualpayment = totaltime * d1.price;
                manoprice.add((int) manualpayment);
                break;
            }
            if (i == 9) {
                return 0;
            }
        }
    }
    System.out.println("the leaving time is "+e1);
    System.out.println(" the price is "+manualpayment);
return manualpayment;
}


}

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class caculateAutomatic {
    protected entryGate d1=new entryGate();
public long payment;
protected Date leavetime;
protected String leavingtime;
   public static List<Date> autodate = new ArrayList<>(100);
   public static List<Integer>autoprice=new ArrayList<Integer>(100);
 public caculateAutomatic(){
    payment=0;
}
  public long calculatepayment(String r,String leave) throws ParseException {
     leavingtime=leave;
      Date e1 = new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(leave);
      leavetime = e1;
      Date r1 = new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(r);
      d1.time1 = r1;

      autodate.add(leavetime);
      /*  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime1 = LocalDateTime .parse( d1.timing,formatter);
        LocalDateTime dateTime2 = LocalDateTime .parse(leave,formatter);*/
      long difftime = e1.getTime() - r1.getTime();
      for (int i = 0; i <entryGate.arrivdate.size(); i++) {
          Date re=entryGate.arrivdate.get(i);
          if (re.compareTo(r1)==0) {
              entryGate.arr[i]=0;
              if (difftime > 0) {
                  long diffinyears = TimeUnit.MILLISECONDS.toDays(difftime) / 3651;
                  long diffInHours = (((e1.getTime() - r1.getTime()) / (1000 * 60 * 60)) % 24);
                  long diffindays = ((e1.getTime() - r1.getTime()) / (1000 * 60 * 60 * 24) % 365);
                  long diffinmin=(((e1.getTime()-r1.getTime())/(1000*60))%60);
                  diffindays = diffindays * 24;
                  diffinyears = diffinyears * 365;
                  diffinyears = diffinyears * 24;
                  if (diffinmin>0){
                      diffinmin=1;
                  }
                  long totaltime = diffindays + diffinyears + diffInHours+diffinmin;
                  payment = (int) totaltime * d1.price;
                  autoprice.add((int) payment);
                  System.out.println("the leaving time is "+e1);
                  System.out.println("the price is " + payment);
                  break;
              }
              else {System.out.println("there is a mistake in the date, please check the system ");
               System.exit(0);}
          }
              if (i == 9) {
                  return 0;
              }
          }
          return payment;
      }
      public long getpayment () {
          return payment;
      }
}

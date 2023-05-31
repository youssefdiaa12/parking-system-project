import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

//The entr_gate extends from the class parking_function
public class entryGate {
    public Date time1;
    public String timing;
    private static int count = 0;
    protected static int price = 5;
    protected double diff=0;
    static List<Integer> width_car = new ArrayList<>(10);
    static List<Integer> depth_car = new ArrayList<>(10);
    static List<Date> arrivdate = new ArrayList<Date>(10);
    static int[] arr = new int[10];
    protected parking_functtion d1 = new parking_functtion();

    //default constrctor
    public void parkin(String time, int wid, double dep) throws ParseException {
        timing = time;

        Date e1 = new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(time);
        time1 = e1;
        //choosing which configuration to be choosed randomly
        Random rand3 = new Random();
        int max1 = 2;
        int randm5 = rand3.nextInt(max1);
        if (randm5 == 1) {
            //first configuration is talking about most suitable slot
            if (count <= 10) {
                double mini = 1000;
                int idx = -1;
                for (int i = 0; i < 10; i++) {
                    if (arr[i] != 1) {
                        int w1 = width_car.get(i) - wid;
                        double d1 = depth_car.get(i) - dep;
                        if (w1 >= 0 && d1 >= 0) {
                            if (mini > (d1 + w1)) {
                                idx = i;
                                mini = Math.min(mini, (d1 + w1));
                            }
                        }

                    }
                    if (i == 9) {
                        if (mini == 1000) {
                            System.out.println("the parking has no suitable spaces ");
                        } else {
                            arr[idx] = 1;
                            arrivdate.set(idx,e1);
                            diff=width_car.get(idx)-wid;
                            System.out.println(e1);
                            break;
                        }
                    }
                }
            }
        } else {
            //second configuration talking about first empty slot
            if (count <= 10) {
                for (int j = 0; j < 10; j++) {
                    int w = width_car.get(j) - wid;
                    double d = depth_car.get(j) - dep;
                    if (arr[j] != 1 && w >= 0 && d >= 0) {
                        arr[j] = 1;
                        arrivdate.set(j,e1);
                        System.out.println("the arriving time is " + time1);
                        break;
                    }
                }
            } else {
                System.out.println("the parking is not empty");
            }
        }
    }
}
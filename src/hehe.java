import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Date;

public  class hehe {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner input = new Scanner(System.in);
        InputStreamReader inputstr = new InputStreamReader(System.in);
        BufferedReader bi = new BufferedReader(inputstr);
        //creating length and width slots randomly
        Random rand = new Random();
        Random rand1 = new Random();
        int max = 22;
        int mx = 20;
        Date e1=new SimpleDateFormat("dd-MM-yyyy hh:mm").parse("00-00-0000 00:00");
        //starting to for loop in each slot to give it his size
        for (int i = 0; i < 10; i++) {
            int randm = rand.nextInt(max);
            int randm1 = rand1.nextInt(mx);
            entryGate.width_car.add(randm);
            entryGate.depth_car.add(randm1);
            entryGate.arrivdate.add(i,e1);
        }
        int wid;
        double dep;
        parking_functtion h = new parking_functtion();
        entryGate t = new entryGate();
        exitGate exit=new exitGate();
        caculateAutomatic calc=new caculateAutomatic();
        car caro=new car();
        wid = input.nextInt();
        dep = input.nextDouble();
        int model=input.nextInt();
        String carmod= bi.readLine();
        caro.cardetails(dep,wid,model,carmod);
        System.out.println("the arriving time is ");
        String d= bi.readLine();
        t.parkin(d, wid,dep);
        h.display();
        calc.calculatepayment(d,"18-07-2001 20:20");
        exit.parkout();
        motorcycle motor=new motorcycle();
        int q6;
        double m1;
        m1 = input.nextDouble();
        q6 = input.nextInt();
        String model2= bi.readLine();
        motor.motordetails(m1,q6,model2);
        parking_functtion h1 = new parking_functtion();
        entryGate t1 = new entryGate();
        exitGate exit1=new exitGate();
        caculateManual calc1=new caculateManual();
        totalincome tot=new totalincome();
        owner ana=new owner();
        System.out.println("the arriving time is ");
        String t100 = bi.readLine();
        t1.parkin(t100,1,m1);
        exit1.parkout();
        ana.opengate();
        h1.display();
        calc1.calculatepayment(t100,"10-11-2002 23:20");
        tot.totalincome("26-03-2000 21:35","30-03-2003 21:35");
  /*int[][] v=new int[7][3];
  cin(v,6);*/
    }

/*
    public static void cout(int[][] x, int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }

    public static void cin(int[][] x, int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                x[i][j] = input.nextInt();}
        }
    }*/
}





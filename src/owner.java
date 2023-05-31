public class owner {
    protected exitGate d3=new exitGate();
protected caculateAutomatic d4=new caculateAutomatic();
    protected boolean securitywork;
   public boolean opengate(){
       if (d3.parkout() == true) {
       securitywork=false;}
        else{
        securitywork=true;}
    return securitywork;}

}

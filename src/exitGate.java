public class exitGate {
    protected caculateAutomatic d1=new caculateAutomatic();
    protected  boolean work;
    public boolean parkout() {
            if (d1.getpayment() != 0) {
                work = true;
                return true;
            } else {
                work = false;
                return false;
            }
        }


}

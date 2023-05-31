public class car extends vehicle{
    private int width;
   public car(){
        System.out.println("please enter car details: depth,width,car model,model name");
        id++;
    }
    @Override
    public double getDepth(double dep) {
        depth=dep;
        return depth;
    }
    @Override
    public int getModel(int mo) {
       model=mo;
        return model;
    }

    @Override
    public String getModelName(String Name) {
        modelName=Name;
        return modelName;
    }

    public int getWidth(int wid) {
        width=wid;
        return width;
    }
public void cardetails(double dep,int wid,int mod,String carmod){
       System.out.println("the car depth is "+dep);
    System.out.println("the car width is "+wid);
    System.out.println("your car ID is "+id);
    System.out.println("the car model is "+carmod);
    depth=dep;
    width=wid;
    model=mod;
    modelName=carmod;

}
}

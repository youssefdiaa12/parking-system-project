public class motorcycle extends vehicle{
          motorcycle(){ System.out.println("please enter motorcycle details: depth,motor model,model name");
          id++;}
    @Override
    public double getDepth(double dep) {
        return depth;
    }
    @Override
    public int getModel(int mo) {
        return model;
    }

    @Override
    public String getModelName(String Name) {
        return modelName;
    }
    public void motordetails(double dep,int mod,String motormod){
        System.out.println("the motorcycle depth is "+dep);
        System.out.println("your motorcycle ID is "+id);
        System.out.println("the motorcycle year is "+mod);
        System.out.println("the motorcycle model is "+motormod);
        depth=dep;
        model=mod;
        modelName=motormod;
    }
}

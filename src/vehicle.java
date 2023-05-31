public   abstract class vehicle {
    protected parking_functtion d6=new parking_functtion();
    double depth;
    int model;
    String modelName;
    static int id=0;
    public abstract double getDepth(double dep);
    public abstract int getModel(int mo);
    public abstract String getModelName(String Name);

}

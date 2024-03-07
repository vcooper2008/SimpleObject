public class SimpleObject {
    private String objectType;
    private Double area;

    //Default Constructor
    public SimpleObject() {
        objectType = "polygon";
        area = 0.0;
    }

    //Parameterized Constructor
    public SimpleObject(String obj, Double area) {
        this.objectType = obj;
        this.area = area;
    }

    public void updateObject(String obj, Double area) {
        this.objectType = obj;
        this.area = area;
    }

    public void printObject() {
        System.out.println("This is a " + this.objectType + " with an area of " + this.area);
    }

}

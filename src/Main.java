import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<SimpleObject> simpleObjs = new ArrayList<SimpleObject>();

        System.out.println("Howdy folks! Enter the type and area of your new object.");
        String obj = input.nextLine();
        Double area = input.nextDouble();

        SimpleObject userDefinedObj = new SimpleObject(obj, area); //use parameterized constructor
        simpleObjs.add(userDefinedObj); //add to inventory

        SimpleObject defaultObj = new SimpleObject(); //uses default constructor
        simpleObjs.add(defaultObj); //add to inventory

        SimpleObject finalObj = new SimpleObject("Rectangle", 25.0); //uses parameterized constructor
        simpleObjs.add(finalObj); //add to inventory

        System.out.println("I currently have " + simpleObjs.size() + " in inventory!");
        //Print the objects
        for(SimpleObject o : simpleObjs) {
            o.printObject();
        }


    }
}

import java.lang.reflect.*;
public class Reflection {
    private int value; 
    
    // Constructor 
    public Reflection(){
        this.value = 10;
    }

    private void pvtMethod(){
        System.out.println("I am a private method");
    }

    public static void main(String [] args ) throws Exception {
        // crete an object 
        Reflection obj = new Reflection();

        // get Class 
        Class cls = obj.getClass();

        // access constructor 
        Constructor cns = cls.getConstructor();
        System.out.println("Constructor name = " + cns.getName());

        // access private field 
        Field f = cls.getDeclaredField("value");
        // since it is private set accessible 
        f.setAccessible(true);
        // change the value 
        f.set(obj, 99);

        // access private method 
        Method pvt = cls.getDeclaredMethod("pvtMethod");
        // set accessible true 
        pvt.setAccessible(true);
        // invoke the method
        pvt.invoke(obj);
    }
}

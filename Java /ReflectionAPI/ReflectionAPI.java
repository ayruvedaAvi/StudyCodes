

import java.lang.reflect.*;

public class ReflectionAPI {
    private int data;
    public ReflectionAPI(){
        this.data=20;
    }
    private void funCtion(){
        System.out.println("THIS IS A: "+data);
    }
    public static void main(String [] args) throws Exception{
        ReflectionAPI r=new ReflectionAPI();
        r.funCtion();
        Class obj=r.getClass();
        Constructor c= obj.getConstructor();
        System.out.println("Name of cons: "+c.getName());
        Field f=obj.getDeclaredField("data");
        f.setAccessible(true);
        f.set(r, 30);
        Method m=obj.getDeclaredMethod("funCtion");
        m.setAccessible(true);
        m.invoke(r);
    }
}

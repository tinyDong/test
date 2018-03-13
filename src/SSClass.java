import org.junit.Test;

public class SSClass{
    static{
        System.out.println("SSClass");
    }
}

 class SClass extends SSClass{
    static{
        System.out.println("SClass init!");
    }

    public final static int value = 123;

    public SClass(){
        System.out.println("init SClass");
    }
}

 class SubClass extends SClass{
    static{
        System.out.println("SubClass init");
    }

    static int a;

    public SubClass(){
        System.out.println("init SubClass");
    }


     public static void main(String[] args) {
         System.out.println(SClass.value);
     }

 }


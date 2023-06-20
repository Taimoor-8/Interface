import java.util.Scanner;
class base {
    int a;

    public base() {
        System.out.println("This is base constructor");
    }

    public base(int a) {
        System.out.println("This is base constructor with value of a " + a);
    }
}
    class derived extends base{
        public derived(){
            System.out.println("Ths is a derived constructor");
        }
        int b;
        public derived(int a,int b){
            super(a);
            System.out.println("This is derived constructor with value of b "+b);
        }
    }
    class dderived extends derived{
        public dderived(){
            System.out.println("This is derived derived constructor");
        }
        int c;
        public dderived(int a,int b,int c){
            super(a,b);
            System.out.println("This is derived derived class with value of C "+c);
        }
    }

public class Inheritence {

    public static void main(String[] args) {
//        base b = new base(56);
//        derived d = new derived();
          dderived dd = new dderived();
    }
}

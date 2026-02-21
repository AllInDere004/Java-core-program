
class B{
    int x,y;
    B(int a,int b){     // parameterized constructor
        x=a;
        y=b;
    }
    void display(){
        System.out.println(x+" "+y);
    }
}
public class Parameterized {
    public static void main(String[] args) {
        B ob=new B(10,20);
        ob.display();
    }
}

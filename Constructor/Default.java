
class A {
    int a;String name;boolean c;
    A(){
        a=2004;
        name="Soumalya Dere";
        c=true;
    }
    void display(){
        System.out.println(a+" "+name+" "+c);
    }
    
}
public class Default {
    public static void main(String[] args) {
        A ob=new A();
        ob.display();
    }
    
}

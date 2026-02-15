//package Interface;

interface Abc{
    void add();
}
interface Xyz extends Abc{
    void sub();
}
class pc implements Xyz{
    public void add(){
        int a=10,b=5,c;
        c=a+b;
        System.out.println("Addition: "+c);
    }
    public void sub(){
        int a=20,b=15,c;
        c=a-b;
        System.out.println("Subtraction: "+c);
    }
}
class Extending_Interface {
    public static void main(String[] args) {
        Xyz obj=new pc();
        obj.add();
        obj.sub();
    }
}

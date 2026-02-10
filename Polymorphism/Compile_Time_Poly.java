package Polymorphism;
public class Compile_Time_Poly {
    void add(){
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y){
        int c;
        c=x+y;
        System.out.println(c);
    }    
    void add(int x,double y){
        double c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Compile_Time_Poly r=new Compile_Time_Poly();
        r.add();
        r.add(20,30);
        r.add(20,30.2564);
    }
}

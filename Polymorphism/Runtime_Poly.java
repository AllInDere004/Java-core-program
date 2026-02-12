package Polymorphism;
class Shape {
    void draw(){
        System.out.println("Cananot Say Shape type");
    }
}
class Square extends Shape {
    // void draw2(){
    //     System.out.println("Square Shape");
    // }
    void draw(){
        super.draw();  // Use to override the method overriding
        System.out.println("Duplicate Square Shape");
    }
}
class Runtime_Poly {
    public static void main(String[] args) {
        Shape r=new Square();
        r.draw();               /* If super and sub Class both have same method as name and parameters then 
                                    sub Class method will be called. if method name not same then
                                    super Class method will be called */

    }
}

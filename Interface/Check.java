// package Interface;  
/* Use of this package can create an error in the time of compilation.
So, when we run at the turminal then we should have to run as 
javac Interface(packagename)/Check(Main classs).java
java Interface.Check */

interface CustomerKanka {
    int amt=20;
    public abstract void purchase();
}
class  SellerSD implements CustomerKanka{
    public void purchase(){
        //amt=10;
        System.out.println("Kanka needs "+ amt + " kg rice.");
    }
}
class Check {
    public static void main(String[] args) {
        CustomerKanka obj = new SellerSD();
        obj.purchase();
        System.out.println(CustomerKanka.amt);  //static
    }
    
}

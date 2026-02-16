
import java.util.Scanner;

interface Client {
    void input();
    void output();
} 
class Interface_ex1 implements Client{
    String name;
    double salary;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        name=sc.nextLine();         // It takes string as a sentence
        System.out.println("Enter Salary: ");
        salary=sc.nextDouble();
    }

    public void output(){
        System.out.println(name+" "+salary);
    }

    public static void main(String[] args) {
        Client obj =new Interface_ex1();
        
        obj.input();
        obj.output();
    }
}

//package Interface;

interface Clients {
    void webdesign();
    void webdevelopment();
}
abstract class XYZPvt implements Client{
    public void webdesign(){
        System.out.println("Red Background, top menu, verification");
    }
}
class PointerEdu extends XYZPvt{
    public void webdevelopment(){
        System.out.println("Html, Css, Js");
    }
}
public class interface_with_inherit {
    public static void main(String[] args) {
        PointerEdu pc=new PointerEdu();

        pc.webdesign();
        pc.webdevelopment();
    }
}

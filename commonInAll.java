import java.util.*;

class CommonInAll
{
    String sim = "";
    boolean headphoneJack = false;
    
    CommonInAll(String sim, boolean headphoneJack)
    {
        this.sim=sim;
        this.headphoneJack=headphoneJack;
    }
    
    public void call()
    {
        System.out.println("CALLING");
    }
    
    public void text()
    {
        System.out.println("TEXT SENT !");
    }
    
}

class iphone12 extends CommonInAll
{
    iphone12(){
    super("micro",false);
    }
    
    void browser()
    {
        System.out.println("Open safari");
    }
    
    void openCam()
    {
        System.out.println("camera on");
    }
    
}

class s21 extends CommonInAll
{
    s21(){
    super("nano",true);
    }
    
    void browser()
    {
        System.out.println("Open galaxy");
    }
    
    void openCam()
    {
        System.out.println("camera on");
    }
}

class nokia3310 extends CommonInAll
{
    nokia3310(){
    super("regular",true);
    }
}

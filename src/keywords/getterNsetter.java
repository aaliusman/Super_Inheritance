package keywords;

public class getterNsetter {
    public double Interst ;
   public int monPay ;
    public String town ;

    public double getInterst() {
        return Interst;
    }
    public void setInterst(double a, double b){
        this.Interst = a*b;

    }

    public int getMonPay(){
        return monPay;
    }
    public void setMonPay(int a, int b){
        this.monPay = a+b;
    }

    public String getTown(){
        return town;

    }

    public void setTown(String a){
        this.town = a;
    }

    public static void test(){
      // String a= "This a test for static method";
        System.out.println("This a test for static method");
    }
}

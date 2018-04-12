package keywords;

public class getNsetTest extends getterNsetter{
    public static void main(String[] args) {

        getterNsetter gs = new getterNsetter();

        gs.setInterst(.04, .4);
        gs.setTown("Langhorne");
        gs.setMonPay(345, 200);

        System.out.println( gs.getMonPay());

        System.out.println(gs.getInterst());
        System.out.println(gs.getTown());

        test();

        getNsetTest gn = new getNsetTest();
        gn.tes();


    }
    public static void test(){
        System.out.println("this is subclass/child class");
    }
    public void tes(){
        super.test();
    }
}

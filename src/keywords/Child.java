package keywords;

public class Child extends Father {
    String name = "Burhan";

    public void Child() {

    }

    public Child() {
        // super(56);
        super("Software Testing");

    }


    public void Naam() {
        String ab = super.name;
        System.out.println(ab);
        System.out.println(name);
    }

    public void ITfield() {
        System.out.println("QA Analyst");
        super.ITfield();

    }
}
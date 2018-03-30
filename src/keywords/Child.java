package keywords;

public class Child extends Father{

    public void Child(){

    }

    public Child() {
        super(34);
    }

    public void Naam(){
       String ab = super.name;
        System.out.println(ab);
    }
}

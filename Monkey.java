package polymorphism;

public class Monkey extends Pet {


    @Override
    public void setFood(String food) {
        System.out.println("bananas");
    }

    @Override
    public String speak() {
        System.out.print("oo-oo-Ahh-Ahh");
        return "";
    }

    public Monkey(String name, String food) {
        super(name, food);













    }
}

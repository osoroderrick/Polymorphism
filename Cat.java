package polymorphism;

public class Cat extends Pet {


    @Override
    public String speak() {
        System.out.print("Meowww");
        return "";
    }

    @Override
    public void setFood(String food) {
        System.out.println("catfood");
    }

    public Cat(String name, String food) {
        super(name,  food);










    }
}

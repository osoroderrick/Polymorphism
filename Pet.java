package polymorphism;

public class Pet {
    public String name;

   public String food;


    public Pet(String name, String food) {
        this.name = name;

        this.food = food;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String speak(){
        System.out.print("Nature sounds");
        return "";
    }



}


package polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static String animalDiet (Pet [] pet) {
        for (int i = 0; i < pet.length; i++){
            if (pet[i] instanceof Cat){
                System.out.println(pet[i].getFood());
            }else if(pet[i] instanceof Dog){
                System.out.println(pet[i].getFood());

            }else if (pet[i] instanceof Monkey){
                System.out.println(pet[i].getFood());
            }
        }
        return " ";
    }
    public static void main(String[] args) {
        Scanner askUser = new Scanner(System.in);
        System.out.println("How many pets do you have?:");
        int numbOfPets = askUser.nextInt();
        ArrayList<String> petKind = new ArrayList<>();
        ArrayList<String> petName = new ArrayList<String>();

        Scanner petScan = new Scanner(System.in);
        for (int i = 0; i < numbOfPets; i++) {
            System.out.println("What kind of pet do you have,Dog,Cat, or Monkeys?:" );
            petKind.add(petScan.nextLine());
            System.out.println("What's their name?:");
            petName.add(petScan.nextLine());

        }
        for (int x = 0; x < petName.size(); x++){
            if (petKind.get(x).equalsIgnoreCase("cat")){
               Pet  c = new Cat(petName.get(x),"catfood");
                System.out.println("          ");
                System.out.println(c.speak() + " : " + c.getName());


            } else if (petKind.get(x).equalsIgnoreCase("Monkey")) {
                Pet m = new Monkey(petName.get(x),"bananas");
                System.out.println("          ");
                System.out.println(m.speak() + " : " + m.getName());

            } else if (petKind.get(x).equalsIgnoreCase("dog")){
                Pet d = new Dog(petName.get(x),"dogfood");
                System.out.println("          ");
                System.out.println(d.speak() + " : " + d.getName());

            }

        }
        Pet [] pet = new Pet[3];
        Dog d = new Dog("Dougie", "dogfood");
        Cat c = new Cat("Cathy", "catfood");
        Monkey m = new Monkey("Mark", "bananas");

        pet[0] = d;
        pet[1] = c;
        pet[2]= m;

        System.out.println(animalDiet(pet));

    }

}






package homework_8;

public class Main {


    public static void main (String[] args) {
                Animal dog = new Dog (" Сеня ");
                Animal tiger = new Tiger (" Полосатик ");
                Animal rabbit = new Rabbit (" Снежок ");

                dog.voice();
                tiger.voice();
                rabbit.voice();

        System.out.println("------ Кормление ------");

        dog.eat("Meat");
        tiger.eat("Meat");
        rabbit.eat("Grass");

        dog.eat("Grass");
        tiger.eat("Grass");
        rabbit.eat("Meat");
    }
}

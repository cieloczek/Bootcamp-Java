package LambdaTest;

public class LambdaTest {
    public static void main(String[] args) {
        Fox fox = new Fox();
        fox.getSound("rata tata ta ta ta");

        Animal dog = new Animal() {
            @Override
            public void getSound(String input) {
                System.out.println("woof woof woof wof" + input);
            }
        };
        dog.getSound("aaaa");


        Animal cat;
        cat = (s) -> System.out.println("meow "+ s);

        cat.getSound(" im dyyiiing");

    }

}

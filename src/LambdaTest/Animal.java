package LambdaTest;
@FunctionalInterface
public interface Animal {
    void getSound(String input);

    default void getLook() {

    }
}

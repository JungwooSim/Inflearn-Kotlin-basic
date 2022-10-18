package study.lec10.ja;

public interface JavaFlyable {

    default void act() {
        System.out.println("파닥 파닥");
    }
}

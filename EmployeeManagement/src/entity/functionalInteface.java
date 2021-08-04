package entity;

@FunctionalInterface
public interface functionalInteface {

    static void draw() {
        System.out.println("hi");
    }

    default void di(){
        System.out.println("di choi");
    }

    void an();


}

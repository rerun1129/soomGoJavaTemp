package chapter08._01_interface;

public interface Implementable1 {
    void needImpl();
    default void needNotImpl(){
        System.out.println ( "nope!" );
    }
    void needImplDiff();
}

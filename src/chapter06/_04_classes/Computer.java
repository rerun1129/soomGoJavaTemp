package chapter06._04_classes;

public class Computer extends Machine{

    public Computer ( String color, int size ) {
        super ( color, size );
    }

    @Override
    public void machineName ( ) {
        System.out.println ( "컴퓨터" );
    }
}

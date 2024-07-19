package chapter09._01_inner;

public class OuterStatic {
    String outerField = "Outer-field";
    void method() {
        System.out.println ( "Outer-method" );
    }
    class Nested { //외부 비 static 멤버들이 내부에 접근하기 않으므로 static 권고
        String field = "Nested-field";
        void method() {
            System.out.println ( "Nested-method" );
        }
    }
}

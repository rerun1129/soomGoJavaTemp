package chapter10._02_exceptionthrow.throwingtest;

import java.io.IOException;

public class Throwing2 {

    void throwExceptionOther() throws IOException {
        Throwing3 throwing3 = new Throwing3 ( );
        throwing3.throwException ();
    }

}

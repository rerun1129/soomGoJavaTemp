package chapter07._02_promotion_casting;

public class Cat extends Animal {
    public Cat ( String speciesName ) { super ( speciesName ); }

    @Override
    public String growl ( ) {
        return "야옹~";
    }
}

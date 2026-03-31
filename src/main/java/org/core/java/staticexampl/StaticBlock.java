package org.core.java.staticexampl;

public class StaticBlock {
    static int a = 4;
    static int b;
    static {
        b = a*4;
    }
     static class Inerclass{
        String st;

        public Inerclass(String st) {
            this.st = st;
        }
    }

}

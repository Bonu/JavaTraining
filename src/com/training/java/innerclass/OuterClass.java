package com.training.java.innerclass;

public class OuterClass {
    private int anInt;
    private String string;

    public Inner inner;

    public OuterClass() {
        System.out.println("--outer class--");
    }

    public OuterClass(int anInt, String string) {
        this.anInt = anInt;
        this.string = string;
        inner = new Inner(anInt,string);
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void myMethodOuter() {
        System.out.println("anInt=" + anInt + ", string=" + string);
        inner.myMethod();
    }

    public class Inner {

        private int anIntInner;
        private String stringInner;

        public Inner() {
            System.out.println("---Inner---");
        }

        public Inner(int anIntInner, String stringInner) {
            this.anIntInner = anIntInner;
            this.stringInner = stringInner;
        }

        public void myMethod() {
            System.out.println("anInt=" + anInt + ", string=" + string);
            System.out.println("outer class variables "+OuterClass.this.string);
            System.out.println("outer class variables "+OuterClass.this.anInt);
        }
    }

    public static class StaticInner {

        private int anIntInner;
        private String stringInner;

        public StaticInner() {
            System.out.println("---Inner---");
        }

        public StaticInner(int anIntInner, String stringInner) {
            this.anIntInner = anIntInner;
            this.stringInner = stringInner;
        }

        public void myMethod() {
            System.out.println("anInt=" + anIntInner + ", string=" + stringInner);
        }
    }


    public static class InnerStatic {
        public void myMethod() {
            System.out.println("inside a static inner class");
        }
    }
}

package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {
        B objB = new B();
        String result = objB.meth();
        System.out.println(result);
    }
}
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
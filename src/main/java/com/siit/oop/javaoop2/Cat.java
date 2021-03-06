package com.siit.oop.javaoop2;

public class Cat extends Animal implements Domestic {

    public Cat(){
        System.out.println("cat");
    }
//    public Cat(String s){
//        System.out.println(s);
//    }

    /**
     * Rules for method overriding
     *
     * 1. The method in the child class must have the same signature as the method in the parentclass.
     * 2. The method in the child class must be at least as accessible or more accessible than the
     * method in the parent class.
     * 3. The method in the child class may not throw a checked exception that is new or
     * broader than the class of any exception thrown in the parent class method.
     * 4. If the method returns a value, it must be the same or a subclass of the method in the
     * parent class, known as covariant return types.
     */
    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public void play() {
        System.out.println("playing with Cat");
    }

    @Override
    public void defaultMethodInInterface() {
        System.out.println("nu dorim comportamentul default, vrem altul pentru cat");
    }
}

package FactoryMethod;

/**
 * @author 王旻爽
 * 2020/10/20
 * @ClassName CarFactory.java
 */
public class CarFactory  {
    public Moveable create(){
        System.out.println("a Car Created!!");
        return new Car();
    }
}

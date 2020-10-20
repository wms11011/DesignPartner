package FactoryMethod;

/**
 * @author 王旻爽
 * 2020/10/20
 * @ClassName Plane.java
 */
public class Plane implements Moveable{
    @Override
    public void go() {
        System.out.println("Plane fly .......");
    }
}

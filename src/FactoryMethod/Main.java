package FactoryMethod;

/**
 * @author 王旻爽
 * 2020/10/20
 * @ClassName Main.java
 */
public class Main {
    public static void main(String[] args) {

        Moveable moveable = new SimpleVehicleFactory().createCar();
        moveable.go();

        Moveable movable1 = new CarFactory().create();
        movable1.go();
    }
}

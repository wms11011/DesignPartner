package FactoryMethod;

/**
 * @author 王旻爽
 * 2020/10/20
 * @ClassName Main.java
 */
public class Main {
    public static void main(String[] args) {
        // 下面两种都是简单工厂的实现
        Moveable moveable = new SimpleVehicleFactory().createCar();
        moveable.go();

        Moveable movable1 = new CarFactory().create();
        movable1.go();
    }
}

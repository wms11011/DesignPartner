package FactoryMethod;

/**
 * @author 王旻爽
 * 2020/10/20
 * @ClassName SimpleVehicleFactory.java
 */
public class SimpleVehicleFactory  {
    public Car createCar(){
        // 前置操作
        return new Car();
        // 后置操作
    }

    public Plane createPlan(){
        // 前置操作
        return new Plane();
        // 后置操作
    }
}

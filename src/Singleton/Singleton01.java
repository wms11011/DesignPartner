package Singleton;

/**
 * @author 王旻爽
 * 2020/10/16
 * @ClassName Singleton01.java
 */
public class Singleton01 {

    /*
           最简单的一种单例模式的实现，将构造方法设为私有的
       只能通过getInstance()方法来获取这个类的对象，
       且这个类的实例用static final修饰，意味着这个实例永远只有一份。

          但是也有不足之处，恰恰用static修饰后，这个类在加载时静态变量INSTANCE就会被初始化，所以我们不管
       用不用这个实例，他都已经加载好了，会对内存造成一定浪费。
     */

    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01(){}

    public static Singleton01 getInstance() {return INSTANCE;}
}

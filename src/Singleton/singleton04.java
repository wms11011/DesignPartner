package Singleton;

/**
 * @author 王旻爽
 * 2020/10/16
 * @ClassName singleton04.java
 */
public class singleton04 {

    /*
       使用静态内部类实现,一个类的静态内部类在外部的singleton04加载时不会同时被加载，所以只有在我们确实需要这个
       类的实例时调用该类的静态内部类来实例化对象，而且这种方式由JVM来实现线程安全，因为JVM可以保证这个类（InnerSingleClass）
       只加载一次，这样就同时实现了懒加载模式和线程安全。
     */

    private singleton04(){}

    private static class InnerSingleClass {
        private static final singleton04 INSTANCE = new singleton04();
    }

    public static singleton04 getInstance(){

        return InnerSingleClass.INSTANCE;
    }

}

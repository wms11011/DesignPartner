package Singleton;

/**
 * @author 王旻爽
 * 2020/10/16
 * @ClassName singleton03.java
 */
public class singleton03 {

    /*
       有一种懒加载的模式
     */

    private static volatile singleton03 INSTANCE;
    
    private singleton03(){}
    
    public static singleton03 getInstance(){

        // 第一层判断：如果这个类已经实例化了，这层判断可以防止重复上锁
        if (INSTANCE == null) {
            // 加锁和第二层判断可以保证在多线程环境下的线程安全问题
            // 其中的第二层判断是关键，如果没有判断，在synchronized语句块这里线程会串行执行，同样会
            // 导致返回多个不同实例。
            synchronized (singleton03.class) {
                if (INSTANCE == null) {
                    INSTANCE = new singleton03();
                    return INSTANCE;
                }
            }
        }
        return INSTANCE;
    }
}

package Singleton;

/**
 * @author 王旻爽
 * 2020/10/16
 * @ClassName singleton02.java
 */
public class singleton02 {

    /*
       对于01还有一种实现

     */
    private static final singleton02 INSTANCE ;

    static {
        INSTANCE = new singleton02();
    }

    private singleton02(){}

    public static singleton02 getInstance() {return INSTANCE;}
}

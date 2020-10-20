package Strategy;

import java.util.Arrays;

/**
 * @author 王旻爽
 * 2020/10/19
 * @ClassName main.java
 */
public class mainTest {

    public static void main(String[] args) {
        Cat[] array = {new Cat(3,3),new Cat(5,5),new Cat(2,2)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(array,new CatComparator());
        System.out.println(Arrays.toString(array));
    }
}

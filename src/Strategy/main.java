package Strategy;

import java.util.Arrays;

/**
 * @author 王旻爽
 * 2020/10/19
 * @ClassName main.java
 */
public class main {

    public static void main(String[] args) {
        int[] array = {9,2,5,7,6,2,4};
        Sorter sorter = new Sorter();
        Sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

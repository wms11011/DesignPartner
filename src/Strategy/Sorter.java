package Strategy;

/**
 * @author 王旻爽
 * 2020/10/19
 * @ClassName Sorter.java
 */
class Sorter {

    static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = min+1; j < array.length; j++) {
                min = array[min] > array[j]?j : min;
            }
            int temp = array[min];
            array[min] = array[i];
            array[i]= temp;
        }
    }
}

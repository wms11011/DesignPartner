package Strategy;

/**
 * @author 王旻爽
 * 2020/10/19
 * @ClassName Sorter.java
 */
class Sorter {

    static void sort(Comparable[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = min+1; j < array.length; j++) {
                min = array[min].compareTo(array[j]) == -1?min : j;
            }
            Comparable temp = array[min];
            array[min] = array[i];
            array[i]= temp;
        }
    }
}

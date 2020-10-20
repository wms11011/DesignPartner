package Strategy;

/**
 * @author 王旻爽
 * 2020/10/19
 * @ClassName Sorter.java
 */
class Sorter<T> {

    void sort(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = min+1; j < array.length; j++) {
                min = comparator.compare(array[min],array[j]) == -1?min : j;
            }
            T temp = array[min];
            array[min] = array[i];
            array[i]= temp;
        }
    }
}

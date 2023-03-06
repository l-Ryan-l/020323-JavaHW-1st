import java.util.ArrayList;

//Task 3: Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//а остальные - равны ему.
public class Task3_sortArrayByValue {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int[] finalArray = sortArray(nums, val);
        System.out.print("Массив отсортированный по значению '" + val + "': ");
        printArray(finalArray);

    }
    public static int[] sortArray(int[] arr, int value){
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (i < j && arr[j] == value){
                j --;
            }
            if (arr[i] == value) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else {
                System.out.println("Значений, равных '" + value + "', в массиве нет. Сортировка невозможна.");
            }
            i ++;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}


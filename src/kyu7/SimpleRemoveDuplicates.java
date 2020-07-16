package kyu7;
/*
In this Kata, you will remove the left-most duplicates from a list of integers and return the result.
// Remove the 3's at indices 0 and 3
// followed by removing a 4 at index 1
solve([3, 4, 4, 3, 6, 3]); // => [4, 6, 3]
 */
import java.util.ArrayList;
import java.util.Collections;

public class SimpleRemoveDuplicates {
    public static int [] solve(int [] arr){
        ArrayList<Integer> arrInt = new ArrayList<Integer>(); //лист для сохранения результата, собираем все сначала в обратном порядке
        boolean isCont; //переменная для проверки, необходимо ли сохранять значение с конечный список

        OUTER:
        for (int i = arr.length - 1; i >= 0 ; i--) {
            isCont = true;
            for (int j = 0; j < arrInt.size(); j++) {
                if (arrInt.get(j) == arr[i]) { //если значение уже есть в списке...
                    isCont = false;
                    continue OUTER;
                }
            }
            if (isCont){ arrInt.add(arr[i]); } //... то добавление в конечный список не произойдет

        }
        Collections.reverse(arrInt); // реверсируем отображение

        int [] reverseResultArray = new int[arrInt.size()]; //сохраняем все в простой массив для вывода из метода результата
        for (int i = 0; i < reverseResultArray.length; i++) {
            reverseResultArray[i] = arrInt.get(i);
        }

        return reverseResultArray;
    }

    public static void main(String[] args) {
        int [] array = solve(new int []{3, 4, 4, 1, 1, 2, 10, -10, 0, 21, -10}); //3, 4, 1, 2, 10, 0, 21, -10

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}

/**
 * Java 1. Homework 4
 * @author Viktoriia Oborina
 * @version 24.05.2022
 */

package homework2;

public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[][]{{"3", "2", "4", "5"}, {"1", "5", "1", "4"},{"3", "3", "1", "2"}, {"7", "2", "1", "9"}};
        //printArr();
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Неверный размер массива!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неверное значение массива!");
            System.out.println(e.getMessage());

        }
    }

//    public static void printArr() { //вывод массива в консоль
//        String[][] arr = new String[][]{{"3", "2", "4", "5"}, {"1", "5", "1", "4"},{"3", "3", "1", "2"}, {"7", "2", "1", "9"}};
//        for (int x = 0; x < arr.length; x++) {
//            for (int y = 0; y < arr[x].length; y++) {
//                System.out.print(arr[x][y] + " ");
//            }
//            System.out.println();
//        }
//    }

    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Неверный размер массива!");
        }
            for (int x = 0; x < arr.length; x++) {
                if (arr[x].length != 4) {
                    throw new MyArraySizeException("Неверный размер массива!");
                }
                for (int y = 0; y < arr[x].length; y++) {
                    try {
                        count = count + Integer.parseInt(arr[x][y]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(x, y);
                    }
                }
            }
            return count;
    }

}
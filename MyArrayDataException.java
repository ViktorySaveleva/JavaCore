package homework2;

public class MyArrayDataException extends Exception {

    MyArrayDataException(int row, int col) {
        super(String.format("Неверное значение находится в ячейке [%d, %d]\n", row, col));
    }
}

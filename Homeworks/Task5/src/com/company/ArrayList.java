package com.company;

public class ArrayList {
    private final int INITIAL_SIZE = 100;//constant
    private int elements[]; //arrays for storage  the data
    private int count;//count the number of items in an array

    public ArrayList() {
        elements = new int[INITIAL_SIZE];
        count = 0;
    }

    /**
     * 1
     * add to the end
     *
     * @param element
     */
    public void add(int element) {
        if (entireArray(count)) {
            elements[count] = element;
            count++;
        }
    }

    /**
     * 2
     * add forward with shift
     *
     * @param element
     */
    public void addToBegin(int element) {
        if (entireArray(count)) {
            for (int i = count; i > 0; i--) {
                elements[i] = elements[i - 1];
            }
            elements[0] = element;
            count++;
        }
    }

    /**
     * 3
     * Insert an element in the specified position with a shift
     *
     * @param element
     * @param index
     */
    public void insert(int element, int index) {
        if (entireArray(count)) {
            for (int i = count; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[0] = element;
            count++;
        }

    }

    /**
     * 4
     * Getting a list item by index
     *
     * @param index
     * @return
     */
    public int get(int index) {
        return elements[index];
    }

    /**
     * 5
     * array replace element by index
     *
     * @param index
     * @param element
     */
    public void replace(int element, int index) {
        elements[index] = element;
    }

    /**
     * 6
     * Insertion sort
     *
     * @param index
     * @return
     */
    public void sorting(int index) {
        int min = index;
        int temp;
        if (index != count) {
            for (int i = index; i < count - 1; i++) {
                if (elements[i + 1] < elements[i])
                    min = i + 1;
            }
            temp = elements[index];
            elements[index] = elements[min];
            elements[min] = temp;
            index++;
            sorting(index);
        }
    }

    /**
     * 7
     * Reversing an array
     */
    public void reverse() {
        int temp;
        for (int i = 0; i < count / 2; i++) {
            temp = elements[count - 1 - i];
            elements[count - 1 - i] = elements[i];
            elements[i] = temp;
        }
    }

    /**
     * 8
     * remove item by index
     *
     * @param index
     */
    public void remove(int index) {
        for (int i = index; i < count; i++) {
            elements[i] = elements[i + 1];
        }
        count--;
    }

    /**
     * 9
     * If the object is not found, returns the index
     *
     * @param element
     * @return
     */
    public int find(int element) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 10
     */
    public void arrayCountValues() {
        System.out.println("Элементы массива:");
        for (int i = 0; i < count; i++) {
            System.out.print(elements[i]);
        }
    }

    /**
     * False,if don't full
     *
     * @param count
     * @return
     */
    public boolean entireArray(int count) {
        if (count == INITIAL_SIZE) {
            System.out.println("Вы достигли максимального значения!");
            return false;
        } else
            return true;
    }
    void Menu() {

        String menu = "Работы со списком:\n" +
                "1.Добавить элемент в конец\n" +
                "2.Добавить элемент в начало списка, со сдвигом вправо\n" +
                "3.Вставить элемент в заданную позицию со сдвигом\n" +
                "4.Получить элемент по индексу\n" +
                "5.Заменить элемент в заданной позиции новым элементом\n" +
                "6.Сортировка вставками\n" +
                "7.Реверсия массива\n" +
                "8.Удалить элемент по индексу\n" +
                "9.Вернуть индекс элемента\n" +
                "10.Показать массив\n" +
                "11.Выход в главное меню\n";
        System.out.println(menu);
    }

}
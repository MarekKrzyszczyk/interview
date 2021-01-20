package interview.task1;

import java.util.*;

public class ArrayTask<T> {

    public Object[] fillArray(int length) {
        Object[] array = new Object[length];
        for (int i = 0; i < length; i++) {
            Random random = new Random();
            Object randomInt = random.nextInt(101);
            array[i] = randomInt;
        }
        return array;
    }

    public List<T> addEveryRevertThirdElementOfArrayToList(Object[] array) {
        List<T> list = new ArrayList<>();
        int[] newArray = new int[200];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[index] = (int) array[i];
        }
        for (int j = 0; j < newArray.length; j++) {
            if ((j + 1) % 3 == 0) {
                list.add((T) array[j]);
            }
        }
        return list;
    }

    public List<T> addArithmeticAverageToList(T[] array) {
        List<T> list = new ArrayList<>();
        int average;
        final int factor = 50;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                average = (factor + (int) array[i] + (int) array[i + 1]) / 3;
            } else if (i == array.length - 1) {
                average = (factor + (int) array[i] + (int) array[i - 1]) / 3;
            } else {
                average = ((int) array[i - 1] + (int) array[i] + (int) array[i + 1]) / 3;
            }
            Object averageObject = average;
            list.add((T) averageObject);
        }
        return list;
    }

    public List<T> addGtElementsOfArrayToList(T[] array, int gt) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if ((int) array[i] > gt) {
                list.add((T) array[i]);
            }
        }
        return list;
    }

    public Map<Integer, Integer> addProductToMap(T[] array, int gt) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if ((int) array[i] * (int) array[j] > gt)
                    map.put(i, j);
            }
        }
        return map;
    }

    public List<List<Integer>> createListOfIncreaseSequences(T[] array) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            if ((int) array[i] < (int) array[i + 1] && (int) array[i + 1] < (int) array[i + 2]) {
                List<Integer> sequence = new ArrayList<>();
                sequence.add((int) array[i]);
                sequence.add((int) array[i + 1]);
                sequence.add((int) array[i + 2]);
                result.add(sequence);
            }
        }
        return result;
    }

    public Object[] changeOrder(T[] array, int index) {
        Object[] newArray = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        Object currentIndexValue = newArray[index + 1];
        newArray[index + 1] = newArray[index];
        newArray[index] = currentIndexValue;
        return newArray;
    }

    public void displaySummary(List<List<Integer>> list, T[] array, int index) {
        int currentIndex = index - 1;
        if (index == 0) {
            System.out.println("Pierwotna tablica T" + index + ": " + Arrays.toString(array));
        }
        else {
            System.out.println("tablica T" + index + " z zamianą elementów" + currentIndex + " i " + index + " względem tablicy T0: "+ Arrays.toString(array));
        }
        System.out.print("sekwencje rosnące w T" + index + ": ");
        list.forEach(System.out::print);
        System.out.println("\nliczba sekwencji: " + list.size());
        System.out.println("zamieniona para: " + (index == 0 ? "brak" : (currentIndex + " i " + index)) + "\n");

    }

}

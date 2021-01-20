package interview;

import interview.task3.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        ArrayTask task1 = new ArrayTask();
//
//        System.out.println("wypełni 200 elementową tablicę losowymi liczbami z zakresu <0 - 100>");
//
//        Object[] array = task1.fillArray(200);
//        System.out.print(Arrays.toString(array));
//
//        System.out.println("\nprzepisze co trzecią liczbę z tablicy do listy generycznej w kolejności od końca do początku tablicy");
//
//        List<Object> listOfEveryThirdElement = task1.addEveryRevertThirdElementOfArrayToList(array);
//        for (Object obj : listOfEveryThirdElement) {
//            System.out.print(obj + ", ");
//        }
//
//        System.out.println("\nprzepisze wartości z tablicy do listy generycznej w taki sposób, że element w liście odpowiadający elementowi w tablicy będzie średnią arytmetyczną elementu z tablicy");
//
//        List<Object> listOfArithmeticAverage = task1.addArithmeticAverageToList(array);
//        for (Object obj : listOfArithmeticAverage) {
//            System.out.print(obj + ", ");
//        }
//
//        System.out.println("\nprzepisze elementy tablicy większe od 90 do listy generycznej");
//
//        List<Object> listOfGtElements = task1.addGtElementsOfArrayToList(array, 90);
//        for (Object obj : listOfGtElements) {
//            System.out.print(obj + ", ");
//        }
//
//        System.out.println("\nwymnoży elementy tablicy na zasadzie każdy z każdym (także z samym sobą) i wyświetli bez powtórzeń pary indeksów tych elementów, dla których iloczyn jest większy od 9000");
//
//        Map<Integer, Integer> mapOfGtEProducts = task1.addProductToMap(array, 9000);
//        for (Map.Entry<Integer, Integer> entry : mapOfGtEProducts.entrySet()) {
//            System.out.println(entry.getKey() + ", " + entry.getValue());
//        }
//
//        System.out.println("sprawdzi ile rosnących sekwencji 3 elementowych znajduje się w tablicy");
//
//        int maxNoOfSequences = 0;
//        List<Integer> listNoOfSequences = new ArrayList<>();
//
//        List<List<Integer>> listOfSequences = task1.createListOfIncreaseSequences(array);
//        task1.displaySummary(listOfSequences, array, 0);
//
//        if (listOfSequences.size() >= maxNoOfSequences) {
//            maxNoOfSequences = listOfSequences.size();
//        }
//
//        listNoOfSequences.add(listOfSequences.size());
//
//        for (int i = 0; i < array.length - 1; i++) {
//            Object[] newArray = task1.changeOrder(array, i);
//            listOfSequences = task1.createListOfIncreaseSequences(newArray);
//            task1.displaySummary(listOfSequences, newArray, i + 1);
//            if (listOfSequences.size() >= maxNoOfSequences) {
//                maxNoOfSequences = listOfSequences.size();
//            }
//            listNoOfSequences.add(listOfSequences.size());
//        }
//        System.out.println("\nNajwiększa liczba sekwencji wynosi " + maxNoOfSequences + " i znajduje się w:");
//        for (Integer i = 0; i < listNoOfSequences.size(); i++) {
//            if (listNoOfSequences.get(i) == maxNoOfSequences) {
//                if (i == 0) {
//                    System.out.println("- tablicy oryginalnej");
//                }
//                Integer index = i - 1;
//                System.out.println("- tablicy z zamianą elementów " + index + " i " + i);
//            }
//        }

//        ---------------task2----------------------

//        FileReader reader = new FileReader();
//
//        Path path = Paths.get("src/main/resources/example.txt");
//
//        String readText = reader.readFile(path);
//
//        System.out.println(readText);
//
//        char[] charArray = readText.toCharArray();
//        int noOfChars = charArray.length;
//
//        List<Character> characterList = TextAnalyzer.convertArrayIntoList(charArray);
//        Map<Character, Integer> map = TextAnalyzer.countChars(characterList, false);
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            double percent = ((double) entry.getValue()) / noOfChars * 100;
//            System.out.println(entry.getKey() + ": " + entry.getValue() + " / " + percent + "%");
//        }

        //        ---------------task3----------------------

        AreaComparer areaComparer = new AreaComparer();
        int areaComparator = areaComparer.compare(new Square(10), new Circle(5));

        System.out.println("Pole: " + areaComparator);

        VolumeComparer volumeComparer = new VolumeComparer();
        int volumeComparator = volumeComparer.compare(new Cube(10), new Sphere(10));

        System.out.println("Objetość: " + volumeComparator);

    }
}

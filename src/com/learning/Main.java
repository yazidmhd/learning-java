package com.learning;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hello. Welcome to the game!");

        // INT & WHILE LOOPS
        /*
        // Random class
        Random rand = new Random();

        // rand.nextInt(10) --> expecting a number between 0 to 10
        int theSecretNumber = rand.nextInt(10);
        int yourGuess = 0;

        // Scanner class --> a class that gets input from the user
        Scanner scan = new Scanner(System.in);

        while (theSecretNumber != yourGuess) {
            System.out.println("I have a secret number. Guess the number: ");

            // get input from user
            yourGuess = scan.nextInt();

            //check to see if guess is correct
            if (yourGuess < theSecretNumber) {
                System.out.println("Too low");
            }
            if (yourGuess > theSecretNumber) {
                System.out.println("Too large");
            }
        }

        System.out.println("You got the secret number!");
        */

        // FOR LOOP
        /*
        // counter; compare; increment
        for(int i = 0; i < 5; i++){
            System.out.println("The number is " + i);
        }

        for(int i = 0; i < 29; i++){
            System.out.println("The number is " + i);
        }
         */

        // ARRAYS
        /*
        // arrays are static size, once declared, you cannot add or remove any numbers in it
        // arrays can be declared with values or without values
        // length - the number of elements in the array
        int[] secondLuckyNumbers = new int[5];
        int[] luckyNumbers = {13,14,19,24,34,98};
        Integer[] thirdNumbers = new Integer {10,20,30,40};

        System.out.println(luckyNumbers[0]);
        for (int i = 0; i < luckyNumbers.length; i++) {
            System.out.println("The lucky number at position " + i + " is: " + luckyNumbers[i]);
        }
        */

        // FOR EACH LOOP
        /*
        int sum = 0;
        int sumSquare = 0;
        int[] bunchNumbers = {12,13,14,15,16,17,19};

        // for each num in bunchNumbers
        for (int num:bunchNumbers){
            sum += num;
            sumSquare += num * num;
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The sum square is: " + sumSquare);
        */

        // ARRAYLIST
        /*
        // flexible; expects an object type
        // int is a primitive type so use Integer as its an object type
        ArrayList<Integer> unluckyNumbers = new ArrayList<>();
        unluckyNumbers.add(7);
        unluckyNumbers.add(8);
        unluckyNumbers.add(9);
        unluckyNumbers.add(10);
        unluckyNumbers.add(11);

        for (int i = 0; i < unluckyNumbers.size(); i++) {
            System.out.println("For loop arraylist: " + unluckyNumbers.get(i));
        }

        for(int num:unluckyNumbers){
            System.out.println("Foreach loop arraylist: " + num);
        }
        */

        // OBJECTS - Caveman & Rock
        /*
        Caveman c1 = new Caveman();
        Caveman c2 = new Caveman("Meow", 17, 72.4f, new ArrayList<>());
        c1.sayHi();
        c2.sayHi();

        c1.setName("MeowSecond");
        c1.sayHi();
        c2.sayHi();

        System.out.println("C1 = " + c1.toString());
        System.out.println("C2 = " + c2.toString());

        Rock r1 = new Rock();
        Rock r2 = new Rock("red", 2.5f);
        Rock r3 = new Rock("green", 23.3f);
        Rock r4 = new Rock("blue", 25.2f);
        Rock r5 = new Rock("purple", 32.4f);
        Rock r6 = new Rock("gold", 28.7f);

        ArrayList<Rock> allRocks = new ArrayList<>();
        allRocks.add(r1);
        allRocks.add(r2);
        allRocks.add(r3);
        allRocks.add(r4);

        c2.setRockCollection(allRocks);
        // if see this in the arraylist - Rock@2f4d3709, you need to add a toString method in the class, Rock class
        System.out.println("C1 = " + c1.toString());
        System.out.println("C2 = " + c2.toString());

        ArrayList<Rock> allRocksC1 = new ArrayList<>();
        allRocksC1.add(r5);
        allRocksC1.add(r6);

        c1.setRockCollection(allRocksC1);
        System.out.println("C1 = " + c1.toString());
        System.out.println("C2 = " + c2.toString());

        // FOR LOOPS with OBJECTS
        for(Rock r:allRocks) {
            System.out.println("A rock in the collection is " + r);
        }

        for (int i = 0; i < allRocksC1.size(); i++) {
            System.out.println("A rock in collection (C1) is " + allRocksC1.get(i));
        }
        */


        // MAP & HASHMAP
        // Map<KEY, VALUE> myMap = new HashMap<KEY, VALUE>();
        // keys are unique and values can be duplicated
        // initialize
        Map<String, String> englishSpanishDict = new HashMap<String, String>();

        //.put - insert into HashMap
        englishSpanishDict.put("Monday", "Lunes");
        englishSpanishDict.put("Tuesday", "Martes");
        englishSpanishDict.put("Wednesday", "Miercoles");
        englishSpanishDict.put("Thursday", "Jueves");
        englishSpanishDict.put("Friday", "Viernes");
        englishSpanishDict.put("Saturday", "Sabado");
        englishSpanishDict.put("Sunday", "Domingo");

        //.get - retrieve from HashMap - retrieve the value
        System.out.println(englishSpanishDict.get("Saturday"));
        System.out.println(englishSpanishDict.get("Friday"));

        //.size - the length of HashMap
        System.out.println(englishSpanishDict.size());

        //.keySet - retrieve all keys of HashMap
        System.out.println(englishSpanishDict.keySet());

        //.values - retrieve all values of HashMap
        System.out.println(englishSpanishDict.values());

        // LOOPING over HashMap
        // forEach method - similar to Javascript
        englishSpanishDict.forEach((k,v) -> {
            System.out.println("Foreach - The key is " + k + " and the value is " + v);
        });

        // stream method
        englishSpanishDict.entrySet().stream().forEach(e -> {
            System.out.println("Stream - Key: " + e.getKey() + ". Value: " + e.getValue());
        });

        // enhanced For loop - the same foreach loop for arrays & arraylist
        for(Map.Entry<String,String> entry: englishSpanishDict.entrySet()) {
            System.out.println("Enhanced For Loop - Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }

        // Remove and Edit elements in HashMap
        Map<String,Boolean> shoppingList = new HashMap<>();
        shoppingList.put("Apple", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Eggs", false);
        shoppingList.put("Sugar", true);
        shoppingList.put("Milk", false);

        //.remove - remove element in HashMap
        shoppingList.remove("Bread");

        //.replace - edit the value
        shoppingList.replace("Sugar", false);

        //.toString - print key-value pairs
        System.out.println(shoppingList.toString());

        //.clear - remove all elements in HashMap
        shoppingList.clear();
        System.out.println(shoppingList.toString());

        //.isEmpty - check if HashMap is empty -> returns true/false
        System.out.println(shoppingList.isEmpty());

        // Initialize HashMap together with entries
        // this is unmodifiable/immutable - cannot add or remove elements in the HashMap
        Map<String,Boolean> secondShoppingList = Map.ofEntries(
                Map.entry("Apple", true),
                Map.entry("Bread", true),
                Map.entry("Eggs", false),
                Map.entry("Sugar", true),
                Map.entry("Milk", false)
        );

        // throws UnsupportedOperationException due to using Map.ofEntries
        // secondShoppingList.put("Banana", true);

        System.out.println("==============================");

        // HASHMAP containing ARRAYLIST
        // ITERATE OVER
        Map<String,List<String>> sample = new HashMap<>();

        sample.put("colors", Arrays.asList("red", "green", "blue"));
        sample.put("sizes", Arrays.asList("small", "medium", "large"));

        // Enhanced For loop method
        for(Map.Entry<String,List<String>> entry:sample.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();

            System.out.println("Key: " + key);
            System.out.print("Value: ");

            int count = 0;

            // print out all the values in the ArrayList
            for(String val:values) {
                System.out.print(val);

                count++;

                if(count < values.size()) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        System.out.println("==============================");

        // foreach method
        sample.forEach((k,v) -> {
            System.out.println("Key: " + k);
            System.out.print("Values: ");

            int count = 0;

            for(String val:v) {
                System.out.print(val);

                count++;

                if (count < v.size()) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        });

        System.out.println("==============================");

        // FILTERING with HashMap
        Map<String,String> capitals = new HashMap<>();

        capitals.put("svk", "Bratislava");
        capitals.put("ger", "Berlin");
        capitals.put("hun", "Budapest");
        capitals.put("czk", "Prague");
        capitals.put("pol", "Warsaw");
        capitals.put("ita", "Rome");

        // retrieve all the values that starts with "B"
        // :: is called Method Reference -> A::B = method B in class A
        // eg. <class name>::<method name>
        // eg. .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue())) -> is equivalent to line 308
        Map<String,String> filteredCapitals = capitals.entrySet().stream()
                .filter(map -> map.getValue().startsWith("B"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(filteredCapitals.toString());

        System.out.println("==============================");

        // STREAM examples - map, filter, sort, remove duplicates
        // map method
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> square = numbers.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);

        // filter method
        List<String> names = Arrays.asList("Reflection", "Collection", "Stem", "Sum");
        List<String> results = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        List<String> loweredResults = results.stream().map(r -> r.toLowerCase()).collect(Collectors.toList());
        System.out.println(results);
        System.out.println(loweredResults);

        // sort method
        // this returns a fixed size array - immutable/unmodifiable
        List<Integer> numbersSecondArr = Arrays.asList(2,3,4,5,2,4);
        // this returns a array list - mutable/can be modified
        List<Integer> numbersSecond = new ArrayList<>(Arrays.asList(2,3,4,5,2,4));

        System.out.println("type numbersSecondArr - ArrayList: " + (numbersSecondArr.getClass()));
        System.out.println("type numbersSecond - ArrayList:" + (numbersSecondArr.getClass()));

        numbersSecond.add(90);
        numbersSecond.set(0, 50);

        List<Integer> sortedNumbersSecond = numbersSecond.stream().sorted().collect(Collectors.toList());
        List<Integer> sortNumbersSecondArr = numbersSecondArr.stream().sorted().collect(Collectors.toList());
        sortNumbersSecondArr.add(100);

        System.out.println("type sortedNumbersSecond - ArrayList: " + (sortedNumbersSecond instanceof ArrayList));
        System.out.println("type sortNumbersSecondArr - ArrayList: " + (sortNumbersSecondArr instanceof ArrayList));

        // remove duplicates -> Collectors.toSet
        List<Integer> numbersThird = Arrays.asList(2,3,4,5,2,4);
        Set<Integer> noDuplicatesNums = numbersThird.stream().sorted().collect(Collectors.toSet());
        System.out.println("Numbers with duplicates: " + numbersThird);
        System.out.println("Numbers without duplicates: " + noDuplicatesNums);

        System.out.println("==============================");

        // Split string sentences into ArrayList
        String commaSeparated = "item 1, item 2, item 3";
        List<String> items = new ArrayList<>(Arrays.asList(commaSeparated.split(", ")));
        System.out.println(commaSeparated);
        System.out.println(items);
        System.out.println(items.get(1));
        System.out.println(items.size());

        System.out.println("==============================");

        // PALINDROME
        String s1 = "hello";

        // reverse a string
        String s1Reversed = new StringBuilder(s1).reverse().toString();
        System.out.println("s1: " + s1);
        System.out.println("s1 reversed: " + s1Reversed);

        System.out.println();

        // remove all spaces in a string
        String s2 = "Hello everyone from the world!";
        String s2NoSpaces = s2.replaceAll("\\s+","").toLowerCase();
        System.out.println("s2: " + s2);
        System.out.println("s2 no spaces: " + s2NoSpaces);

        System.out.println();

        // retrieve last character of s2 - use .charAt
        System.out.println("s2 last character: " + s2.charAt(s2.length() - 1));

        System.out.println();

        // split string into an array
        String s3 = "Meow meow to the new world!";
        String cleanS3 = s3.replaceAll("[^a-zA-Z!]+","").toLowerCase();
        StringBuilder reverseS3 = new StringBuilder();
        char[] splitS3 = cleanS3.toCharArray();
        for (int i = splitS3.length - 1; i >= 0 ; i--) {
            reverseS3.append(splitS3[i]);
        }
        System.out.println("s3: " + cleanS3);
        System.out.println("reverseS3: " + reverseS3.toString());

        System.out.println();

        // palindrome solution
        String s4 = "Red rum, sir, is murder";
        // 1. remove all spaces and commas/special characters and convert to lowercase
        String cleanS4 = s4.replaceAll("[^a-zA-Z]+","").toLowerCase();
        // 2. reverse the clean sentence with StringBuilder and convert toString
        String reverseS4 = new StringBuilder(cleanS4).reverse().toString();
        // 3. check if clean and reverse are the same
        System.out.println("cleanS4: " + cleanS4);
        System.out.println("reverseS4: " + reverseS4);
        System.out.println("cleanS4 = reverseS4: " + cleanS4.equals(reverseS4));





    }
}

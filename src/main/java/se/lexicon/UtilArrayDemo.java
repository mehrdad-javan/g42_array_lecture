package se.lexicon;

import java.util.Arrays;

public class UtilArrayDemo {

  //static final String WEB_SITE = "www.lexicon.se";

  //psvm + tab
  public static void main(String[] args) {

    ex5();
  }

  public static void ex1() {
    String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};
    //Arrays.sort(names);
    Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

    for (String name : names) {
      System.out.println(name);
    }
  }

  public static void ex2() {
    // re-format code  => ctrl + alt + L
    int[] numbers = {200, 700, 900, 4555, 34500, 445000, 500000};

    int indexFound = Arrays.binarySearch(numbers, 921);

    if (indexFound < 0) {
      System.out.println("Data Not Found!");
    } else {
      System.out.println("Data : " + numbers[indexFound]);
    }

  }

  public static void ex3() {
    int[] array1 = {10, 20, 30, 40};
    int[] array2 = Arrays.copyOf(array1, 5);
    array2[4] = 50;

    for (int num : array2) {
      System.out.println(num);
    }

  }

  public static void ex4() {
    String[] names = new String[]{"Erik", "Simon"};
    String[] newArray = addNameToArray(names, "Ulf");
    String[] newArray2 = addNameToArray(newArray, "Marcus");

    for (String name : newArray2) {
      System.out.println(name);
    }

  }

  public static String[] addNameToArray(final String[] source, String name) {
    String[] newArray2 = Arrays.copyOf(source, source.length + 1);
    System.out.println(newArray2.length);
    newArray2[newArray2.length - 1] = name;

    return newArray2;
  }

  public static void ex5(){
    int[] numbers = {1,2,3,4,5,6,7,8,9};
    int[] range = Arrays.copyOfRange(numbers, 2,6);

    for (int num : range){
      System.out.println(num);
    }


    System.out.println(range);
    System.out.println(Arrays.toString(range));

  }

}

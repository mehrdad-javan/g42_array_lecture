package se.lexicon;

import java.util.Arrays;

public class UtilArrayDemo {


  //psvm + tab
  public static void main(String[] args) {
    ex3();
  }

  public static void ex1() {
    String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};
    //Arrays.sort(names);
    Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

    for (String name : names) {
      System.out.println(name);
    }
  }

  public static void ex2(){
    // re-format code  => ctrl + alt + L
    int[] numbers = {200, 700, 900, 4555, 34500, 445000, 500000};

    int indexFound = Arrays.binarySearch(numbers, 921);

    if (indexFound < 0) {
      System.out.println("Data Not Found!");
    } else {
      System.out.println("Data : " + numbers[indexFound]);
    }

  }

  public static void ex3(){
    int[] array1 = {10,20,30,40};
    int[] array2 = Arrays.copyOf(array1, 5);
    array2[4] = 50;

    for (int num: array2){
      System.out.println(num);
    }

  }

}

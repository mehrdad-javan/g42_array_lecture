package se.lexicon;

public class ArrayDemo {

  public static void main(String[] args) {
    /*
    // Initializing Arrays
    String [] stringArray = new String[3];
    int[] numbers = new int[3];
    char [] words = new char[4];

    int [] numbers2 = new int[] {2,6,3,9};
    String [] stringArrays2 = new String[]{"Test1", "Test2", "Test3"};
    String [] stringArrays3 = {"Test1", "Test2", "Test3"};

    char [] words2 = {'J','A','V','A'};
    */

    ex6();
  }


  public static void ex1(){
    String[] names = new String[3];
    names[0] = "Fredrik";
    names[1] = "Erik";

    System.out.println(names[0]);
    System.out.println(names[2]);
    System.out.println(names[1]);

    System.out.println(names.length);

  }

  public static void ex2(){
    int [] numbers = new int[5];
    numbers[0] = 10;
    numbers[4] = 20;

    //numbers[5] = 30;
  }

  public static void ex3(){
    String [][] board = new String[3][3];
    board[0][0] = "X";
    board[0][1] = "O";
    board[0][2] = "X";

    board[1][0] = "O";
    board[1][1] = "O";
    board[1][2] = "X";

    board[2][0] = "X";
    board[2][1] = "O";
    board[2][2] = "O";
  }

  public static void  ex4(){
    int [] numbers = new int[10];
    for (int i = 0; i < numbers.length; i++){
      numbers[i] = i + 1;
    }

    for (int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }

  }

  public static void ex5(){
    int numbers[] = new int[5];

    for (int i = 0; i< numbers.length; i++){
      numbers[i] = i + 5;
    }

    /*for (int i = 0; i< numbers.length; i++){
      System.out.println(numbers[i]);
    }*/

    for (int number : numbers){ // [5,6,7,8,9]
      System.out.println(number);
    }

  }

  public static void ex6(){
    int [][] numbers = new int[3][3];

    numbers[0][0] = 1;
    numbers[0][2] = 9;
    numbers[2][2] = 7;


    for (int i = 0; i < numbers.length; i++){
      for (int j = 0; j< numbers[i].length ; j++){
        //numbers[i][j] = 8;
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println(" ");

    }

  }

}

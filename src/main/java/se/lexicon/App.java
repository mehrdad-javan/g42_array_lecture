package se.lexicon;

/**
 * Hello world!
 */
public class App {

  private String[] names = {"Nisse", "Olle", "Erik", "Simon", "Sofia", "Selma", "Ulf", "Fredrik"};

  public String findName(String nameToFind) {
    for (String name : names) {
      if (name.equalsIgnoreCase(nameToFind)) {
        return name;
      }
    }

    return "Error: No match";
  }

  public static String findNameStatic(String nameToFind) {
    // codes
    return null;
  }


  public static void main(String[] args) {
    // calling the static method
    //findNameStatic("Test");

    // calling the nun static method
    App app= new App();
    System.out.println(app.findName("erik"));
    System.out.println(app.findName("Test"));

  }


}

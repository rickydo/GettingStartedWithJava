package many;

import java.util.List;
import java.util.LinkedList;

public class UseLists {
  public static void main(String[] args) {
    // List is an abstraction
    // ArrayList and LinkedList are concrete implementations
    List<String> names = new LinkedList<String>();
    names.add("Fred");
    names.add("Jim");
    System.out.println("First name is " + names.get(0));
    System.out.println("Number of names is " + names.size());

    names.add(0, "Sheila");
    System.out.println("First name is " + names.get(0));
    System.out.println("Number of names is " + names.size());

    for (int idx = 0; idx < names.size(); idx++) {
      System.out.println(names.get(idx));
    }

    for (String s : names) {
      System.out.println(" > " + s);
    }
  }
}
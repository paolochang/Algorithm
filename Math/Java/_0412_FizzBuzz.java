package Math.Java;

import java.util.ArrayList;
import java.util.List;

public class _0412_FizzBuzz {

  public static void main(String[] args) throws Exception {
    List<String> list = fizzBuzz(15);
    System.out.println(list);
  }

  // O(n)
  public static List<String> fizzBuzz(int n) {
    List<String> list = new ArrayList<String>();
      
      for (int i = 1; i <= n; i++) {
          if (i % 3 == 0 && i % 5 == 0)
              list.add("FizzBuzz");
          else if (i % 3 == 0)
              list.add("Fizz");
          else if (i % 5 == 0)
              list.add("Buzz");
          else
              list.add(Integer.toString(i));
      }
      
      return list;
  }

  // O(n)
  public static List<String> fizzBuzzV2(int n) {
    List<String> list = new ArrayList<String>();

      for (int i = 1; i <= n; i++) {

        boolean mBy3 = i % 3 == 0;
        boolean mBy5 = i % 5 == 0;

        if (mBy3)
          list.add("Fizz");
        else if (mBy5)
          list.add("Buzz");
        else if (mBy3 && mBy5)
          list.add("FizzBuzz");
        else
          list.add(Integer.toString(i));
      }
      
      return list;
  }
}

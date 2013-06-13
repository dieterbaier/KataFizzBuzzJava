package dieterbaier.kata.fizzbuzz;

import java.io.IOException;
import java.io.OutputStream;

public class FizzBuzz {

  String convert(int number) {
    if (number % 3 == 0 && number % 5 == 0)
      return "FizzBuzz";
    if (number % 3 == 0)
      return "Fizz";
    if (number % 5 == 0)
      return "Buzz";
    return Integer.toString(number);
  }

  public void print(final int start, final int end, final OutputStream out) throws IOException {
    for (int i = start; i <= end; i++) {
      out.write(convert(i).getBytes());
      out.write(System.getProperty("line.separator").getBytes());
      out.flush();
    }
  }
}

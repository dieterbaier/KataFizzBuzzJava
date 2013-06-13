package dieterbaier.kata;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.StringTokenizer;

import dieterbaier.kata.fizzbuzz.FizzBuzz;

import org.testng.annotations.Test;

public class FizzBuzzTest {
  
  @Test
  public void PrintNumbers() throws IOException {
    OutputStream bof = new ByteArrayOutputStream();
    new FizzBuzz().print(1,100, bof);
    assertThat("Invalid amount of numbers printed",countPrintedNumbers(bof.toString()), is(100));
  }
  
  @Test
  public void PrintNegativeNumbers() throws IOException {
    OutputStream bof = new ByteArrayOutputStream();
    new FizzBuzz().print(-100,-1,bof);
    assertThat("Invalid amount of numbers printed",countPrintedNumbers(bof.toString()), is(100));
  }
  
  @Test
  public void TryToPrintWithStartBiggerThanEnd() throws IOException {
    OutputStream bof = new ByteArrayOutputStream();
    new FizzBuzz().print(100,1,bof);
    assertThat("Invalid amount of numbers printed",countPrintedNumbers(bof.toString()), is(0));
  }
  
  private int countPrintedNumbers(String string) {
    StringTokenizer st = new StringTokenizer(string, System.getProperty("line.separator"));
    return st.countTokens();
  }

}

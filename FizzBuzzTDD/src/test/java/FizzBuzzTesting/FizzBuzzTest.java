package FizzBuzzTesting;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldLeaveNormalNumbersAsIs(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.fizzBuzzConvert(1));
        Assert.assertEquals("2", fizzBuzz.fizzBuzzConvert(2));
    }
    @Test
    public void shouldPrintFizzOnEveryNumberDivisibleBy3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz",fizzBuzz.fizzBuzzConvert(3));
        Assert.assertEquals("Fizz",fizzBuzz.fizzBuzzConvert(6));

    }
    @Test
    public void shouldPrintBuzzOnEveryNumberDivisibleBy5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz",fizzBuzz.fizzBuzzConvert(5));
        Assert.assertEquals("Buzz",fizzBuzz.fizzBuzzConvert(10));
    }
    @Test
    public void shouldPrintBuzzOnEveryNumberDivisibleBy3and5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz",fizzBuzz.fizzBuzzConvert(15));
    }

}

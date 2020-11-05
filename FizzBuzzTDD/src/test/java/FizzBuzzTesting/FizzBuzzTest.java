package FizzBuzzTesting;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    private static Integer input = 0;
    private static Integer secondTestInput = 0;
    @Test
    public void shouldLeaveNormalNumbersAsIs(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        input = 1;
        //then
        Assert.assertEquals("1", fizzBuzz.fizzBuzzConvert(input));
        //when
        secondTestInput = 2;
        //then
        Assert.assertEquals("2", fizzBuzz.fizzBuzzConvert(secondTestInput));
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
        Assert.assertEquals("FizzBuzz",fizzBuzz.fizzBuzzConvert(60));
    }

    @Test
    public void output100FizzBuzzesToConsole(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++)
            System.out.print(fizzBuzz.fizzBuzzConvert(i) + " ");
    }
    @Test
    public void checkConcatinationOfFizzBuzzToAString(){
        String result = FizzBuzz.fizzBuzzStringBuilder(15);
        Assert.assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz ", result);
    }
    @Test
    public void checkConcatinationOfFizzBuzzToAStringFor100(){
        String result = FizzBuzz.fizzBuzzStringBuilder(100);
        Assert.assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz ", result);
    }


}

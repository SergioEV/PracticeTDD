package FizzBuzzTesting;

public class FizzBuzz {
    public static String fizzBuzzStringBuilder(int numberOfFizzBuzzes) {
        StringBuilder resultConcatenation = new StringBuilder();
        for (int i = 1; i <= numberOfFizzBuzzes; i++)
            resultConcatenation.append(fizzBuzzConvert(i) + " ");
        return resultConcatenation.toString();
    }

    public static String fizzBuzzConvert(int convertingNumber){
        if (convertingNumber % 15 == 0)
            return "FizzBuzz";
        if (convertingNumber % 5 == 0)
            return "Buzz";
        if (convertingNumber % 3 == 0)
            return "Fizz";
        return String.valueOf(convertingNumber);
    }
    
}

package FizzBuzzTesting;

public class FizzBuzz {
    public String fizzBuzzConvert(int convertingNumber){
        if (convertingNumber % 3 == 0)
            return "Fizz";
        return String.valueOf(convertingNumber);
    }
}

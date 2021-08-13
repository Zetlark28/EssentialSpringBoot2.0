package it.ezpeleta.lil.fizzbuzz.fizzbuzzercrl.model;

public class Number {
    private int value;
    private boolean isMultipleOf3;
    private boolean isMultipleOf5;
    private String message;

    public Number() {
    }

    public Number(int value, boolean isMultipleOf3, boolean isMultipleOf5) {
        this.value = value;
        this.isMultipleOf3 = isMultipleOf3;
        this.isMultipleOf5 = isMultipleOf5;
        this.message = retrieveMessage(isMultipleOf3, isMultipleOf5);
    }

    private String retrieveMessage(boolean isMultipleOf3, boolean isMultipleOf5) {
        if(isMultipleOf3 && isMultipleOf5){
            return "FizzBuzz";
        } else if(isMultipleOf3){
            return "Fizz";
        } else if(isMultipleOf5){
            return "Buzz";
        }
        return null;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setMultipleOf3(boolean multipleOf3) {
        isMultipleOf3 = multipleOf3;
    }

    public void setMultipleOf5(boolean multipleOf5) {
        isMultipleOf5 = multipleOf5;
    }

    public int getValue() {
        return value;
    }

    public boolean isMultipleOf3() {
        return isMultipleOf3;
    }

    public boolean isMultipleOf5() {
        return isMultipleOf5;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

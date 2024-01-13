package com.codingproblems;

public class Palindrome {
    public boolean check(long x){
        //String.valueOf() is used to convert an int to a string
        String valueOfNumber = String.valueOf(x);
        if(valueOfNumber.contains("-")){
            return false;
        }
        //StringBuilder is needed to alter strings because you cant mutate them in java
        StringBuilder newString = new StringBuilder(valueOfNumber);
        newString.reverse();
        String reversedString = newString.toString();
        long originalInt = Long.parseLong(valueOfNumber);
        long reversedInt = Long.parseLong(reversedString);
        if (originalInt == reversedInt){
            return true;
        }
        else{
            return false;
        }
    }
}

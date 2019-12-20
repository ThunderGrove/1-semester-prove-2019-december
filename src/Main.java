/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main{
    public String hello(String navn) {
        if(navn.isEmpty()){//There are multiple ways to check if a String is empty but "isEmpty" is the best as the same method/function name is used in other programming languages.
            return "Hello World!";
        }
        return "Hello "+navn+"!";
    }
}
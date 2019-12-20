/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main{
    public String hello(String navn) {
        if(navn.isEmpty()){
            return "Hello World!";
        }
        return "Hello "+navn+"!";
    }
}
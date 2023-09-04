package edu.bsu.cs222;

public class SillyMethods {
    public boolean didGuess42(int i) {
        if (i == 42 ) {
            return true;
        }
        else if (i == 17){
            return false;
        }
        return true;
    }

    public String countTo(int n) {
        String result = "0";
        int counter = 1;
        while (counter <= n){
            result += " " + counter;
            counter++;
        }
        return result;
    }

}

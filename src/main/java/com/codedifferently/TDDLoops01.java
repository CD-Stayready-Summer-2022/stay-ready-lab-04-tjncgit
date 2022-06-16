package com.codedifferently;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TDDLoops01 {
    public String oneToTen(){
        String output ="oneToTen()\n"
                +"*** Output ***";
        for(int x=1; x<=10; x++){
            output += "\n"+x;
        }
        return output;
    }

    public String oddNumbers(){
        String output = "oddNumbers()\n"
                +"*** Output ***";
        for(int x =1; x < 20 ; x+=2){
            output += "\n"+x;
        }

        return output;
    }

    public String squares(int n){
        String output = "squares()\n"
                +"*** Output ***";
        for(int i = 1; i <= n; i++) {
            output += "\n"+ i * i;
        }
        return output;
    }

    public String random4(){
        return "";
    }
//check if number is even
    public String even(int n){
        String output = "even()\n"
                +"*** Output ***";
        for(int i = 0; i <= n; i += 2) {
            output += "\n" + i;
        }
        return output;
    }
// from 1-100, power of n for each
    public String powers(int n){
        String output = "powers()\n"
                +"*** Output ***";
        for(int i = 1; i <= 10; i++) {
            output += "\n" + (i ^ n);
        }
        return output;
    }

}
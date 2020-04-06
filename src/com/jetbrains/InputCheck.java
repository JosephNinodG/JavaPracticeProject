package com.jetbrains;

import java.util.*;

public class InputCheck {

    public static Scanner in = new Scanner(System.in);

    public static String checkInput(String s) {
        String input = "";

        do {
            System.out.println("Please input " + s);
            input = in.nextLine();
        }
        while (isInteger(input) == false);

        return input;
    }

    public static boolean isInteger(String s) {
        try{
            Integer.parseInt(s);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }

}



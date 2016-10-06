package com.mcnichol.katas.stringcalculator;

/**
 * Created by daddy on 10/2/16.
 */
public class NegativeNotAllowed extends RuntimeException{
    NegativeNotAllowed(){
    }
    NegativeNotAllowed(String message){
        super("Negative Not Allowed: " + message);
    }
}

package com.company;

import com.company.Classes.Letter;
import com.company.Interfaces.ILetter;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ILetter coveringLetter = new Letter();
        try {
            coveringLetter.printWholeLetter(TimeUnit.MILLISECONDS, 30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}

package com.company.Interfaces;

import java.util.ArrayList;

public interface IParagraph {
    void print();
    void appendSentence(String sentence);
    void appendInNewLine(String sentence);
    ArrayList<Character> convertToCharArray();
}

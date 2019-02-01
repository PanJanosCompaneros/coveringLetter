package com.company.Classes;

import com.company.Interfaces.IParagraph;

import java.util.ArrayList;

public class Paragraph  implements IParagraph {

    private ArrayList<String> sentences;
    public Paragraph(){
        this.sentences = new ArrayList<>();
        this.appendInNewLine("");
    }
    public Paragraph(String theOnlySentence){
        this.sentences = new ArrayList<>();
        this.appendInNewLine(theOnlySentence);
    }

    @Override
    public void print() {
        if (sentences.isEmpty()) return; //dupa. wyjeb to zaraaz
        for (String a : sentences){
            System.out.print(a);
        }
    }

    @Override
    public void appendSentence(String sentence) {
        this.sentences.add(sentence);
    }

    @Override
    public void appendInNewLine(String sentence) {
        this.sentences.add("\n");
        this.appendSentence(sentence);
    }

    @Override
    public ArrayList<Character> convertToCharArray() {
        ArrayList<Character> tempString = new ArrayList<>();

        for (String sentence : this.sentences){
            for (char  sign : sentence.toCharArray()){
                tempString.add(sign);
            }
        }
        return tempString;
    }
}

package com.company.Classes;

import com.company.Interfaces.ILetterContentKeeper;

import java.util.ArrayList;

public class LetterContentKeeper implements ILetterContentKeeper {
    private ArrayList<Paragraph> paragraphs;

    public LetterContentKeeper(){
        this.paragraphs= new ArrayList<>();
        this.paragraphs.add(this.whatsTheReason());
        this.paragraphs.add(this.whatsThePast());
        this.paragraphs.add(this.whatsTheFuture());
    }
    @Override
    public ArrayList<Paragraph> getParagraphs() {
        return this.paragraphs;
    }

    @Override
    public Paragraph whatsTheReason() {
        Paragraph tempReason = new Paragraph();
        tempReason.appendInNewLine("I am writing to introduce myself as a student of Silesian University of Technology.");
        tempReason.appendInNewLine("I'm responding to your advertisement on pracuj.pl website.");
        tempReason.appendInNewLine("To be more precise I am talking about the Java Programmer position.");
        return tempReason;
    }

    @Override
    public Paragraph whatsThePast() {
        Paragraph tempPast = new Paragraph();
        tempPast.appendInNewLine("As you can see in my Curriculum Vitae I have already worked as a working student in Nokia, Wroclaw.");
        tempPast.appendInNewLine("I started right after I completed the Nokia Academy training course.");
        tempPast.appendInNewLine("I had to quit for my personal reasons (including my university stuff).");
        return tempPast;

    }

    @Override
    public Paragraph whatsTheFuture() {

        Paragraph tempFuture  = new Paragraph();
        tempFuture.appendInNewLine("Right now I'm close to completion of handling those things therefore I'm ready to be hired in a few days.");
        tempFuture.appendInNewLine("I treat my current situation as an opportunity for changing my career path so I would prefer to try myself at \nprogramming in java instead of C++, especially in your company.");
        tempFuture.appendInNewLine("As you can see, my coding style is still terrible. That's why I want to join you so we could make it far far \nbetter, together ;).");
        tempFuture.appendInNewLine("I'm sure that in short time I can become a very valuable employee for you. I just need a mentor to show me the way ;).");
        return tempFuture;

    }


}

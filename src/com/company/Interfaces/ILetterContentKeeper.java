package com.company.Interfaces;

import com.company.Classes.Paragraph;

import java.util.ArrayList;

public interface ILetterContentKeeper {
    ArrayList<Paragraph> getParagraphs();

    IParagraph whatsTheReason();

    IParagraph whatsThePast();

    IParagraph whatsTheFuture();
}

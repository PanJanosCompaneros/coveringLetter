package com.company.Interfaces;

import com.company.Classes.Paragraph;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public interface ILetter {
    void putParagraph(Paragraph paragraph);
    void printParagraph(Paragraph paragraph);
    void printWholeLetter(TimeUnit unit, long delay) throws InterruptedException;


    void introduceYourself();
    void tellWhenYouWroteThatThing(String myCurrentDate);
    void tellYouKnowYourRecipientDataIfHeSharedItWithYou();
    Paragraph SHOW_SOME_RESPECT_TO_THE_RECIPIENT();

    Paragraph farewellPolitely();
    ArrayList<Character> convertLetterToCharArray();
    ArrayList<Paragraph> retrieveListOfParagraphs();

}

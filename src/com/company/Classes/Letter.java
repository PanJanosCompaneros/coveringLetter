package com.company.Classes;

import com.company.Interfaces.ILetter;
import com.company.Interfaces.ILetterContentKeeper;
import com.company.Interfaces.IPerson;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public  class Letter implements ILetter {

    ILetterContentKeeper contentKeeper;
    private IPerson recipient;
    private IPerson sender;
    private Paragraph cityAndDate;
    ArrayList<Paragraph> paragraphs;

    public Letter(){
        this.paragraphs = new ArrayList<Paragraph>();
        this.recipient = new Person(true);
        this.sender = new Person();
        this.sender.setEmail("daniel.jan.janocha@gmail.com");
        this.sender.setFirstName("Daniel");
        this.sender.setSurname("Janocha");
        this.sender.setPhoneNumber("792-120-164");
        this.tellWhenYouWroteThatThing("Wroclaw, 30.01.2018");

        this.contentKeeper = new LetterContentKeeper();
        this.retrieveListOfParagraphs();
    }

    @Override
    public void putParagraph(Paragraph paragraph) {
        this.paragraphs.add(paragraph);
    }

    @Override
    public void printParagraph(Paragraph paragraph) {
        paragraph.print();
    }

    @Override
    public void printWholeLetter(TimeUnit unit, long delay) throws InterruptedException {
        for (int i = 0; i < 50 ; i++){
            System.out.println();
        }
        for (Character sign : this.convertLetterToCharArray()){
            System.out.print(sign);
            unit.sleep(delay);
        }
    }

    @Override
    public void introduceYourself() {
        Paragraph paragraph = new Paragraph();
        paragraph.appendInNewLine("FROM: ");
        paragraph.appendInNewLine(sender.getFirstName());
        paragraph.appendInNewLine(sender.getSurname());
        paragraph.appendInNewLine(sender.getPhoneNumber());
        paragraph.appendInNewLine(sender.getEmail());
        paragraph.appendInNewLine("");

        this.paragraphs.add(paragraph);
    }

    @Override
    public void tellWhenYouWroteThatThing(String cityAndDateWhenIWroteThat) {
        this.cityAndDate =  new Paragraph(cityAndDateWhenIWroteThat);
    }

    @Override
    public void tellYouKnowYourRecipientDataIfHeSharedItWithYou() {
        Paragraph paragraph = new Paragraph();
        paragraph.appendInNewLine("TO: ");
        paragraph.appendInNewLine(recipient.getFirstName());
        paragraph.appendInNewLine(recipient.getSurname());
        paragraph.appendInNewLine(recipient.getPhoneNumber());
        paragraph.appendInNewLine(recipient.getEmail());
        paragraph.appendInNewLine("");

        this.paragraphs.add(paragraph);

    }

    @Override
    public Paragraph SHOW_SOME_RESPECT_TO_THE_RECIPIENT() {
        Paragraph paragraph = new Paragraph();
        paragraph.appendInNewLine("Dear");
        paragraph.appendSentence(" "+ this.recipient.getFirstName());
        paragraph.appendSentence(" "+ this.recipient.getSurname() + ",");
        return paragraph;

    }

    @Override
    public Paragraph farewellPolitely() {
        Paragraph paragraph = new Paragraph();
        paragraph.appendInNewLine("Best regards,");
        paragraph.appendInNewLine(this.sender.getFirstName());
        paragraph.appendSentence(this.sender.getSurname());
        return paragraph;
    }

    @Override
    public ArrayList<Character> convertLetterToCharArray() {
        ArrayList<Character> signs = new ArrayList<>();
        for (Paragraph paragraph : this.paragraphs){
            signs.addAll(paragraph.convertToCharArray());
        }
        return signs;
    }

    @Override
    public ArrayList<Paragraph> retrieveListOfParagraphs() {
        this.paragraphs.add(this.cityAndDate);

        introduceYourself();
        tellYouKnowYourRecipientDataIfHeSharedItWithYou();
        this.paragraphs.add(SHOW_SOME_RESPECT_TO_THE_RECIPIENT());
        this.paragraphs.addAll(this.contentKeeper.getParagraphs());
        this.paragraphs.add(this.farewellPolitely());
        return this.paragraphs;
    }
}
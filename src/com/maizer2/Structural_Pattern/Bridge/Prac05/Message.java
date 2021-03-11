package com.maizer2.Structural_Pattern.Bridge.Prac05;


public class Message extends Language {

    public Message(Language language) {
        this.language = language;
    }

    @Override
    public String greeting() {
        return this.language.greeting();
    }
}

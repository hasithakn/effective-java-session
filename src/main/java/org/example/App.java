package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //dependency injection with passing resource factory to constructor
        SpellCheckerWithFactory spellChecker = new SpellCheckerWithFactory(() -> new Lexicon());
        System.out.println(spellChecker.getTileInfo());

        //dependency injection as constructor parameter
        SpellChecker spellCheckerGoogle= new SpellChecker(new GoogleDictionary());
        spellCheckerGoogle.suggestions("test");

        //dependency injection as constructor parameter
        SpellChecker spellCheckerOxford= new SpellChecker(new OxfordDictionary()    );
        spellCheckerOxford.suggestions("test");
    }
}

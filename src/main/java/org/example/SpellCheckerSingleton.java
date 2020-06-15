package org.example;

import java.util.List;
import java.util.Objects;

public class SpellCheckerSingleton {

    private final Lexicon dictionary = new OxfordDictionary();

    private SpellCheckerSingleton() {
    }

    //basic singleton
    public static SpellCheckerSingleton INSTANCE = new SpellCheckerSingleton();


    public List<String> suggestions(String typo) {
        return null;
    }
}

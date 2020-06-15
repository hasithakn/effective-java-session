package org.example;

import java.util.List;
import java.util.Objects;

public class SpellCheckerOxford {

    private static final Lexicon dictionary = new OxfordDictionary();

    private SpellCheckerOxford() {
    } // Noninstantiable

    public static List<String> suggestions(String typo) {
        return null;
    }
}

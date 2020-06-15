package org.example;

import java.util.List;
import java.util.Objects;

public class SpellChecker {

    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public List<String> suggestions(String typo) {
        return null;
    }
}

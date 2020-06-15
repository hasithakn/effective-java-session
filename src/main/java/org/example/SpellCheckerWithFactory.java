package org.example;

import java.util.function.Supplier;

public class SpellCheckerWithFactory {

        private Lexicon dictionary;

        public SpellCheckerWithFactory(Supplier<? extends Lexicon> lexiconFactory) {
            dictionary = lexiconFactory.get();
        }

        public String getTileInfo() {
            return dictionary.toString();
        }
}

package org.example.lesson3;

import java.util.ArrayList;
import java.util.List;
public class EnglishGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (char counter = 'a'; counter <= 'z'; counter++) {
            charList.add(String.valueOf(counter));
        }
        return charList;

    }
}

package org.example.lesson3;


public interface Game {
    void start(Integer sizeWord, Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();

}
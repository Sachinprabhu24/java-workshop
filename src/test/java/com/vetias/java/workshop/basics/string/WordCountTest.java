package com.vetias.java.workshop.basics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountTest {

    @Test
    public void testWordCount(){
        WordCount wordCount = new WordCount();
        int count =wordCount.count("This program shows the count of the words.");

        Assertions.assertEquals(12,count);
    }

}

package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {

    private Anagram anagram;

    private final String ONLY_LETTERS = "abcd efgh";
    private final String ONLY_SYMBOLS = "-+%^&*/* $�!~#~|";
    private final String ONLY_DIGITS = "54321 23211 2";
    private final String SYMBOLS_AND_DIGITS = "\2%3 1^33*)";
    private final String LETTERS_WITH_SYMBOLS = "a%b^c&d e#f@g#h";
    private final String LETTERS_WITH_DIGITS = "a1b2c3d 4e5f6g7h";
    private final String LETTERS_WITH_SYMBOLS_AND_DIGITS = "a1bcd efg!h";
    private final String EMPTY = "";
    private final String THROWABLE_MESSAGE = Assert.assertThrows(NullPointerException.class, () -> {
						anagram.toReverseString(null);
					    }).getMessage();
    private final String ONLY_LETTERS_REVERSED = "dcba hgfe";
    private final String LETTERS_WITH_SYMBOLS_REVERSED = "d%c^b&a h#g@f#e";
    private final String LETTERS_WITH_DIGITS_REVERSED = "d1c2b3a 4h5g6f7e";
    private final String LETTERS_WITH_SYMBOLS_AND_DIGITS_REVERSED = "d1cba hgf!e";

    @BeforeEach
    void init() {
	anagram = new Anagram();
    }

    @Test
    void testToReverseString_whenInString_isNull() {
	assertNotNull(THROWABLE_MESSAGE);
    }

    @Test
    void testToReverseString_whenInString_onlyLetters() {
	assertEquals(ONLY_LETTERS_REVERSED, anagram.toReverseString(ONLY_LETTERS));
    }

    @Test
    void testToReverseString_whenInString_onlySymbols() {
	assertEquals(ONLY_SYMBOLS, anagram.toReverseString(ONLY_SYMBOLS));
    }

    @Test
    void testToReverseString_whenInString_onlyDigits() {
	assertEquals(ONLY_DIGITS, anagram.toReverseString(ONLY_DIGITS));
    }

    @Test
    void testToReverseString_whenInString_symbolsAndDigits() {
	assertEquals(SYMBOLS_AND_DIGITS, anagram.toReverseString(SYMBOLS_AND_DIGITS));
    }

    @Test
    void testToReverseString_whenInString_lettersAndSymbols() {
	assertEquals(LETTERS_WITH_SYMBOLS_REVERSED, anagram.toReverseString(LETTERS_WITH_SYMBOLS));
    }

    @Test
    void testToReverseString_whenInString_lettersAndDigits() {
	assertEquals(LETTERS_WITH_DIGITS_REVERSED, anagram.toReverseString(LETTERS_WITH_DIGITS));
    }

    @Test
    void testToReverseString_whenInString_lettersWithSymbolsAndDigits() {
	assertEquals(LETTERS_WITH_SYMBOLS_AND_DIGITS_REVERSED,
		anagram.toReverseString(LETTERS_WITH_SYMBOLS_AND_DIGITS));
    }

    @Test
    void testToReverseString_whenInString_empty() {
	assertEquals(EMPTY, anagram.toReverseString(EMPTY));
    }
}

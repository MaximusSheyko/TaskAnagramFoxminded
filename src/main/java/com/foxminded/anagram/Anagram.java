package com.foxminded.anagram;

public class Anagram {

    private final static String SPACE = "\s+";

    public String toReverseString(String inputString) {
	if (inputString == null) {
	    throw new IllegalArgumentException("String is null");
	}

	for (String word : inputString.split(SPACE)) {
	    inputString = inputString.replace(word, toReverseWord(word));
	}
	return inputString;
    }

    private String toReverseWord(String inWord) {
	char[] letters = inWord.toCharArray();
	StringBuilder outWord = new StringBuilder();
	int firstPointer = 0;
	int lastPointer = inWord.length() - 1;
	char tempLetter;

	while ((firstPointer < lastPointer) && (firstPointer >= 0)) {
	    if (Character.isLetter(letters[firstPointer]) && Character.isLetter(letters[lastPointer])) {
		tempLetter = letters[firstPointer];
		letters[firstPointer] = letters[lastPointer];
		letters[lastPointer] = tempLetter;
		firstPointer++;
		lastPointer--;
	    }
	    if (!Character.isLetter(letters[firstPointer])) {
		firstPointer++;
	    }
	    if (!Character.isLetter(letters[lastPointer])) {
		lastPointer--;
	    }
	}
	return outWord.append(letters).toString();
    }
}

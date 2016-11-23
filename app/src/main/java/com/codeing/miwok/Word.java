package com.codeing.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    private String mMiworkTranslation;
    private String mDefaultTranslation;

    public Word(String miworkTranslation, String defaultTranslation) {
        mMiworkTranslation = miworkTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getmMiworkTranslation() {
        return mMiworkTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
}

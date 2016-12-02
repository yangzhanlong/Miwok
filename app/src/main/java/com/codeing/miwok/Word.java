package com.codeing.miwok;

import android.widget.ImageView;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    private String mMiworkTranslation;
    private String mDefaultTranslation;
    private int mAudioResourceID;

    /** Image resource ID for the word */
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    // 因为PhraseAcitity没有图片，只需要两个参数的构造函数
    public Word(String defaultTranslation, String miworkTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String miworkTranslation, int imageResourceID, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    public String getmMiworkTranslation() {
        return mMiworkTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public int getmAudioResourceID() {
        return mAudioResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiworkTranslation='" + mMiworkTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mAudioResourceID=" + mAudioResourceID +
                ", mImageResourceID=" + mImageResourceID +
                '}';
    }
}

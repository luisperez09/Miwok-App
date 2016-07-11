package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn
 * It contains a default translation and a Miwok translation
 */
public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}

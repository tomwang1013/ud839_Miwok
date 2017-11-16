package com.example.android.miwok;

/**
 * Created by Seeyon on 2017-11-16.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiworkTranslation;

    public Word(String dt, String mt) {
        mDefaultTranslation = dt;
        mMiworkTranslation = mt;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiworkTranslation() {
        return mMiworkTranslation;
    }
}

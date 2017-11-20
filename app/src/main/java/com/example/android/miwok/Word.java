package com.example.android.miwok;

/**
 * Created by Seeyon on 2017-11-16.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiworkTranslation;
    private int mImgResId = -1;

    public Word(String dt, String mt) {
        mDefaultTranslation = dt;
        mMiworkTranslation = mt;
    }

    public Word(String dt, String mt, int imgResId) {
        mDefaultTranslation = dt;
        mMiworkTranslation = mt;
        mImgResId = imgResId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiworkTranslation() {
        return mMiworkTranslation;
    }

    public int getImgResId() {
        return mImgResId;
    }
}

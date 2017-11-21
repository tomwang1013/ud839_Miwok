package com.example.android.miwok;

/**
 * Created by Seeyon on 2017-11-16.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiworkTranslation;
    private int mImgResId = -1;
    private int mAudioResId;

    public Word(String dt, String mt, int audioResId) {
        mDefaultTranslation = dt;
        mMiworkTranslation = mt;
        mAudioResId = audioResId;
    }

    public Word(String dt, String mt, int imgResId, int audioResId) {
        mDefaultTranslation = dt;
        mMiworkTranslation = mt;
        mImgResId = imgResId;
        mAudioResId = audioResId;
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

    public int getAudioResId() {
        return mAudioResId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiworkTranslation='" + mMiworkTranslation + '\'' +
                ", mImgResId=" + mImgResId +
                ", mAudioResId=" + mAudioResId +
                '}';
    }
}

package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by kkuma on 31/03/2017.
 */

public class Word {
    private String mEng;
    private String mMiwok;
    private int mimg_id;
    private int msound_id;
    //Constructor
    Word(String eng, String miwok, int img, int sound_play){
        mEng = eng;
        mMiwok = miwok;
        mimg_id = img;
        msound_id = sound_play;
    }
    Word(String eng, String miwok, int sound_play){
        mEng = eng;
        mMiwok = miwok;
        msound_id = sound_play;
    }

    public String getEnglishWord() {
        return mEng;
    }
    public String getMiwokWord() {
        return mMiwok;
    }
    public int getImageId() {return mimg_id;}
    public int getSoundid(){
        return msound_id;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mEng='" + mEng + '\'' +
                ", mMiwok='" + mMiwok + '\'' +
                ", mimg_id=" + mimg_id +
                ", msound_id=" + msound_id +
                '}';
    }
}

package com.example.android.miwok;

/**
 * Created by admin on 9.2.2017..
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getmDefaultTranslation (){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }

}

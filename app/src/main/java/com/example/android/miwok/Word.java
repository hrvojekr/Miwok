package com.example.android.miwok;

/**
 * Created by admin on 9.2.2017..
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getmDefaultTranslation (){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    //Returns whether or not there is an image for this word

    public boolean hasImage (){
        return  mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

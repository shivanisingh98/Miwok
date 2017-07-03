package com.example.android.miwok;

/**
 * Created by shivani on 6/14/2017.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mimageId=-1;
    private int mAudioResourceId;

    public Word(String miwokTranslation, String defaultTranslation,int audioId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId=audioId;

    }
    public Word(String miwokTranslation, String defaultTranslation, int imageId,int audioId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mimageId=imageId;
        mAudioResourceId=audioId;
    }
    public boolean hasImage()
    {
        if(mimageId!=-1)
            return true;
        else
            return false;
    }
    public String getDefaultTranslation()

    {
        return mDefaultTranslation;
    }
    public int getImageId()
    {
        return mimageId;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getAudioResourceId(){ return mAudioResourceId;}

}

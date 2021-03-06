package com.evtde.android.criminalactivity;

import java.util.Date;
import java.util.UUID;

/**
 * Created by vilni on 02/10/2015.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public UUID getId() {
        return mId;
    }
     public String getPhotoFilename() {
        return "IMG_" +getId().toString() + ".jpg";
     }

    public boolean isSolved() {
        return mSolved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


}

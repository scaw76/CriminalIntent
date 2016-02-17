package com.saracawley.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by scawley on 2/10/16.
 */
public class Crime {

    private UUID mId;
    private  String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        mDate = new Date();
        mId = UUID.randomUUID();
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public UUID getId() {
        return mId;
    }

}

package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private String mIng1;
    //private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        //mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getIng1(){
        return mIng1;
    }

    public void setIng1(String ing1){
        mIng1 = ing1.toString();
    }


    /*
    public Date getDate() {
        return mDate;
    }

    /*
    public void setDate(Date date) {
        mDate = date;
    }
    */

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

}

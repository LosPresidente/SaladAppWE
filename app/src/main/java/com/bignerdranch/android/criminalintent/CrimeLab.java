package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }

        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Crime crime = new Crime();
            if(i==0){
                crime.setTitle("Fruit salad");
            }else if(i==1){
                crime.setTitle("hamburger");
            }else if(i==2){
                crime.setTitle("pizza");
            }else if(i==3){
                crime.setTitle("BBQ");
            }else if(i==4){
                crime.setTitle("Sandwich");
                //crime.setIng1("This is ING1");
            }

            crime.setSolved(i==0);
            mCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }

        return null;
    }
}

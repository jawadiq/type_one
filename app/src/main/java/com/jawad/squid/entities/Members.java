package com.jawad.squid.entities;

import android.os.Parcel;
import android.os.Parcelable;

public class Members implements Parcelable {

    private int DI;
    private String name;
    private String emaill;
    private String join;




    protected Members(Parcel in) {
    }

    public static final Creator<Members> CREATOR = new Creator<Members>() {
        @Override
        public Members createFromParcel(Parcel in) {
            return new Members(in);
        }

        @Override
        public Members[] newArray(int size) {
            return new Members[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}

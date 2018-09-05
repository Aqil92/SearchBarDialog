package com.aqil.searchbardialog.Model;


import com.aqil.mainlibrary.core.Searchable;

/**
 * Created by MADNESS on 5/16/2017.
 */

public class ContactModel implements Searchable {
    private String mName;
    private String mImageUrl;


    public ContactModel(String mName, String mImageUrl, String id, String ida, String nmaeids) {
        this.mName = mName;
        this.mImageUrl = mImageUrl;

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }


    @Override
    public String getTitle() {
        return mName;
    }

    public String getName() {
        return mName;
    }

    public ContactModel setName(String name) {
        mName = name;
        return this;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public ContactModel setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
        return this;
    }
}

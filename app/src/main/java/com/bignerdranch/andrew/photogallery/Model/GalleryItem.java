package com.bignerdranch.andrew.photogallery.Model;

import android.net.Uri;

/**
 * Created by andrew on 8/26/2015.
 */
public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;
    private String mOwner;

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }
    public Uri getPhotoPageUri(){
        return Uri.parse("http://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    @Override
    public String toString(){
        return mCaption;

    }
}

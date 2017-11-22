package com.recyclerview.demo;

/**
 * 作者：wangshy on 17/11/22 14:51
 *
 * @author wangshy
 */

public class ImageItme extends BaseItme {
    private String imageUrl;

    public ImageItme(int type) {
        setType(1);
    }

    public ImageItme(int type, String imageUrl) {
        setType(type);
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}

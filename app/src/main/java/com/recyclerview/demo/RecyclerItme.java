package com.recyclerview.demo;

import java.util.List;

/**
 * 作者：wangshy on 17/11/22 14:51
 */

public class RecyclerItme extends BaseItme {
    public RecyclerItme(int type, List<ImageItme> image) {
        setType(type);
        this.image = image;
    }

    public List<ImageItme> getImage() {
        return image;
    }

    public void setImage(List<ImageItme> image) {
        this.image = image;
    }

    private List<ImageItme> image;
}

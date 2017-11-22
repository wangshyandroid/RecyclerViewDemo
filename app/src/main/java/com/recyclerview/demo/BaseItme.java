package com.recyclerview.demo;

/**
 * 作者：wangshy on 17/11/22 14:53
 */

public class BaseItme implements Items {
    private int type;

    @Override
    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int getType() {
        return type;
    }
}

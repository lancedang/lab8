package com.ppdai.tutorial;

/**
 * Created by qiankai02 on 2017/7/12.
 */
public enum Nature {
    BRAVE,
    QUIET,
    RELAXED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}

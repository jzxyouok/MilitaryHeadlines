package com.xmx.mh.common.data.sql;

/**
 * Created by The_onE on 2016/1/11.
 */
public abstract class DeleteCallback {

    public abstract void proceeding(int index);

    public abstract void success(int total);
}

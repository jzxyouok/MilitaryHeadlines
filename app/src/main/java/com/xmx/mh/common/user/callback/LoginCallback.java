package com.xmx.mh.common.user.callback;

import com.avos.avoscloud.AVException;
import com.xmx.mh.common.user.UserData;

/**
 * Created by The_onE on 2016/1/11.
 */
public abstract class LoginCallback {

    public abstract void success(UserData user);

    public abstract void error(int error);

    public abstract void error(AVException e);
}

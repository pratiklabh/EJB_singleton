package com.sts.ejb_singleton.test;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
public class CounterBean implements CounterBeanLocal{

    private int count = 0;

    @Lock(LockType.WRITE)
    public void increment() {
        count++;
    }

    @Lock(LockType.READ)
    public int getCount() {
        return count;
    }
}

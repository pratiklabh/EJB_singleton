package com.sts.ejb_singleton.test;
import javax.ejb.Local;

@Local
public interface CounterBeanLocal {
    void increment();
    int getCount();
}
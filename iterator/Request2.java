package com.example.helloworld.androiddesignpattern.iterator;

/**
 * Created by helloworld on 2017/6/14.
 */

public class Request2 extends AbstractRequest{
    public Request2(Object object) {
        super(object);
    }

    @Override
    protected int getRequestLevel() {
        return 2;
    }
}

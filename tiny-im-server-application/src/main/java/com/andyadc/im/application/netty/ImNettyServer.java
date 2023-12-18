package com.andyadc.im.application.netty;

public interface ImNettyServer {

    boolean ready();

    void start();

    void shutdown();
}

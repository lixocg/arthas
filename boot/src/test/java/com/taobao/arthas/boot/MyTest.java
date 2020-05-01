package com.taobao.arthas.boot;

import com.taobao.arthas.common.SocketUtils;

public class MyTest {
    public static void main(String[] args) {
        long tcpListenProcess = SocketUtils.findTcpListenProcess(3658);
        System.out.println(tcpListenProcess);
    }
}

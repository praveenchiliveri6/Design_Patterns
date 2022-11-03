package com.pattern.adapter;

import com.pattern.adapter.ClientPen;

public class PenAdapter implements Pen {

    ClientPen clientPen = new ClientPen();
    @Override
    public void write(String content) {
        clientPen.writeContent(content);
    }
}

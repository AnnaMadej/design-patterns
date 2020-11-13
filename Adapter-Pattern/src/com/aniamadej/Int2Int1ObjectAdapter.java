package com.aniamadej;

public class Int2Int1ObjectAdapter implements Int1{

    private Int2 source;

    public Int2Int1ObjectAdapter(Int2 source) {
        this.source = source;
    }

    @Override
    public void doSomething() {
       source.doSomethingElse();
    }

}

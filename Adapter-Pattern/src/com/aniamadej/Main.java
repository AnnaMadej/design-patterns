package com.aniamadej;

public class Main {

    public static void main(String[] args) {
        Client client = new Client(new ClassOfInt1());
        client.callObj();

        Int2 coi2 = new ClassOfInt2();
        Client client2 = new Client(new Int2Int1ObjectAdapter(coi2));
        client2.callObj();



        Client client3 = new Client(new ClassOfInt1());
        client.callObj();

        Client client4= new Client(new Int2Int1ClassAdapter());
        client2.callObj();
    }
}

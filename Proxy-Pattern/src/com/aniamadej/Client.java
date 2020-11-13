package com.aniamadej;

public class Client {
    private String name;
    private IServer server;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public String getName() {
        return this.name;
    }

    public Client(String name, IServer server) {
        this.name = name;
        this.server = server;
    }

    public void speakOnServer(String words){
        server.printMessage(this, words);
    }
}

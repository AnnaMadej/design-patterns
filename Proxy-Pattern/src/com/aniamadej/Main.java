package com.aniamadej;

public class Main {

    public static void main(String[] args) {

        PermissionsHolder<Client> permHolder = new PermissionsHolder<>();

        ConcreteServer concreteServer = new ConcreteServer();
        IServer serverProxy = new Proxy(permHolder, concreteServer);
        Client client = new Client("Jacek", serverProxy);

        client.speakOnServer("Witam wszystkich!");
        permHolder.askForPermission(client);
        client.speakOnServer("Witam wszystkich!");

        Client client2 = new Client("Placek", serverProxy);
        permHolder.askForPermission(client2);
        client2.speakOnServer("no siemano!");
    }
}

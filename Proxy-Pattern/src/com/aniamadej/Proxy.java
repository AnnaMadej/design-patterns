package com.aniamadej;

public class Proxy implements IServer {
    private PermissionsHolder<Client> permissionsHolder;
    private ConcreteServer server;

    public Proxy(PermissionsHolder<Client> permissionsHolder, ConcreteServer server) {
        this.permissionsHolder = permissionsHolder;
        this.server = server;
    }

    @Override
    public void  printMessage(Client client, String message) {

        if(permissionsHolder.isPermitted(client)){
            if(!server.isRunning()) {
                server.start();
            }
            server.printMessage(client, message);
        }
        else{
            System.out.println("*** " + client.getName() + " is not permitted to speak on server!");
        }
    }
}

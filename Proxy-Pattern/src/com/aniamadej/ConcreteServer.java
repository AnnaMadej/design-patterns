package com.aniamadej;

public class ConcreteServer implements IServer{

    private boolean isRunning = false;


    @Override
    public void printMessage(Client client, String message) {
        System.out.println(client.getName() + " says: " + message);
    }

    public void start(){
        if (!isRunning) {
            System.out.println("Server is started!");
            isRunning = true;
        }
    }

    public boolean isRunning() {
        return isRunning;
    }
}

package com.aniamadej;

import java.util.ArrayList;
import java.util.List;

public class PermissionsHolder<E> {
    List<E> clients = new ArrayList<E>();

    public boolean isPermitted(E client){
        return clients.contains(client);
    }

    public void askForPermission(E client){
        clients.add(client);
    }
}



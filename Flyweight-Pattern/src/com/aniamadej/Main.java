package com.aniamadej;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        client.addSnowFlake(1, 12, 144, 14);
        client.addSnowFlake(1, 12, 11, 2);
        client.addSnowFlake(2, 12, 90, 12);

        System.out.println("number of snowflakes: " + client.getSnowFlakes().size());
        System.out.println("number of flyweights: " + client.getSnowFlakesCommonElements().size());

        Flyweight flyweight1 = client.getSnowFlakes().get(0).getFlyWeight();
        Flyweight flyweight2 = client.getSnowFlakes().get(1).getFlyWeight();
        Flyweight flyweight3 = client.getSnowFlakes().get(2).getFlyWeight();

        System.out.println("address of flyweight of snowflake 1: " + flyweight1);
        System.out.println("address of flyweight of snowflake 2: " + flyweight2);
        System.out.println("address of flyweight of snowflake 3: " +flyweight3);

        System.out.println("flyweights 1 and 2 are the same: "  + (flyweight1==flyweight2));
        System.out.println("flyweights 1 and 3 are the same: "  + (flyweight1==flyweight3));
    }
}

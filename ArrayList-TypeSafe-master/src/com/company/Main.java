package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> nesne= new ArrayList<>();

        nesne.add("Araba");

        nesne.add("Helikopter");

        nesne.add("Uçak");

        nesne.add("Drone");

        nesne.add("Traktör");

        for (String object:nesne)
        {
            System.out.println(object);
        }
    }
}

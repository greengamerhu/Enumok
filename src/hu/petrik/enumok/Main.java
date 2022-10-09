package hu.petrik.enumok;

import hu.petrik.enumok.bolygo.Bolygo;

public class Main {
    public static void main(String[] args) {
        int suly = 100;
        double tomeg =(suly / Bolygo.FOLD.getGravitacio());

        for (Bolygo bolygo : Bolygo.values()) {
            System.out.println(bolygo + ": " + bolygo.getSuly(tomeg));
        }
    }
}

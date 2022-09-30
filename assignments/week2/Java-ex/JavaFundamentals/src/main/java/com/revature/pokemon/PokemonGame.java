package com.revature.pokemon;

public class PokemonGame {

    /*
    Goal: We want to create some sort of console application that allows us to traverse around and catch/battle pokemon

    For those uninitiated, in the game of pokemon you can have AT MOST 6 pokemon with you at a time

    We should be able to maybe catch a pokemon, view our current pokemon and maybe view our party
     */

    public static void main(String[] args) {
        // Before we get too deep let's make sure we can create some pokemon with random values

        // Testing pokemon creation
        Pokemon p1 = new Pokemon("Sandshrew");

        Pokemon p2 = new Pokemon("Shinx");

        Pokemon p3 = new Pokemon("Staryu");

        Pokemon p4 = new Pokemon("Sableye");

        System.out.println(p1.name + " " + p1.attack + " " + p1.level + " " + p1.health);
        System.out.println(p2.name + " " + p2.attack + " " + p2.level + " " + p2.health);
        System.out.println(p3.name + " " + p3.attack + " " + p3.level + " " + p3.health);
        System.out.println(p4.name + " " + p4.attack + " " + p4.level + " " + p4.health);

        // Testing pokemon battling
        p1.battle(p2);

        System.out.println("------------------------------------------------------------");
        System.out.println(p1.name + " " + p1.attack + " " + p1.level + " " + p1.health);
        System.out.println(p2.name + " " + p2.attack + " " + p2.level + " " + p2.health);



    }
}

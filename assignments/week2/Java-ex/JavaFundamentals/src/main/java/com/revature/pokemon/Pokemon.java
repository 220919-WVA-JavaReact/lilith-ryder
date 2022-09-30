package com.revature.pokemon;

import java.util.Random;

public class Pokemon {

    /*
    We need to think about what kind of information we want to store about the pokemon

    SO things we may want are name, level, health, attack
     */

    String name;

    int level;

    int health;

    int attack;

    // Now that we have a pokemon we might want find some way to construct our pokemon object

    public Pokemon(String name){
        this.name = name;
        // Now how do we randomize some values?

        Random random = new Random();

        // Now we have a random object let's create some random values

        this.level = random.nextInt(100) + 1;

        this.health = random.nextInt(100) + 1;

        this.attack = random.nextInt(100) + 1;
    }

    /*
    We now have a way to create a pokemon object but what about attacking and stuff?

    We need to create a method so these pokemon can battle

    We can also create an attempt catch method
     */

    // Let's start our method for battling pokemon

    public Pokemon battle(Pokemon opponent){

        // How do we battle?

        // When my pokemon attacks another pokemon, my attack should reduce their health and their attack should
        // reduce my pokemon's health

        opponent.health -= this.attack;

        this.health -= opponent.attack;

        return opponent;
    }


}

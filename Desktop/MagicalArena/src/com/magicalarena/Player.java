package com.magicalarena;

public class Player {
    private String playerName;
    private int health;
    private int strength;
    private int attack;

    public Player(String playerName, int health, int strength, int attack) {
        this.playerName = playerName;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0;
    }
}

package com.magicalarena;

public class Arena {
    public static Player fight(Player player1, Player player2) {
        Player attacker = player1.getHealth() < player2.getHealth() ? player1 : player2;
        Player defender = attacker == player1 ? player2 : player1;

        while (player1.isAlive() && player2.isAlive()) {
            int attackRoll = Dice.roll();
            int defendRoll = Dice.roll();

            int attackDamage = attacker.getAttack() * attackRoll;
            int defendDamage = defender.getStrength() * defendRoll;

            int damage = Math.max(attackDamage - defendDamage, 0);
            defender.setHealth(Math.max(defender.getHealth() - damage, 0));

            System.out.println(attacker.getPlayerName() + " attacks " + defender.getPlayerName() + " for " + damage + " damage!");
            System.out.println(defender.getPlayerName() + " health is now " + defender.getHealth());

            // Swap attacker and defender
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        Player winner = player1.isAlive() ? player1 : player2;
        System.out.println(winner.getPlayerName() + " wins the fight!");
        return winner;
    }
}

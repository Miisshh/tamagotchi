package com.example.myproject;
 public class Tamagotchi {
        String name;
        static int food;
        int happiness;
        int health;
        public Tamagotchi(String name) {
            this.name = name;
            this.food = 100;
            this.happiness = 50;
            this.health = 100;
        }


     public void feed(int amount) {
            this.food += amount;
        }
        public void play(int amount) {
            this.happiness += amount;
        }
    }

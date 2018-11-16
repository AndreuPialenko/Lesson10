package Наследование;

import Наследование.Animal;

public class Dog extends Animal {

        public void move(){
            System.out.println("move like a dog");
        }
        private String color;

        private void gav(){
            this.color = "black";
            this.Food = "bone";
//            this.isVegetarian = false;
        }

}

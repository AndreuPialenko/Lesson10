package Наследование;

import Наследование.Animal;

public class Cat extends Animal {

    public void move(){
        System.out.println("move like a cat");
    }
        private String poroda;

        public Cat(boolean isVegan, String Food, String poroda){
            super(isVegan, Food);
            this.poroda = poroda;
        }
        public String getPoroda(){

            return poroda;
        }
}

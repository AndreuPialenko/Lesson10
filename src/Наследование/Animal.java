package Наследование;

public abstract class Animal {

    public abstract void move();
    private boolean isVegetarian;
    protected String Food;

    public Animal(){}

    public Animal(boolean isVegan, String Food) {
        this.isVegetarian = isVegetarian;
        this.Food = Food;

    }
     public boolean isVegetarian(){

        return isVegetarian;
     }

    public String getFood() {

         return Food;
    }

    public final void printInfo(){
        System.out.println("я наследник Animal");
    }

}

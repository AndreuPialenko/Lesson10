package Инкапсуляция;

import Наследование.Cat;
import Наследование.Dog;

public class Application {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0);
        robot.doStep();
        robot.setX(100500);   //При инкапсуляции, мы закрываем доступ и скходному коду, чтобы нельзя было неправильно
        robot.setY(12345);  //использовать код

        System.out.println(robot.getX());

        Dog dog = new Dog();
//        Cat cat = new Cat();
        dog.printInfo();
//        cat.printInfo();
    }

}

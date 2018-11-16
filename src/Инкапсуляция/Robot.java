package Инкапсуляция;

public class Robot {

    private int x;
    private int y;


    public Robot(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }



    public int getY() {
        return y;
    }



    public void doStep(){
        x++;
        y++;
    }

    public void setX(int x){
        if (x<=3){
            this.x = x;

        }else {
            System.out.println("слишком большой шаг");
        }

    }

    public void setY(int y){
        if (y<=3 && y>0){
            this.y = y;
        }else {
            System.out.println("слишком большой шаг");
        }
    }


    }




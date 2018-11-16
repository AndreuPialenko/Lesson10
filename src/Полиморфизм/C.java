package Полиморфизм;

public class C extends B{
    public void m3(){
        System.out.println("m3 from C");
    }

    @Override // переопределение, делается для удобства
    public void m2(){
        System.out.println("m2 from C");
    }

    public void m1(){
        System.out.println("m1 from c");
    }
}

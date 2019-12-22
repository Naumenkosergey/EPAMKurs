package module4;

public class Test1 {
    int a;
    int b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void sum(){
        System.out.println(this.a+this.b);
    }

    public void costumer(){
        if (this.a>=this.b)
            System.out.println("Переменная а больше b");
        else
            System.out.println("Переменная b больше a");
    }
}

class Runner{
    public static void main(String[] args) {
        Test1 test1 = new Test1(5,6);
        test1.setA(15);
        test1.setB(140);
        System.out.println(test1.getA());
        System.out.println(test1.getB());
        test1.sum();
        test1.costumer();
    }
}

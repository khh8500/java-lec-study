package ex05;

public class PizzaTest1 {
    public static void main(String[] args) {
        Pizza1 p1 = new Pizza1("Super Supreme");
        Pizza1 p2 = new Pizza1("Cheese");
        Pizza1 p3 = new Pizza1("Pepperoni");
        int n = Pizza1.count;
        System.out.println("지금까지 판매된 개수 = " + n);
    }
}

package ex06.example7;

public class BurgerSet { // has Burger, Coke
    private Burger burger;
    private Coke coke; // 다른 객체를 적는 것이 결합

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요");
    }

    public int getTotalPrice() {
        return burger.getPrice() + coke.getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}

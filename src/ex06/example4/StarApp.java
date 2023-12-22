package ex06.example4;

public class StarApp {

    public static void gameStart(Protosss u1, Protosss u2) {
        u1.attack();
        u2.attack();
        System.out.println();
    }

    public static void main(String[] args) {
        Protosss z1 = new Zealot("z1"); // [Zealot, Protoss]
        Protosss d1 = new Dragoon("d1"); // [Dragoon, Protoss]
        Protosss r1 = new River("r1"); // [River, Protoss]
        Protosss dark1 = new Dark("dark1"); // [Dark, Protoss]

        gameStart(z1, d1);
        gameStart(dark1, d1);
    }
}

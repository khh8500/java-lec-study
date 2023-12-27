package ex08;

class Account extends Object{ // 생략되어 있음
    public String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        System.out.println(account); // 겟클래스@16진수
        System.out.println(account.toString()); // 같음
        System.out.println(account.getClass());
        System.out.println(account.hashCode());
    }
}

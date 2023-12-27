package ex08;

class Account extends Object{ // extends Object 생략되어 있음
    public String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() { // 재정의
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
        Account account2 = new Account("홍길동", 1111, 1000);
        System.out.println(account); // 겟클래스@16진수
        System.out.println(account.toString()); // 같음
        System.out.println(account.getClass());
        System.out.println(account.hashCode()); // 메모리 검증

        //메모리 값 비교, (주소 비교)
        if (account == account2) {
            System.out.println("같아요?");
        }

        // account -> equals() (오브젝트) (주소비교)
        // account.toString -> equals() (주소비교 and 값비교)
        if (account.toString().equals(account2.toString())) {
            System.out.println("같아요?");
        }

    }
}

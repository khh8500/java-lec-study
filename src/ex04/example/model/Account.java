package ex04.example.model;

public class Account {
    final int id; // 계좌번호 (숫자 4자리로 만들어져있다) 숫자가 길어서 보통 번호지만 문자열로 만듦
    long balance; // int면 21억5천정도가 최대
    int userId; // 1, 부식별자가 필요함, 하나로는 식별에 위험이 따름

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}

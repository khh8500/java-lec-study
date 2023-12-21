package ex04.example2;

import ex04.example2.model.Account;
import ex04.example2.model.User;

public class BankApp {
    public static void main(String[] args) {
        //1. 고객 2명 만들기
        User ssar = new User(1, "ssar", "ssar@nate.com");
        User cos = new User(2, "cos", "cos@nate.com");

        //2. 계좌 2개 만들기
        Account ssarAccount = new Account(1111, 1000L, 1);
        Account cosAccount = new Account(2222, 1000L, 2);

        //3. 고객에게 정보를 받기 (sender, receiver, amount)
        long amount = 0L;

        //4. 이체 (ssar -> cos 1000원) // 트렌젝션(서비스)로 묶어야 한다.
        BankService.이체(ssarAccount, cosAccount, amount);
    }
}

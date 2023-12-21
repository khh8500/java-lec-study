package ex04.example2;

import ex04.example2.model.Account;

// 트렌젝션 관리, 수정할 때 트렌젝션에서만 보면 된다.
public class BankService {

    public static void 이체(Account senderAccount, Account receiverAccount, long amount){
        if (amount <= 0) {
            System.out.println("0원 이하 금액을 이체할 수 없습니다.");
            return;
        }
        senderAccount.출금(amount);
        receiverAccount.입금(amount);
    }
}

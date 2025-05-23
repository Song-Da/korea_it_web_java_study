package _21_class.bankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);
//        bankAccount.deposit(-4000);
        bankAccount.withdraw(2400);
//        bankAccount.withdraw(8000);
//        bankAccount.getBalance(); // 출력을 하려면 sout 해서 볼 수 있음.
        System.out.println(bankAccount.getBalance());
    }

    /*
    문제
    WaterBottle => WaterBottle 클래스, WaterBottleMain
    currentWater 현재 물의 양 => private
    메소드
    물 채우기(fill) => 최대 용량인 1000을 넘을 수 없음.
    물 마시기(drink) => 현재 물의 양보다 초과해서 마실 수 없다
    getter을 통해 현재 물병의 물의 양에 접근할 수 있다.
     */
}
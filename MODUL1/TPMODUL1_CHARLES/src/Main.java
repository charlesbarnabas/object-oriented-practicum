public class Main {
    public static void main(String[] args) {
        Account akun1 = new Account("Naufal_SI4608", "1202223030", 100000.0);
        Account akun2 = new Account("Tegar", "1202200997", 200000.0);
        Account akun3 = new Account("Gemilang", "1202200999", 300000.0);
        Bank bank = new Bank();

        bank.addAccount(akun1);
        bank.addAccount(akun2);
        bank.addAccount(akun3);

        System.out.println("Saldo akun "+akun1.getName()+": "+akun1.getBalance());
        System.out.println("Saldo akun "+akun2.getName()+": "+akun2.getBalance());
        System.out.println("Saldo akun "+akun3.getName()+": "+akun3.getBalance());

        System.out.println();

        akun1.deposit(50000);
        akun2.withdraw(20000);

        System.out.println("Saldo akun "+akun1.getName()+" setelah menyetor: "+akun1.getBalance());
        System.out.println("Saldo akun "+akun2.getName()+ " setelah menarik uang: "+akun2.getBalance());

        System.out.println();

        bank.removeAccount("Tegar");
        System.out.println(); 

        System.out.println("Daftar Akun dalam Bank:");
        for (Account account : bank.getAllAccounts()) {
            System.out.println("Nama: " + account.getName()+ ", Nomor Akun: "+account.getAccountNumber()+", Saldo : "+account.getBalance());
        }
    }
}

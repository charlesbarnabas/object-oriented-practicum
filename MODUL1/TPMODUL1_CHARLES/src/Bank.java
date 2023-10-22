import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(String name) {
        Account accountToremove = null;
        for (Account account : accounts) {
            if (account.getName().equals(name)){
                accountToremove = account;
                break;
            }
        }

        if (accountToremove != null){
            accounts.remove(accountToremove);
            System.out.println("Akun "+name+" berhasil dihapus");
        }
    }

    public Account getAccount(String name) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(name)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }
}

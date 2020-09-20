package th.ac.ku.atm.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import sun.swing.BakedArrayList;
import th.ac.ku.atm.model.BankAccount;
import th.ac.ku.atm.model.Customer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {
    private List<BankAccount> bankAccountList;
    @PostConstruct
    public void postConstruct() {
        this.bankAccountList = new ArrayList<>();
    }
    public void createBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }
    public List<BankAccount> getBankAccounts() {
        return new ArrayList<>(this.bankAccountList);
    }
    public BankAccount findBankAccount(int id) {
        for (BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getId()==id)
                return bankAccount;
        }
        return null;
    }
}

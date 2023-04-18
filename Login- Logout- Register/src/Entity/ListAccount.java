package Entity;

import java.util.ArrayList;

public class ListAccount {
    ArrayList<Account> accounts;
    public ListAccount() {
        this.accounts = new ArrayList<>();
        accounts.add(new Account("duy123", "duynvhe0603@gmail.com", "123"));
        accounts.add(new Account("long123", "luonghoanglong2203@gmail.com", "123"));
        accounts.add(new Account("hieu123", "hieu2009@gmail.com", "123"));
    }
    public ArrayList<Account> listAccount() {
        return accounts;
    }


}

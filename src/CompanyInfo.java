
import java.io.Serializable;

public class CompanyInfo implements Serializable {
    String Name;
    String Address;
    String PhoneNum;
    String Email;
    String CashierName;
    int ReceiptNo;
    public CompanyInfo(String Name, String Address, String PhoneNum, String Email, String CashierName, int LastReceiptNo) {
        this.Name = Name;
        this.Address = Address;
        this.PhoneNum = PhoneNum;
        this.Email = Email;
        this.CashierName = CashierName;
        this.ReceiptNo = LastReceiptNo + 1;
    }
    String getName() { return this.Name; }
    String getAddress() { return this.Address; }
    String getPhoneNum() { return this.PhoneNum; }
    String getEmail() { return this.Email; }
    String getCashierName() { return this.CashierName; }
    int getReceiptNo() { return this.ReceiptNo; }
    
}

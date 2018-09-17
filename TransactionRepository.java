package Assignment.Interface;

import Assignment.entities.Transactions;
import java.util.List;
import javax.ejb.Remote;

/**
 * @autor Yizheng Luo
 */
@Remote
public interface TransactionRepository {


    public void addTransaction(Transactions transaction) throws Exception;


    public Transactions searchTransactionByNo(int transaction_no) throws Exception;

    public Transactions searchTransactionByName(String transaction_name) throws Exception;
    
    public List<Transactions> SearchTransactionByType(String type) throws Exception;
    
    public List<Transactions> getAllTransactions() throws Exception;
    
    public void removeTransaction(int transaction_no) throws Exception;
    
    
}

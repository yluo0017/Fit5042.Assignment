package Beans;

import Assignment.Interface.TransactionRepository;
import Assignment.entities.Transactions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

/**
 * @author Yizheng Luo
 */
@ManagedBean(name = "transactionApplication")
@Named(value = "transactionApplication")
@ApplicationScoped
public class TransactionApplication implements Serializable{

    public static final String APP_TITLE = "Transaction Browser";
    private List<Transactions> tList;

    @EJB
    private TransactionRepository ti;

    public TransactionApplication() {
        tList = new ArrayList<>();
        tList.add(new Transactions(1,"first"));
        tList.add(new Transactions(2,"second"));
        
        
        
//        try {
//            tList = ti.getAllTransactions();
//            System.out.println("**************************");
//            System.out.println(tList);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            Logger.getLogger(TransactionApplication.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }  

    public List<Transactions> gettList() {
        return tList;
    }
   

}

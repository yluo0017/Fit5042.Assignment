package Assignment.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Yizheng Luo
 */
@Entity
@NamedQueries({@NamedQuery(name = Transactions.GET_ALL_QUERY_NAME, query = "SELECT t FROM Transactions t")})
public class Transactions implements Serializable {
    
    public static final String GET_ALL_QUERY_NAME = "Transactions.getAll";
    
    private int transaction_no;    
    private String transaction_name;
    private String type;
    private String description;
    private Person user;

    public Transactions() {
    }

    public Transactions(int transaction_no, String transaction_name) {
        this.transaction_no = transaction_no;
        this.transaction_name = transaction_name;
    }
       

    public Transactions(int transaction_no, String transaction_name, String type, String description, Person user) {
        this.transaction_no = transaction_no;
        this.transaction_name = transaction_name;
        this.type = type;
        this.description = description;
        this.user = user;
    }
    


    @Id
    @Column(name = "Transaction_no")
    @GeneratedValue
    public int getTransaction_no() {
        return transaction_no;
    }

    public void setTransaction_no(int transaction_no) {
        this.transaction_no = transaction_no;
    }

    public String getTransaction_name() {
        return transaction_name;
    }

    public void setTransaction_name(String transaction_name) {
        this.transaction_name = transaction_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transactions{" + "transaction_no=" + transaction_no + ", transaction_name=" + transaction_name + ", type=" + type + ", description=" + description +'}';
    }

    @ManyToOne
    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }
  
    
    
}
package Assignment.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Yizheng Luo
 */
@Entity
@Table(name = "Person")
@NamedQueries({@NamedQuery(name = Person.GET_ALL_QUERY_NAME, query = "SELECT p FROM Person p")})
public class Person implements Serializable {
   
    
    public static final String GET_ALL_QUERY_NAME = "Person.getAll";
    private int id;
    private String lname;
    private String fname;
    private String email;
    private String password;
    private String userRole;
    private String address;
    private String city;
    private String country;
    private String postcode; 
    private String phone;
    private Set<Transactions> transactionses;

    public Person() {
    }

    public Person(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public Person(int id, String lname, String fname, String email, String password, String userRole, String address, String city, String country, String postcode, String phone, Set<Transactions> transactionses) {
        this.id = id;
        this.lname = lname;
        this.fname = fname;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
        this.address = address;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
        this.phone = phone;
        this.transactionses = transactionses;
    }

    


    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @OneToMany
    @ElementCollection    
    public Set<Transactions> getTransactionses() {
        return transactionses;
    }

    public void setTransactionses(Set<Transactions> transactionses) {
        this.transactionses = transactionses;
    }
    

}

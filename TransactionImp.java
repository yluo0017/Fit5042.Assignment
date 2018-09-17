/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.repositoryImp;

import Assignment.Interface.TransactionRepository;
import Assignment.entities.Transactions;
import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Yizheng Luo
 */
@Stateful
public class TransactionImp implements TransactionRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addTransaction(Transactions t) throws Exception {
        entityManager.persist(t);
    }

    @Override
    public Transactions searchTransactionByNo(int no) throws Exception {
        return entityManager.find(Transactions.class, no);
    }

    @Override
    public Transactions searchTransactionByName(String name) throws Exception {
            Query query = entityManager.createQuery("SELECT t FROM Transactions t where t.transaction_name=?1");
            query.setParameter(1, name);
            return (Transactions) query.getSingleResult();
    }

    @Override
    public List<Transactions> SearchTransactionByType(String type) throws Exception {
        Query query = entityManager.createQuery("SELECT t FROM Transactions t where t.type=?1");
            query.setParameter(1, type);
            return query.getResultList();
    }

    @Override
    public List<Transactions> getAllTransactions() throws Exception {
        Query query = entityManager.createQuery("SELECT t FROM Transactions t");
        System.out.println("**************************");
        List<Transactions> list = query.getResultList();
        System.out.println(list);
        return list;
    }

    @Override
    public void removeTransaction(int no) throws Exception {
        entityManager.remove(searchTransactionByNo(no));
    }
    
}

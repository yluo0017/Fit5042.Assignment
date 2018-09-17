/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.entities;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Admin
 
@Entity
@Table(name = "Holiday")
@NamedQueries({@NamedQuery(name = Holiday.GET_ALL_QUERY_NAME, query = "SELECT h FROM Holiday h")})
public class Holiday {
    
    private String final GET_ALL_QUERY_NAME = "Holiday.getAll";
    private String id;
    private String name;
}
*/
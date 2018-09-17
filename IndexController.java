/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Yizheng Luo
 */
@Named(value = "indexController")
@RequestScoped
public class IndexController {

    private String pageTitle;

    public IndexController() {

        pageTitle = "Holiday Booking System";
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }
}


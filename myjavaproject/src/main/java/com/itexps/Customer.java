/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps;

/**
 *
 * @author Ishvar
 */
public class Customer {
    private String first;
    private String last;
    private String email;
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public Customer() {
    }
    
    
    @Override
    public String toString() {
        return "Customer{" + "first=" + first + ", last=" + last + ", email=" + email +", number=" + number + '}';
    }
    

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

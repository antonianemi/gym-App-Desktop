/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aztsoft.gym.persistence.dao;

import com.aztsoft.gym.domain.CustomerRegistration;

/**
 *
 * @author windows
 */
public interface CustomerDao {
    void postCustomer(CustomerRegistration registry);
}

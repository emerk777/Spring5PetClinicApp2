/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petclinicdata.services;

import com.example.petclinicdata.model.Owner;
import java.util.Set;

/**
 *
 * @author emer
 */
public interface OwnerService extends CrudService{
    
    Owner findByLastName(String lastName);
    
}

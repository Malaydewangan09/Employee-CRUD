package com.ahmadsolehin.SUSAHCRUDNIE.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmergencyContact {

    private String name ;
    private String number ;
    private String relationship ;

}

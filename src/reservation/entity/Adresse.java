/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.entity;

import javax.persistence.Embeddable;

/**
 *
 * @author formation
 */
@Embeddable
public class Adresse {
    
    private String rue;
    private String localite;
    private String pays;
    private Long codePostal;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author K1R4
 */
@Entity
public class Operater extends Osoba {

    private String lozinka;

    @Enumerated(EnumType.STRING)
    private Uloga uloga;

    public static enum Uloga {
        Operater,
        Administrator
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public Uloga getUloga() {
        return uloga;
    }

    public void setUloga(Uloga uloga) {
        this.uloga = uloga;
    }

    @Override
    public String toString() {
        return getImePrezime() + " (" + getUloga() + ")";
    }

}

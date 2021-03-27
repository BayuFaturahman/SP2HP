/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pusiknas.web.entity;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Bayu Faturahman
 */
@Entity
@Table(name = "mahasiswa")
public class mahasiswaEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
@GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private Integer id;

   @Column(name = "nama")
    private String nama;

   @Column(name = "nrp")
    private Integer nrp;

   @Column(name = "jurusan")
    private String jurusan;

   @Column(name = "email")
    private String email;

   public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getNrp() {
        return nrp;
    }

    public void setNrp(Integer nrp) {
        this.nrp = nrp;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "mahasiswaEntity{" + "id=" + id + ", nama=" + nama + ", nrp=" + nrp + ", jurusan=" + jurusan + ", email=" + email + '}';
    }


    
}

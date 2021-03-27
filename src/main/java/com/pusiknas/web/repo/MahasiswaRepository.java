/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pusiknas.web.repo;

import com.pusiknas.web.entity.mahasiswaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bayu Faturahman
 */
@Repository
@Transactional
public interface  MahasiswaRepository extends JpaRepository<mahasiswaEntity, String> {
    
    @Query(value = "SELECT * FROM mahasiswa order by id asc ", nativeQuery = true)
    List<MahasiswaRepository> getListMahasiwa();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pusiknas.web.service;

import com.pusiknas.web.entity.mahasiswaEntity;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bayu Faturahman
 */
@Service
public interface MahasiswaService {
        List<mahasiswaEntity> getListMahasiwa();

    
    
}

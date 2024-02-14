package com.example.demoo.DataAccess.Abstracts;


import com.example.demoo.Entities.Concrates.Ikdosya;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IkdosyaDao extends JpaRepository<Ikdosya,Long> {
    List<Ikdosya> findBysGuvenlikNo(Long sGuvenlikNo);
}

package com.example.demoo.DataAccess.Abstracts;


import com.example.demoo.Entities.Concrates.Kullanıcı;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KullanıcıDao extends JpaRepository<Kullanıcı,Integer> {
}

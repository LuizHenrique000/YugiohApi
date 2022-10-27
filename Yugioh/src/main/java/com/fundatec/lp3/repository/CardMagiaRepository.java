package com.fundatec.lp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fundatec.lp3.model.CardMagia;

@Repository
public interface CardMagiaRepository extends JpaRepository<CardMagia, Integer>{

}

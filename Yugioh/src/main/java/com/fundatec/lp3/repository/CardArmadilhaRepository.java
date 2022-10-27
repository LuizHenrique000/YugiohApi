package com.fundatec.lp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fundatec.lp3.model.CardArmadilha;

@Repository
public interface CardArmadilhaRepository extends JpaRepository<CardArmadilha, Integer> {

}

package com.vitorandrade.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorandrade.dsmovie.entities.Score;
import com.vitorandrade.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository <Score,ScorePK>{

}

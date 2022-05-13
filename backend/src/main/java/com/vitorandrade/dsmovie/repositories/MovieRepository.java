package com.vitorandrade.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorandrade.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository <Movie,Long>{

}

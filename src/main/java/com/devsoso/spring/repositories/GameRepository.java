package com.devsoso.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsoso.spring.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

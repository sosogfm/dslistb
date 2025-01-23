package com.devsoso.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsoso.spring.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

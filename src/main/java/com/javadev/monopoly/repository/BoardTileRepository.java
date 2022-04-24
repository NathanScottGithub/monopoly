package com.javadev.monopoly.repository;

import com.javadev.monopoly.model.BoardTile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardTileRepository extends JpaRepository<BoardTile, Integer> {

//    BoardTile getByB(Integer id);

}
package com.lab2.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Game;
import com.lab2.repositorio.GameRepository;


@Service("gameService")
public class GameServiceImpl implements GameService{

	@Autowired
	private GameRepository gameRepository;
	@Override
	public void saveGame(Game game) {
		gameRepository.save(game);
	}

}
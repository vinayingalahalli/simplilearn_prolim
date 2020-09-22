package com.spring.jdbc.demo.dao;

import java.util.List;

import com.spring.jdbc.demo.model.Player;

public interface PlayerDAO {

	public Player createPlayer(Player player);
	public Player updatePlayer(Player player);
	public Player getPlayerById(int id);
	public List<Player> getAllPlayers();
	public void removePlayerById(int id);
	public List<Player> getPlayersByAge(int age);
	public List<Player> getPlayersByTeamName(String teamName);
}

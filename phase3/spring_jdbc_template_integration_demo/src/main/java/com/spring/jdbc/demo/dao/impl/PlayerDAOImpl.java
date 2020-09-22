package com.spring.jdbc.demo.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.demo.dao.PlayerDAO;
import com.spring.jdbc.demo.dao.mapper.PlayerMapper;
import com.spring.jdbc.demo.model.Player;

public class PlayerDAOImpl  implements PlayerDAO{

	private JdbcTemplate template;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template=new JdbcTemplate(this.dataSource);
	}

	@Override
	public Player createPlayer(Player player) {
		String sql="insert into player(id,name,age,teamName) values(?,?,?,?)";
		template.update(sql,player.getId(),player.getName(),player.getAge(),player.getTeamName());
		return player;
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getPlayerById(int id) {
		String sql="select id,name,age,teamName from player where id=?";
		Player player=template.queryForObject(sql, new Object[] {id},new PlayerMapper());
		return player;
	}

	@Override
	public List<Player> getAllPlayers() {
		String sql="select id,name,age,teamName from player";
		List<Player> playersList=template.query(sql, new PlayerMapper());
		return playersList;
	}

	@Override
	public void removePlayerById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Player> getPlayersByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

}

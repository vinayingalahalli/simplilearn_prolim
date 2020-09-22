package com.spring.jdbc.demo.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.demo.dao.PlayerDAO;
import com.spring.jdbc.demo.model.Player;

public class PlayerSpringJdbcMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_jdbc_beans.xml");
		PlayerDAO dao=(PlayerDAO)context.getBean("dao");
//		
//		dao.createPlayer(new Player(100, "Virat Kohli", 34, "India"));
//		dao.createPlayer(new Player(101, "Samuels", 34, "Windies"));
//		dao.createPlayer(new Player(102, "MS Dhoni", 36, "India"));
//		dao.createPlayer(new Player(103, "Chris Gayle", 44, "Windies"));
		
		System.out.println(dao.getPlayerById(100));
		
		List<Player> playerList=dao.getAllPlayers();
		System.out.println("\nPrinting all the list of players");
		for(Player p:playerList) {
			System.out.println(p);
		}
	}

}

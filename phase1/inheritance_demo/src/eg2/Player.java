package eg2;

public class Player extends Person {

	private String game;
	private long score;
	private Team team;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Player(int id, String name, String game, long score, Team team) {
		super(id, name);
		this.game = game;
		this.score = score;
		this.team = team;
	}
	
	public void printPlayer() {
		System.out.println("Printing Player Details");
		super.printPerson();
		System.out.println("Game : "+game);
		System.out.println("Score : "+score);
		team.printTeam();
	}
}

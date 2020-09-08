package eg2;

public class Team {

	private int teamId;
	private String teamName;
	private String coachName;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String teamName, String coachName) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.coachName = coachName;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	public void printTeam() {
		System.out.println("Team Details....");
		System.out.println("Team Id : "+teamId);
		System.out.println("Team Name : "+teamName);
		System.out.println("Coach Name : "+coachName);
	}
}

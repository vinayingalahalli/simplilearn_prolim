package eg2;

public class Player {

	private int id;
	private String name;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Hello "+name;
//	}
	
	@Override
	public boolean equals(Object o) {
		boolean b=false;
		Player p=(Player)o;
		if(p.id==this.id) {
			b=true;
		}
		return b;
	}
	
}

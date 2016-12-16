package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	private String name;	
	private PokemonType type;
	private int cp;
//	----------construct
	Pokemon(String a,PokemonType b,int c)
	{
		this.name=a;
		this.type=b;
		this.cp=c;
	}
//	----------Get Set
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		return name;
	}
	public PokemonType getType() {
		return type;
	}
//	------------Method
	public abstract void attack();


}

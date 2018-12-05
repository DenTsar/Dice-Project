public class Die{
	private int number;
	private int value;
	public Die(){
		number = 6;
		value = (int)(Math.random()*value)+1;
	}
	public Die(int number){
		this.number = number;
		value = (int)(Math.random()*value)+1;
	}
	public int getValue(){
		return value;
	}
	public void roll(){
		value = (int)(Math.random()*value)+1;
	}
	public String toString(){
		return "Number of sides: "+number+", Value: "+value;
	}
}
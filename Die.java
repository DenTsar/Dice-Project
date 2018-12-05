public class Die{
	private int number;
	private int value;
	public Die(){
		number = 6;
		value = (int)(Math.random()*value)+1;
	}
	public Die(int number,int value){
		this.number = number;
		this.value = value;
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
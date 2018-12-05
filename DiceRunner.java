public class DiceRunner{
	public static void main(String[]args){
		//Test 1
		Die a = new Die();
		Die b = new Die(3);
		int count = 0;
		for(;a.getValue()!=1 || b.getValue()!=1; count++){
			a.roll();
			b.roll();
			System.out.println("Roll "+(count+1));
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println("It took "+count+" number of rolls to get snake eyes.");
		//Test 2
	}
}
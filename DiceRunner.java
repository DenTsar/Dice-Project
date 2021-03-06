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
		System.out.println("It took "+count+" number of rolls to get snake eyes.\n");
		//Test 2
		DiceHolder d = new DiceHolder();
		int e = 1;
		for(; e==1;){
			e = d.addDie(new Die((int)(Math.random()*20+1)));
			System.out.println(d);
		}
		d.shake();
		System.out.println(d);
	}
}
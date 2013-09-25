package sim.app.pvpEmo;

public class Anger extends Emotion {
	
	Anger(Animal p)
	{
		type = -1;
		updateAnger(p);
	}
	
	protected Anger updateAnger(Animal p)
	{
		amount = (double)p.lastMeal/p.maxHunger;
		if(amount > 1.0)
			amount = 1.0;
		//System.out.print(", Anger: " + amount);
		//Calculates amount by lastMeal/ maxHunger
		//amount = lastMeal/maxHunger;
		
		return this;
	}
}

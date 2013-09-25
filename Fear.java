package sim.app.pvpEmo;


public class Fear extends Emotion {

	Fear(Animal p)
	{
		type = -1;
		updateFear(p);
	}
	
	protected Fear updateFear(Animal p)
	{
		if(p.getClass().equals(Predator.class))
			amount = (double)p.lastSeenPrey/p.maxHunger ;
			//System.out.println("LastSeenPrey: " + p.lastSeenPrey);
			//System.out.println("p.maxHunger: " + p.maxHunger);
			//System.out.println("amount: " + this.amount);
			if(amount >1.0)
				amount = 1.0;
		else if(p.lastSeenPredator == 0){
			amount = 1.0;
			//System.out.println("JUST SAW PREDATOR!!");
			}
		else{ 
			amount = 1.0 -((double)p.lastSeenPredator/p.maxSeenPredator);
			//System.out.println("p.lastSeenPredator: " + p.lastSeenPredator);
			//System.out.println("p.maxSeenPredator: " + p.maxSeenPredator);
			//System.out.println("ELSE PREY: " + amount);
			}
			
			
		if(amount > 1.0)
			amount = 1.0;
		if(amount < 0)
			amount = 0.0;
		//System.out.println("Fear: " + amount);
		
		return this;
	}
}

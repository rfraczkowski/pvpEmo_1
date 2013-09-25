package sim.app.pvpEmo;

public class Sadness extends Emotion{

	Sadness(Animal p)
	{
		type = -1;
		updateSadness(p);
	}
	
	protected Sadness updateSadness(Animal p)
	{
		amount = ((double)p.lastSocial/p.maxSocial);
		
		//Calculates sadness 
		// amount = lastSocial/maxSocial;
		if(p.age > p.reproductionAge){
			//System.out.println("prior Sadness:" + amount);
			double socialAmount = ((double)p.lastRep/p.maxRep);
			amount = (amount + socialAmount) / 2;
			//System.out.println("socialAmount: " + socialAmount);
			
		}
		if(amount > 1.0)
			amount = 1.0;
		//System.out.println("Sadness: " + amount);
		//System.out.println("Last Social: " + p.lastSocial + " MaxSocial: " + p.maxSocial);
		
		return this;
		
	}
}

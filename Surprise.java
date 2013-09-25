package sim.app.pvpEmo;


public class Surprise extends Emotion
{
	
	protected double surpriseRate = .1;
	
	Surprise(Animal p)
	{
		type = 0;
		//updateSurprise(p);
	}
	
	protected Surprise updateSurprise(Animal p)
	{
		amount = amount + (surpriseRate * p.map.surpriseIncrease);
		return this;
	}
}

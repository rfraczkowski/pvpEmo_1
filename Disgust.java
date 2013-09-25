package sim.app.pvpEmo;

public class Disgust extends Emotion
{

	protected Disgust(Animal p)
	{
		type = -1;
		updateDisgust(p);
	}
	
	protected Disgust updateDisgust(Animal p)
	{
		if(p.isDiseased)
			amount = 1.0;
		else
			amount = 0.0;
		
		/*if(amount != 0.0)
			System.out.println("***************************************************");*/
		//System.out.println("Disgust: " + amount);
		
		return this;
	}
}

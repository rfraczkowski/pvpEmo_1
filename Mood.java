package sim.app.pvpEmo;

public class Mood {

	double amount;
	Anger anger;
	Sadness sadness;
	Disgust dis;
	Fear fear;
	Happiness happy;
	boolean first;
	
	protected Mood(Anger a, Sadness sad, Disgust d, Fear f, Happiness h)
	{
		updateMood(a, sad, d, f, h);
	}
	
	protected Mood updateMood(Anger a, Sadness sad, Disgust d, Fear f, Happiness h)
	{
		if(anger == null)
			first = true;
		anger = a;
		sadness = sad;
		dis = d;
		fear = f;
		happy = h;
		
		double negativeAmount = ((anger.amount + sadness.amount + dis.amount)/6) + (fear.amount/2);
		double comboAmount = (negativeAmount + happy.amount)/2;
		
		if(first)
			amount = comboAmount;
		else
			amount = (amount * .75) + (comboAmount * .25);
		
		/*System.out.print(", Anger: " + anger.amount + ", Sadness: " + sadness.amount + ", Disgust: " + dis.amount + 
				", Fear: " + fear.amount + ", Happiness: " + happy.amount + ", Mood: " + amount);*/
	
		return this;
	}
}

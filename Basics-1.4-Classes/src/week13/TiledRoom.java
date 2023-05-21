package week13;

public class TiledRoom extends Room{
	
	int grouting;
	
	TiledRoom(int area, float unitPrice, int time, int grouting)
	{
		super(area, unitPrice, time);
		this.grouting = area;
	}
	
	float calculateCost(float hourlyRate)
	{
		float result =  (area * unitPrice) + time * (hourlyRate * 1.5f) + grouting;
		return result;
	}
}

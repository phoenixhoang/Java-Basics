package week13;

public class Room {

	int area, time;
	float unitPrice;
	
	Room(int area, float unitPrice, int time)
	{
		this.area = area;
		this.unitPrice = unitPrice;
		this.time = time;
	}

	float calculateCost(float hourlyRate)
	{
		float result = (area * unitPrice) + (hourlyRate * time);
		return result;
	}
	
	
}

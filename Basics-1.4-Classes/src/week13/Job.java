package week13;

public class Job {
	
	float hourlyRate, CalculateCost;
	Room myRoom;
	
	Job(float hourlyRate, Room room)
	{
		this.hourlyRate = hourlyRate;
		this.myRoom = room; 
	}
	
	float calculateCost() {
		float result = (myRoom.calculateCost(hourlyRate));
		return result;
	}

}

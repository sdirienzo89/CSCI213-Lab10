/**
*
*/

public class Car extends Vehicle
{
	private int doors;
	private int passengers;
	
	public Car(String make, String model, String plate, int numDoors, int numPassengers)
	{
		super(make, model, plate);
		doors= numDoors;
		passengers= numPassengers;
	}
	
	public int getDoors()
	{
		return doors;
	}
	
	public int getPassengers()
	{
		return passengers;
	}
	
	@Override
	public String toString()
	{
		String details= "";
		details= this.doors + "-door " + this.getMake() + " " + this.getModel()+ " with license " + this.getPlate();
		
		return details;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Car))
		{
			return false;
		}
		
		Car otherCar= (Car) other;
		if(super.equals(other))
		{
			if(this.getDoors() == otherCar.getDoors() && this.getPassengers() == otherCar.getPassengers())
			{
				return true;
			}
		}
		
		return false;
	}
	
	public Car copy()
	{
		int doorCopy= this.getDoors();
		int passengersCopy= this.getPassengers();
		String makeCopy= this.getMake();
		String modelCopy= this.getModel();
		String plateCopy= this.getPlate();
		Car carCopy= new Car(makeCopy, modelCopy, plateCopy, doorCopy, passengersCopy);
		
		return carCopy;
	}
}
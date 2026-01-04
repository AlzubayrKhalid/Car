package fiaadh;

public class Car {
	private String model;
	private int year;
	private int mileage;
	private double soom;
	private double hadd;
	
	public Car ()
	{
		
	}
	
	public Car (String model, int year, int mileage, double soom, double hadd)
	{
		this.model= model;
		this.year= year;
		this.mileage= mileage;
		this.soom= soom;
		this.hadd= hadd;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public double getSoom() {
		return soom;
	}

	public void setSoom(double soom) {
		this.soom = soom;
	}

	public double getHadd() {
		return hadd;
	}

	public void setHadd(double hadd) {
		this.hadd = hadd;
	}
	
	
	
	
	public boolean similar (Car c)
	{
		if (this.model.equals(c.model) && this.year==c.year && (this.mileage>=(c.mileage-10) && this.mileage<=(c.mileage+10)))
				return true;
		else
			return false;
	}
	
	public double difference()
	{
		return (this.hadd-this.soom);
	}
	
	public void printCar()
	{
		System.out.printf("This car is a %s and was made in %d.\nIt has %d KM and soom is %.1f Hadd is %.1f\n",model,year,mileage,soom,hadd);
	}

}

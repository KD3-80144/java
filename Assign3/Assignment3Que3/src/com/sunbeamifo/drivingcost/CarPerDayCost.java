package com.sunbeamifo.drivingcost;

import java.util.Scanner;

public class CarPerDayCost 
{

	private double totalMiles;
	private double costOfGasoline;
	private double avgofVehicale;
	private int parkingCost;
	private int tollCost;
	Scanner sc =new Scanner(System.in);
	
	public CarPerDayCost() 
	{
		this.totalMiles = 100;
		this.costOfGasoline = 107;
		this.avgofVehicale = 21;
		this.parkingCost = 100;
		this.tollCost = 400;
	}
	public CarPerDayCost(double totalMiles, double costOfGasoline, double avgofVehicale, int parkingCost,
			int tollCost) 
	{
		this.totalMiles = totalMiles;
		this.costOfGasoline = costOfGasoline;
		this.avgofVehicale = avgofVehicale;
		this.parkingCost = parkingCost;
		this.tollCost = tollCost;
	}
	public void accept()
	{
		System.out.println("Enter total no. of km:");
		this.totalMiles=sc.nextDouble();
		System.out.println("Enter the cost of petrol :");
		this.costOfGasoline=sc.nextDouble();
		System.out.println("Enter the avarage of vehicle:");
		this.avgofVehicale=sc.nextDouble();
		System.out.println("Enter the parking cost:");
		this.parkingCost=sc.nextInt();
		System.out.println("Enter toll tax cost:");
		this.tollCost=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Total no. of km car driven="+this.totalMiles);
		System.out.println("Cost of petrol per litre="+this.costOfGasoline);
		System.out.println("Avarage of vehivle="+this.avgofVehicale);
		System.out.println("Parking charges="+this.parkingCost);
		System.out.println("TOll charges="+this.tollCost);
		System.out.println("Cost per day:"+ calTotalCostPerDay());
	}
	public double calTotalCostPerDay()
	{
		double totalCost=(this.totalMiles/this.avgofVehicale)*this.costOfGasoline+this.parkingCost+this.tollCost;
		return totalCost;
	}
}

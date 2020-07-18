package com.basicPrograms;

import java.util.Random;

public class RandomNumberGeneration {

	public static void main(String[] args) {
		
		Random rand=new Random();
		Integer num=rand.nextInt(2);
		System.out.println(" random number= "+rand.nextInt(5)); // will grnerate random numbers from 0 to 4
		Double db=rand.nextDouble();
		System.out.println(" random number= "+rand.nextDouble());  // will generate random numbers from 0 to 1
		System.out.println(" random number2= "+rand.nextDouble()); 
		System.out.println("random from math="+ Math.random());
		
		// we can also generate random number from apache common API 
		// watch video at https://www.youtube.com/watch?v=PXtJtJZdsbU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=12

	}

}

package com.service;

import org.springframework.stereotype.Service;

import com.model.Order;

@Service
public class BillService {
	
	//calculate the totalCost and return the cost
	public double calculateTotalCost(Order order) {
		double cost=0.0;
	if(order.getDisplayType().equalsIgnoreCase("QLED")) {
		if(order.getBrandName().equalsIgnoreCase("LG")) {
			cost=13000+13000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Micromax")) {
			cost=9000+9000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Samsung")) {
			cost=15000+15000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("MI")) {
			cost=10000+10000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Sony")) {
			cost=16000+16000*0.12;
		}
	}
	
	if(order.getDisplayType().equalsIgnoreCase("OLED")) {
		if(order.getBrandName().equalsIgnoreCase("LG")) {
			cost=15000+15000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Micromax")) {
			cost=11000+11000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Samsung")) {
			cost=17000+17000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("MI")) {
			cost=12000+12000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Sony")) {
			cost=18000+18000*0.12;
		}
	}
	if(order.getDisplayType().equalsIgnoreCase("LED")) {
		if(order.getBrandName().equalsIgnoreCase("LG")) {
			cost=17000+17000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Micromax")) {
			cost=13000+13000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Samsung")) {
			cost=19000+19000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("MI")) {
			cost=14000+14000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Sony")) {
			cost=20000+20000*0.12;
		}
	}
	if(order.getDisplayType().equalsIgnoreCase("LCD")) {
		if(order.getBrandName().equalsIgnoreCase("LG")) {
			cost=19000+19000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Micromax")) {
			cost=15000+15000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Samsung")) {
			cost=21000+21000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("MI")) {
			cost=16000+16000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Sony")) {
			cost=22000+22000*0.12;
		}
	}
	if(order.getDisplayType().equalsIgnoreCase("Plasma")) {
		if(order.getBrandName().equalsIgnoreCase("LG")) {
			cost=21000+21000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Micromax")) {
			cost=17000+17000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Samsung")) {
			cost=23000+23000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("MI")) {
			cost=18000+18000*0.12;
		}
		else if(order.getBrandName().equalsIgnoreCase("Sony")) {
			cost=24000+24000*0.12;
		}
	}
		return cost;
	}

}

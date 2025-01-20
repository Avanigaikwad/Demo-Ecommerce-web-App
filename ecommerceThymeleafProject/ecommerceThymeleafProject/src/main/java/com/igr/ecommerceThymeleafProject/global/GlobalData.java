package com.igr.ecommerceThymeleafProject.global;

import java.util.ArrayList;
import java.util.List;

import com.igr.ecommerceThymeleafProject.model.Product;

public class GlobalData {
	public static List<Product> cart;
	
	static{
		cart = new ArrayList<Product>();
	}
	
}

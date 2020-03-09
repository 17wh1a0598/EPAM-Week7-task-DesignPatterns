package TemplatePattern;

public class HousingClient {

	public static void main(String[] args) {
		
		WoodenHouse houseType =  new WoodenHouse();
		houseType.buildHouse();
		System.out.println("************");
		
		GlassHouse houseType1 = new GlassHouse();
		
		houseType1.buildHouse();
	}
}


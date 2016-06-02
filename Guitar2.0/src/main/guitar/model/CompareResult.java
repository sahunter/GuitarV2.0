package main.guitar.model;

public class CompareResult {
   
	public Builder compareBuilder(String builder) {
		if(builder.equals("FENDER")){
			Builder builder1=Builder.FENDER;
			return builder1;
		}
		if(builder.equals("MARTIN")){
			Builder builder1=Builder.MARTIN;
			return builder1;
		}
		if(builder.equals("GIBSON")){
			Builder builder1=Builder.GIBSON;
			return builder1;
		}
		if(builder.equals("COLLINGS")){
			Builder builder1=Builder.COLLINGS;
			return builder1;
		}	
		if(builder.equals("OLSON")){
			Builder builder1=Builder.OLSON;
			return builder1;
		}
		if(builder.equals("RYAN")){
			Builder builder1=Builder.RYAN;
			return builder1;
		}
		if(builder.equals("PRS")){
			Builder builder1=Builder.PRS;
			return builder1;
		}
		if(builder.equals("")){
			Builder builder1=Builder.ANY;
			return builder1;
		}
		return null;
				
	}
	
	
	public Type compareType(String type) {
		if(type.equals("ACOUSTIC")){
			Type type1=Type.ACOUSTIC;
			return type1;
		}
	
		if(type.equals("ELECTRIC")){
			Type type1=Type.ELECTRIC;
			return type1;
		}
		if(type.equals("")){
			Type type1=Type.ANY;;
			return type1;
		}
		return null;
				
	}
	
	public Wood compareWood(String wood) {
		if(wood.equals("INDIAN_ROSEWOOD")){
			Wood wood1=Wood.INDIAN_ROSEWOOD;
			return wood1;
		}
		if(wood.equals("BRAZILIAN_ROSEWOOD")){
			Wood wood1=Wood.BRAZILIAN_ROSEWOOD;
			return wood1;
		}
		if(wood.equals("MAHOGANY")){
			Wood wood1=Wood.MAHOGANY;
			return wood1;
		}
		if(wood.equals("MAPLE")){
			Wood wood1=Wood.MAPLE;
			return wood1;
		}	
		
		if(wood.equals("COCOBOLO")){
			Wood wood1=Wood.COCOBOLO;
			return wood1;
		}
		if(wood.equals("CEDAR")){
			Wood wood1=Wood.CEDAR;
			return wood1;
		}
		if(wood.equals("ADIRONDACK")){
			Wood wood1=Wood.ADIRONDACK;
			return wood1;
		}
		if(wood.equals("ALDER")){
			Wood wood1=Wood.ALDER;
			return wood1;
		}
		if(wood.equals("SITKA")){
			Wood wood1=Wood.SITKA;
			return wood1;
		}
		if(wood.equals("")){
			Wood wood1=Wood.ANY;
			return wood1;
		}
		return null;
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

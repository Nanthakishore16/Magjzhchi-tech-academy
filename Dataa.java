class Dataa{	
	   
	   public static void main(String [] args){
	  
		
		int intValue = 25;
		double doubleValue = intValue;
		System.out.println("Integer to Double : "+doubleValue);
		
		
		double inputDouble = 45.89;
		int convertedInt = (int) inputDouble;
		System.out.println("Double to Integer : "+convertedInt);
		
		
		int inputInt = 130;
		byte convertedByte = (byte) inputInt;
		System.out.println("Integer to Byte (Overflow) : "+convertedByte);
		
		
	   }	
		
}
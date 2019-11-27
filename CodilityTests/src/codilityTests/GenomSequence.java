package codilityTests;

public class GenomSequence {


	public int genomValueCounter(String genom) {
		
		
	while(true) {
			
			if(genom.contains("A")) {
				return 1;
				
			}else if (genom.contains("C")) {
				return 2;
				
			}else if (genom.contains("G")) {
				return 3;
				
			}else if (genom.contains("T")) {
				return 4;
				
			}else return -1;
		}
		
	
	}
	
	

	public int [] genomSequenceCounter(String genom,int[] startArray, int[]endArray) {
		int [] result = new int[startArray.length];
		String genomPart = "";
		
		if(genom.length()<2) {
		result[0]=genomValueCounter(genom);
		}else {
		
		for(int i = 0;i<startArray.length;i++) {
			genomPart=genom.substring(startArray[i],(endArray[i]+1));
			result[i]=genomValueCounter(genomPart);
		}
		
		}
		
		return result;
	}
	
}

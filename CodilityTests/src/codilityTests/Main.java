package codilityTests;

public class Main {

	public static void main(String[] args) {
		int[]P = {1,2,5};
		int[]Q = {3,5,8};

		
		String S = "AATTGGCAA";
		String simple = "A";
		GenomSequence gs = new GenomSequence();
		
	
		int[] result=gs.genomSequenceCounter(S, P, Q);
		
		for(int i : result) {
			System.out.println(i);
		}
	}

}

public class Player {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		int[] lotto2 = lotto.getLotto();
		
		for(int i = 0; i<6; i++ ) {
			if(i == 5) {
				System.out.print(lotto2[i]);
			}else {
				System.out.print(lotto2[i]+" , ");
			}
		}
	}
}
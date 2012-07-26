import java.util.Random;

public class Lotto {
	/**
	 * @param args
	 * 인스턴스 변수
	 */
	public static void main(String[] args) {
		new Lotto().getLotto();
	}
	
	public int[] getLotto() {
		int[] numbers = new int[6];			// 숫자 6개를 담기 위한 배열 생성.
		for(int i = 0; i < 6 ; i++) {
				numbers[i] = getName();
		}
		return numbers;
	}
	
	Random random = new Random();
	private int getName() {
		return random.nextInt(45)+1;
	}
}
import java.util.Random;

public class Lotto {
	/**
	 * @param args
	 * �ν��Ͻ� ����
	 */
	public static void main(String[] args) {
		new Lotto().getLotto();
	}
	
	public int[] getLotto() {
		int[] numbers = new int[6];			// ���� 6���� ��� ���� �迭 ����.
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
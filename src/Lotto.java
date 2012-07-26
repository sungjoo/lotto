import java.util.Random;

public class Lotto {
	/**
	 * @param args
	 * 인스턴스 변수
	 */
	public static void main(String[] args) {
		new Lotto().printLotto();
	}
	
	public void printLotto() {
		for(int i = 0; i < 6 ; i++) {
			if(i == 5) {
				System.out.print(getName());
			}else {
				System.out.print(getName() + " , ");
			}
		}
	}
	
	Random random = new Random();
	private int getName() {
		return random.nextInt(45)+1;
	}
}
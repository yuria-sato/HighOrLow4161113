import java.util.Random;
import java.util.Scanner;

public class HighOrLow {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int ans = 0;
		int pnt = 0;

		Random rnd = new Random();
		num1 = rnd.nextInt(14) + 1;
		for(int i = 0; i < 5; i++) {
			num2 = rnd.nextInt(13) + 1;
			if(num1 == num2) {
				do {
					num2 = rnd.nextInt(13) + 1;
				}while(num1 != num2);
			}

			System.out.println("High or Low?   1：High   2：Low");
			System.out.print(num1 + "(" +num2 +")" + "   --> ");
			Scanner sc = new Scanner(System.in);
			ans = sc.nextInt();
			if(num1 < num2 && ans == 1) {
				System.out.println("正解！");
				pnt++;
				num1 = num2;
			}
			if(num1 > num2 && ans == 1) {
				System.out.println("不正解！");
				break;
			}
			if(num1 < num2 && ans == 2) {
				System.out.println("不正解！");
				break;
			}
			if(num1 > num2 && ans == 2) {
				System.out.println("正解！");
				pnt++;
				num1 = num2;
			}
		}
		if(pnt == 5) {
			System.out.println("全問正解です。");
		}
		System.out.println("ゲームを終了します。");
	}
}

package Calculator;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		double num1 = sc.nextInt();
		System.out.println("연산자를 입력하세요");
		String yunsan = sc.next();
		System.out.println("두번째 숫자를 입력하세요");
		double num2 = sc.nextInt();
		double result = 0;

		switch (yunsan) {
		case "+":
			result = num1 + num2;

			break;
		case "-":
			result = num1 - num2;

			break;
		case "*":
			result = num1 * num2;

			break;
		case "/":
			result = num1 / num2;

			break;
		}

		System.out.println("결과값 : " + result);

	}

}

package chap2;

public class VarEx1 {
	public static void main(String[] args) {
		//변수 : 메모리 공간 할당. 변수 선언시 메모리 할당됨. 
		byte b1;   //변수의 선언
		b1 = 100;  //변수의 초기화
		byte b2 = 100;   //1byte : -128 ~ 127 범위
		short s1 = 200;  //2byte
		int i1 = 300;    //4byte
		long l1 = 400L;   //8byte
		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		System.out.println("s1=" + s1);
		System.out.println("i1=" + i1);
		System.out.println("l1=" + l1);
		//실수형
		/*
		 * 실수형 리터널의 기본 자료형은 double임.
		 * 숫자 리터널에 붙는 자료형 표시 접미사
		 *   f,F : float형 리터널
		 *   d,D : double형 리터널
		 *   l,L : long형 리터널
		 */
		float f1 = 10F;
		double d1 = 10D;
		System.out.println("f1=" + f1);
		System.out.println("d1=" + d1);
		//문제
		System.out.println(3000L*3000*3000);
		// int = byte + byte
		// int 보다 작은 자료형의 연산의 결과는 int 임.
		System.out.println("(b1+b2)="+(b1+b2));
		byte sum = (byte)(b1 + b2); //형변환되어야 함.
		System.out.println("(b1+b2)="+sum);
		i1 = s1;  // int <= short, 자동형변환
		s1 = (short)l1;  // short <= long, 명시적 형변환
		String s = "abc";
//		s = 'a'; //기본형과 참조형 사이의 형변환 불가. 단 Wrapper 클래스는 가능함
	}
}

package test;
//7. 다음 프로그램을 컴파일 했을 때 결과를 추측해보시오.  BCE
public class DataEx07 {
	public static void main(String[] args) {
	    float foo1 = -1;            //A. 
	    float foo2 = 1.0f;           //B. 실수형 리터널의 기본 자료형은 double임. 
	    float foo3 = 42e1f;         //C. 42.0 * 10  실수형 리터널의 기본 자료형은 double임. 
	    float foo4 = 2.02f;         //D.
//	    float foo5 = 3.03d;         //E. d 접미사는 리터널을 double로 설정함.
	    float foo6 = 0x0123;       //F. 16진수 정수를 의미
	    System.out.println(foo6); // 291
	}
}
//8. byte 형을 저장할 수 있는 데이터 값의 허용 범위는얼마입니까?
//   -128 ~ 127
package test;

//9. float 형 변수 선언이 올바르게 된 것 두개만 고르시오. A C

public class DataEx09 {
	public static void main(String[] args) {
		float f1 = 1F;   //A.
	    float f2 = 1.0;  //B. double형과 형변환시 명시적 형변환 처리 해야 함
	    float f3 = '1';   //C. char 형과 float형은 자동형변환 가능함.
	    float f4 = "1";  //D.  String 과 형변환 불가
	    float f5 = 1.0d; //E. double형과 형변환시 명시적 형변환 처리 해야 함
	}
}

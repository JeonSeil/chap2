package test;

//2. 잘못된 문장을 골라내고 그 이유를 설명하시오.
public class DataEx02 {
	public static void main(String[] args) {
		byte var1 = 128; // A.  범위 벗어났음   -128 ~ 127
		short var2 = 128; // B.
		int var3 = 28L; // C.   형변환, long 타입에서 int 타입으로 형변환시 명시적 형변환이 되어야 함
		long var4 = 128L; // D.
		float var5 = 123456.789123; // E. 실수 리터널의 기본형은 double임.    명시적 형변환이 되어야 함
		double var6 = 123456.789123; // F.
	}
}

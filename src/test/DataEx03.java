package test;

//3. 잘못된 문장을 고쳐서 에러가 발생하지 않도록 수정하시오.
public class DataEx03 {
	public static void main(String[] args) {
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		var4 = var1;
		System.out.println(var1 + ", " + var2);
//		var1 = var3;  //byte <= int 형변환시 명시적 형변환되어야 함 
		var1 = (byte)var3;  //byte <= int 형변환시 명시적 형변환되어야 함 
		System.out.println(var1 + ", " + var3);
//		float var5 = 123456.789123;
		float var5 = 123456.789123f;
		double var6 = 123456.789123;
//		var5 = var6;
		var5 = (float)var6;
		System.out.println(var5 + ", " + var6);
		var6 = var5;
		System.out.println(var5 + ", " + var6);
	}
}
//4. char형의 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
//   0 ~ 65535 
//   short형의 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
//   -32768 ~ 32767 

/*
5. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다. 변수 이름으로 사용할 수 있는 것을 고르시오.
   A. false
   B. default
   C. _object   //ok
   D. a-class
*/
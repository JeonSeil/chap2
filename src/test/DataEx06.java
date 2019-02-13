package test;
//6. 다음 프로그램을 컴파일 했을 때 결과를 추측해보시오.
public class DataEx06 {
	public static void main(String[] args) {
	    byte b = 127;
	    byte c = 126;
//	    byte d = b + c;  //int 자료형보다 작은 범위의 자료형의 연산후의 결과는 int 형임.
//	    int d = (b + c);
	    byte d = (byte)(b + c);
	}
}

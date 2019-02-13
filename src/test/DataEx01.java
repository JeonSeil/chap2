package test;
 //1. 잘못된 문장을 골라내고 그 이유를 설명하시오.
public class DataEx01 {
	public static void main(String[] args) {
	    char             a='a';       //A.
	    char             b="a";       //B. String 객체와 char 간의 형변환 불가능
	    String          c="a";       //C.
	    String          d='a';       //D. String 객체와 char 간의 형변환 불가능
//	    char             e='ab';      //E. char 타입의 변수에는 한개의 문자만 저장 가능
	    String          f="ab";      //F.
	    char g = '';                //빈문자 불가능
	    String h = "";              //빈문자열 가능
	}

}

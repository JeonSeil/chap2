package test;
//7. ���� ���α׷��� ������ ���� �� ����� �����غ��ÿ�.  BCE
public class DataEx07 {
	public static void main(String[] args) {
	    float foo1 = -1;            //A. 
	    float foo2 = 1.0f;           //B. �Ǽ��� ���ͳ��� �⺻ �ڷ����� double��. 
	    float foo3 = 42e1f;         //C. 42.0 * 10  �Ǽ��� ���ͳ��� �⺻ �ڷ����� double��. 
	    float foo4 = 2.02f;         //D.
//	    float foo5 = 3.03d;         //E. d ���̻�� ���ͳ��� double�� ������.
	    float foo6 = 0x0123;       //F. 16���� ������ �ǹ�
	    System.out.println(foo6); // 291
	}
}
//8. byte ���� ������ �� �ִ� ������ ���� ��� �����¾��Դϱ�?
//   -128 ~ 127
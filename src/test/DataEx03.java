package test;

//3. �߸��� ������ ���ļ� ������ �߻����� �ʵ��� �����Ͻÿ�.
public class DataEx03 {
	public static void main(String[] args) {
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		var4 = var1;
		System.out.println(var1 + ", " + var2);
//		var1 = var3;  //byte <= int ����ȯ�� ����� ����ȯ�Ǿ�� �� 
		var1 = (byte)var3;  //byte <= int ����ȯ�� ����� ����ȯ�Ǿ�� �� 
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
//4. char���� ������ �� �ִ� ������ ���� ��� ������ ���Դϱ�?
//   0 ~ 65535 
//   short���� ������ �� �ִ� ������ ���� ��� ������ ���Դϱ�?
//   -32768 ~ 32767 

/*
5. ������ �����ϱ� ���ؼ��� �ڷ����� ������ �̸��� �����ؾ��մϴ�. ���� �̸����� ����� �� �ִ� ���� ���ÿ�.
   A. false
   B. default
   C. _object   //ok
   D. a-class
*/
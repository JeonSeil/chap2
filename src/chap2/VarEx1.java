package chap2;

public class VarEx1 {
	public static void main(String[] args) {
		//���� : �޸� ���� �Ҵ�. ���� ����� �޸� �Ҵ��. 
		byte b1;   //������ ����
		b1 = 100;  //������ �ʱ�ȭ
		byte b2 = 100;   //1byte : -128 ~ 127 ����
		short s1 = 200;  //2byte
		int i1 = 300;    //4byte
		long l1 = 400L;   //8byte
		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		System.out.println("s1=" + s1);
		System.out.println("i1=" + i1);
		System.out.println("l1=" + l1);
		//�Ǽ���
		/*
		 * �Ǽ��� ���ͳ��� �⺻ �ڷ����� double��.
		 * ���� ���ͳο� �ٴ� �ڷ��� ǥ�� ���̻�
		 *   f,F : float�� ���ͳ�
		 *   d,D : double�� ���ͳ�
		 *   l,L : long�� ���ͳ�
		 */
		float f1 = 10F;
		double d1 = 10D;
		System.out.println("f1=" + f1);
		System.out.println("d1=" + d1);
		//����
		System.out.println(3000L*3000*3000);
		// int = byte + byte
		// int ���� ���� �ڷ����� ������ ����� int ��.
		System.out.println("(b1+b2)="+(b1+b2));
		byte sum = (byte)(b1 + b2); //����ȯ�Ǿ�� ��.
		System.out.println("(b1+b2)="+sum);
		i1 = s1;  // int <= short, �ڵ�����ȯ
		s1 = (short)l1;  // short <= long, ����� ����ȯ
		String s = "abc";
//		s = 'a'; //�⺻���� ������ ������ ����ȯ �Ұ�. �� Wrapper Ŭ������ ������
	}
}

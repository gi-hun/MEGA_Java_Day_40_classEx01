/*
 * # Ŭ����
 * 1. ����(���赵)
 * 	1) class	: Ű����
 * 	2) Ex01		: Ŭ������
 * 	3) {}		: �ڷ����� ����(�⺻ �ڷ����� ������ ����)
 * 2. ����
 * 	1) �ڷ���	 ������  = new �ڷ���();	
 *  2) Ex01  e    = new Ex01(); 
 */

package day_40;

class Ex01
{
	int x;
	int y;
}

public class ClassEx01 {
	public static void main(String[] args) {
		
		int a;			//����
		String b;		//���ڿ�
		int[] arr;		//�迭(���� ����): �ּҸ� ���� ����
		
		a = 10;
		b = "��ö��";
		arr = new int[3];
		
		Ex01 e = new Ex01();	//Ŭ����: ����� ���� �ڷ���(�����ڰ� ���� ����)
		e.x = 10;
		e.y = 20;
		
		System.out.println(e);		//day_40.Ex01@7852e922
	}
}

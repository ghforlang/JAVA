package Chapter9;
/**
 * Base1���ù���
 * ���Ƚ����������Ĵ洢�ռ��ʼ��Ϊ������0��
 * ���û����constructor��
 * ��������˳����ó�Ա�ĳ�ʼ��������
 * ���������constructor���壻
 * @author lenovo
 *
 */
public class Practice3 {

	public static void main(String[] args) {
		Base1 b = new Base1();//lenovo
		b.print();
	}

}
abstract class Base{
	Base(){
		print();//���������print����
	}
	abstract void print();
}

class Base1 extends Base{
	private int i = 9;
	public void print(){
		System.out.println("base1---" + this.i);
	}
}

/**
 * output:
 * base1---0
 * base1---9
 */
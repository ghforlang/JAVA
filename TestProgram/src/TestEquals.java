/**Object obj = new Object();
 * String a = new String("abc");
 * String b = new String("abc");
 * obj����Ӧ���ڴ��д洢����ֵ���Ƕ���ռ�õ��ǿ��ڴ���׵�ַ
 * ����ָ��������͵ı��������Ҫ�Ƚ����������Ƿ�ָ��ͬһ������
 * ��Ҫ����������������Ӧ���ڴ��е���ֵ�Ƿ���ȣ���ʱ�����Ҫ��==���������бȽϡ�
 * @author lenovo
 *
 */
public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("abc");
		String b = new String("abc");
		System.out.println(a.equals(b));
		System.out.println(a == b);//�Ƚ�a��b��ָ��Ķ����ڴ��׵�ַ
		
	}

}


public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ss = "12  ";
		System.out.println(ss.hashCode());
		ss.trim();//ssָ��Ķ���û�б䣬���Ƕ������ݷ����˱仯
		System.out.println(ss.hashCode());
		System.out.println(ss);
	}

}

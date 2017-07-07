package tw.alan.myproject.operation;

public class TestOperationEx2 {

	public static void main(String[] args) {
		int i = 1 , j = 2 ,  k;
//		j = i++;     //print i = 2, j = 1; 先取值再加1
     	j = ++i;     //print i = 2, j = 2; 先加1再取值
	
		
		System.out.println("i=" + i + " j=" + j);

	}

}

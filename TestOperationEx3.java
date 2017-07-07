package tw.alan.myproject.operation;

public class TestOperationEx3 {

	public static void main(String[] args) {
		int i = 1 , j = 2 , k;
		k = (i++) + (++j);  //++在前面所以j先自己加減完才給值,++在後面所以i先給值出去才自己做加減
		
		System.out.println("i=" + i);    //系統抓上面最靠近的值出來,也就是i++=2
		System.out.println("j=" + j);    //系統抓上面最靠近的值出來,也就是j++=3
		System.out.println("k=" + k);    //k = (i=1) + (j=3) = 4
		int a = 1, b = 2, l;
		l = (++a) + (++b);              
		System.out.println("l=" + l);    //l = (a=2) + (b=3) = 5
		int c = 1, d = 2, m;
		m = (c++) + (d++);	             //m = (c=1) + (d=2) = 3
		System.out.println("m=" + m);
	}

}

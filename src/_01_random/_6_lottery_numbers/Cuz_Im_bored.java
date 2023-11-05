package _01_random._6_lottery_numbers;

public class Cuz_Im_bored {
 public static void main(String[] args) {
 int q = 2147483647;
 int w = 2147483647;
 int e = 2147483647;
 int r = 2147483647;
 int t = 2147483647;
 int y = 0;
 float u = q/10;

 while (y ==0) {

	 q = q^w;
	 w = w^e;
	 e =e^r;
	 r =r^t;
	 t =t^q;
	 while(u>=1) {
		 u = u/10;

	 }

System.out.println(q);
 } 
}
}

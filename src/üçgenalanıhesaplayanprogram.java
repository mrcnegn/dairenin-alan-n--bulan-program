import java.util.Scanner;
public class üçgenalanýhesaplayanprogram {

	public static void main(String[] args) {
		
		int a,b;
		double c,çevre,alan;
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("birinci kenarý giriniz");
		a =input.nextInt();
		
		System.out.printf("ikinci kenarý giriniz");
		b =input.nextInt();
		
		
		c =Math.sqrt ((a*a) + (b*b));
		
		System.out.println("hipotenüs: " + c);

		çevre= a + b +c ;
		
		alan= (a*b)/2;
		
		System.out.println("üçgenin çevresi: " + çevre );
		System.out.println("üçgenin alaný: " + alan );
		
		
		
	}

}

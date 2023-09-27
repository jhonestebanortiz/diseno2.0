package account;

public class Main {


		public static void main (String[]args) {
			
			
				account cuentaDEAejandro = new account ("pqz12a", " alejandro rozero", 56871 ); 
				account cuentaDeMaria = new account ("pqz34c", " maria becerra", 78900 ); 
				
				cuentaDEAejandro.credit(453);
				cuentaDeMaria.debit(7897);
				cuentaDEAejandro.transferTo(cuentaDeMaria, 123);

		        
		        System.out.println(cuentaDEAejandro);
		        System.out.println(cuentaDeMaria);
				
			}
		}
		
	


  
package aplicacionAutor;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//String name, double price,int qty, Author author
			author authorone=new author("pedro","soyDeCamila.com",'Z');
			
			book bookone=new book("FRAN",12,9,authorone);
			
			System.out.println("descripcion");
			System.out.println("author: "+ bookone.getAuthor());
			System.out.println("--------------------------------------------");
			System.out.println("cliente: "+bookone.getName()+" costo "+bookone.getPrice()+" unidades:"
					+ ""+bookone.getQty() );
			
			System.out.println("print: ");
	}

}

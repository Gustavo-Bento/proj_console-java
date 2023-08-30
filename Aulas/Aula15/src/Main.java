public class Main{
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG  ";
		
//		Formatar
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		System.out.println("Original: -"+original+"-");
		System.out.println("toLowerCase: -"+s01+"-");
		System.out.println("toUpperCase: -"+s02+"-");
		
//		Recortar
		String s03 = original.trim();
		System.out.println("trim: -"+s03+"-");
		s03 = original.substring(2);
		System.out.println("substring(2): -"+s03+"-");
		s03 = original.substring(2,9);
		System.out.println("substring(2,9): -"+s03+"-");
		
//		Substituir
		String s04 = original.replace('a', 'x');
		System.out.println("replace('a','x'): -"+s04+"-");
		
//		Buscar
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Index of 'bc': "+i);
		System.out.println("Last of 'bc': "+j);
		
//		Dividir
		String[] vect = original.split(" ");
		System.out.println("Split 1: "+vect[0]);
		System.out.println("Split 2: "+vect[1]);
		System.out.println("Split 3: "+vect[2]);
		System.out.println("Split 4: "+vect[3]);
		System.out.println("Split 5: "+vect[4]);
	}
}
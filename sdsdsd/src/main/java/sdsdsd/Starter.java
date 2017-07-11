package sdsdsd;

public class Starter {
	public static void main(String[] args) {
		if(args.length < 0)
			System.out.println("Devi inserire un argomento");
		System.out.println("ddx");
		Messaggio c = new Messaggio("ciao");
		System.out.println(c.getMes());
		
		String provaArgs = args[0];
		Messaggio cd = new Messaggio(provaArgs);
		System.out.println(cd.getMes());
	}
}

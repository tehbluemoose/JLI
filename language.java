import java.util.Scanner;
import java.io.*;
class Main{	
	public static void main(String[] args){
		File f = null;
		try{
			f = new File(args[0]);
			Scanner read = new Scanner(f).useDelimiter(Pattern.compile("., //"//n"));
		}		
		catch(FileNotFoundException e){
			f = null;
			System.out.println("Error, file not found");
		}
		if (f != null){
			System.out.println("g2g");
			
		}
		
	}
}
class InReader{
	Sentence previous;
}
class Sentence{
	Word subject;
	Word object;
	Word[] action;
	Word av;
	Word aj;
}
class Word{
	String w;
}
class Verb extends Word{
	Verb linkedV;
}
class Noun extends Word{
	Boolean proper;
}
class Adjective extends Word{
	Noun linkedN;
}
class Adverb extends Word{
	Verb linkedV;
}
class Conjunction extends Word{
	
}
class Preposition extends Word{
	
}
class Exclamation extends Word{
	
}
class Onomatopoeia extends Word{

}
class Pronoun extends Noun{

}
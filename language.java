import java.util.Scanner;

class Main{	
	public static void main(String[] args){
		System.out.println("ooo");
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
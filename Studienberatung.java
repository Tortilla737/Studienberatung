import java.util.*;

public class Studienberatung{
	Scanner scanner = new Scanner(System.in);
	public static void main(String[]args){
		Studienberatung main = new Studienberatung();
		main.Frage1();
	}
	public void Frage1(){
		System.out.println("Hast du Abitur?");
		String Antwort1 = scanner.next();
		
		if(Antwort1.equalsIgnoreCase("n")){
			Frage2();
		}
		else if(Antwort1.equalsIgnoreCase("j")){
			Frage4();
		}
		else{
			System.out.println("<j> oder <n> Antworten");
			Frage1();
		}
	}
	public void Frage2(){
		System.out.println("Hast du Fachabitur?");
		String Antwort1 = scanner.next();
		
		if(Antwort1.equalsIgnoreCase("n")){
			System.out.println("Nicht studieren");
		}
		else if(Antwort1.equalsIgnoreCase("j")){
			Frage3();
		}
		else{
			System.out.println("<j> oder <n> Antworten");
			Frage2();
		}
	}
	public void Frage3(){
		System.out.println("Hast du eine Berufsausbildung?");
		String Antwort1 = scanner.next();
		
		if(Antwort1.equalsIgnoreCase("n")){
			System.out.println("Besser noch studieren.");
		}
		else if(Antwort1.equalsIgnoreCase("j")){
			System.out.println("Du kannst ja spaeter noch studieren");
		}
		else{
			System.out.println("<j> oder <n> Antworten");
			Frage3();
		}		
	}
	public void Frage4(){
		System.out.println("Bist du Wissbegierig?");
		String Antwort1 = scanner.nextln();
		if(Antwort1.equalsIgnoreCase("n")){
			System.out.println("Nicht studieren");
		}
		else if(Antwort1.equalsIgnoreCase("n")){
			System.out.println("Nicht studieren");
		}
		else{
			System.out.println("<j> oder <n> Antworten");
			Frage4();
		}
	}
}
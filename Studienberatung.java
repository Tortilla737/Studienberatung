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
			Frage3();
		}
		else if(Antwort1.equalsIgnoreCase("j")){
			
		}
		else{
			System.out.println("<j> oder <n> Antworten");
			Frage2();
		}
	}
	public void Frage3(){
		
	}
}
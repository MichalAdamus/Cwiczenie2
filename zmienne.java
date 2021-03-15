class zmienne{
	public static void main(String args[]){
		
		/************************* zadanie 1 ************/
		int BirthYear=2001;
		char gender='K';
		
		System.out.println(BirthYear);
		System.out.println(gender);
		
		// "Witaj "+"Marian"
		// "Wiek: "+"51"
		// "Rok urodzenia: "BirthYear"
		
		System.out.println();
		
		
		System.out.println("Rok urodzenia: "+BirthYear);
		System.out.println("gender: "+gender);
		
		/*********** Zadanie 2 - wiek i średnia ***********/
		System.out.println();
		
		boolean isAdult = true;
		double average = 3.5;
		
		System.out.println("Czy pełnoletnia ? "+isAdult);
		System.out.println("Średnia ocen "+average);
				
		/*********** Zadanie 3 - Numer domu; mieszkania i konto ***********/
		System.out.println();
		
		int HouseNumber = 989;
		byte AppartmentNumber = 89;
		int AccountBalance = 1000000;
		
		System.out.println("Numer domu "+HouseNumber);
		System.out.println("Numer Mieszkania "+AppartmentNumber);
		System.out.println("Stan konta "+AccountBalance);
				
	}
}
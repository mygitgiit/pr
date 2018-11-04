package pr1.uebung04;

import static pr.MakeItSimple.*;

public class ByteburgTarifRechner {

	static int ermittleFahrtkosten(int startStation, int zielStation) {
		
			//BESTIMMEN DER FAHRTKOSTEN
			
			//*****GÜNSTIGSTE FAHRT*****
			//1 Euro Fahrt Linie 1
		if (startStation == 00 && zielStation == 11
				 || zielStation == startStation + 1 && zielStation > 11 && zielStation <= 16
				 || zielStation == startStation - 1 && zielStation >= 11 && zielStation < 16
				 || startStation == 13 && zielStation == 23
				 
			//1 Euro Fahrt Linie 2
				 ||startStation == 00 && zielStation == 21
				 || zielStation == startStation + 1 && zielStation > 21 && zielStation <= 26
				 || zielStation == startStation - 1 && zielStation >= 21 && zielStation < 26
				 || startStation == 23 && zielStation == startStation + 10
				 || startStation == 23 && zielStation == startStation - 10
				 
			//1Euro Fahrt Linie 3
				 || startStation == 00 && zielStation == 31
				 || zielStation == startStation + 1 && zielStation > 31 && zielStation <= 36
				 || zielStation == startStation - 1 && zielStation >= 31 && zielStation < 36
				 || startStation == 33 && zielStation == startStation + 10
				 || startStation == 33 && zielStation == startStation - 10
			
			//1 Euro Fahrt Linie 4
				 || startStation == 00 && zielStation == 41
				 || zielStation == startStation + 1 && zielStation > 41 && zielStation <= 46
				 || zielStation == startStation - 1 && zielStation >= 41 && zielStation < 46
				 || startStation == 43 && zielStation == startStation + 10
				 || startStation == 43 && zielStation == startStation - 10
				 
			//1 Euro Fahrt Linie 5
				 || startStation == 00 && zielStation == 51
				 || zielStation == startStation + 1 && zielStation > 51 && zielStation <= 56
				 || zielStation == startStation - 1 && zielStation >= 51 && zielStation < 56
				 || startStation == 53 && zielStation == startStation + 10
				 || startStation == 53 && zielStation == startStation - 10) {
				
			int preis = 1;
			println("Preis: " + preis + "€");
			return preis;
		}
		
			//*****NORMALE FAHRT*****
			//2 Euro Fahrt Linie 1
		else if (startStation >= 11 && startStation <= 13
			&& zielStation >= 11 && zielStation <= 13
			|| startStation >= 13 && startStation <= 16
			&& zielStation >= 13 && zielStation <= 15
			|| startStation == 00 && zielStation > 11 && zielStation <= 13
			
			//2 Euro Fahrt Linie 2
			||startStation >= 21 && startStation <= 23
			&& zielStation >= 21 && zielStation <= 23
			|| startStation >= 23 && startStation <= 26
			&& zielStation >= 23 && zielStation <= 25
			|| startStation == 00 && zielStation > 21 && zielStation <= 23
			
			//2 Euro Fahrt Linie 3	
			|| startStation >= 31 && startStation <= 33
			&& zielStation >= 31 && zielStation <= 33
			|| startStation >= 33 && startStation <= 36
			&& zielStation >= 33 && zielStation <= 35
			|| startStation == 00 && zielStation > 31 && zielStation <= 33
			
			//2 Euro Fahrt Linie 4	
			|| startStation >= 41 && startStation <= 43
			&& zielStation >= 41 && zielStation <= 43
			|| startStation >= 43 && startStation <= 46
			&& zielStation >= 43 && zielStation <= 45
			|| startStation == 00 && zielStation > 41 && zielStation <= 43
			
			//2 Euro Fahrt Linie 5	
			|| startStation >= 51 && startStation <= 53
			&& zielStation >= 51 && zielStation <= 53
			|| startStation >= 53 && startStation <= 56
			&& zielStation >= 53 && zielStation <= 55
			|| startStation == 00 && zielStation > 51 && zielStation <= 53) {
			
		int preis = 2;
		println("Preis: " + preis + "€");
		return preis;
	}
		
				//*****FAHRT ÜBER x3 ODER AB x3 BIS ENDSTATION*****
				//3 Euro Fahrt Linie 1
		else if (startStation >= 11 && startStation <= 15
				&& zielStation >= 11 && zielStation <= 15
				|| startStation == 00 && zielStation > 11 && zielStation <= 15
				|| startStation >= 13 && startStation < 15
				&& zielStation == 16
			
				//3 Euro Fahrt Linie 2
				||startStation >= 21 && startStation <= 25
				&& zielStation >= 21 && zielStation <= 25
				|| startStation == 00 && zielStation > 21 && zielStation <= 25
				|| startStation >= 23 && startStation < 25
				&& zielStation == 26
				
				//3 Euro Fahrt Linie 3
				|| startStation >= 31 && startStation <= 35
				&& zielStation >= 31 && zielStation <= 35
				|| startStation == 00 && zielStation > 31 && zielStation <= 35
				|| startStation >= 33 && startStation < 35
				&& zielStation == 36
			
				//3 Euro Fahrt Linie 4
				|| startStation >= 41 && startStation <= 45
				&& zielStation >= 41 && zielStation <= 45
				|| startStation == 00 && zielStation > 41 && zielStation <= 45
				|| startStation >= 43 && startStation < 45
				&& zielStation == 46
				
				//3 Euro Fahrt Linie 5
				|| startStation >= 51 && startStation <= 55
				&& zielStation >= 51 && zielStation <= 55
				|| startStation == 00 && zielStation > 51 && zielStation <= 55
				|| startStation >= 53 && startStation < 55
				&& zielStation == 56) {
				
			int preis = 3;
			println("Preis: " + preis + "€");
			return preis;
		}
		
				//*****TEUERSTE FAHRT*****
				//4 Euro Fahrt Linie 1
		else if (startStation >= 11 && startStation <= 13 && zielStation == 16
				|| zielStation >= 11 && zielStation <= 13 && startStation == 16
				|| startStation == 00 && zielStation == 16
				
				//4 Euro Fahrt Linie 2
				||startStation >= 21 && startStation <= 23 && zielStation == 26
				|| zielStation >= 21 && zielStation <= 23 && startStation == 26
				|| startStation == 00 && zielStation == 26
				
				//4 Euro Fahrt Linie 3
				|| startStation >= 31 && startStation <= 33 && zielStation == 36
				|| zielStation >= 31 && zielStation <= 33 && startStation == 36
				|| startStation == 00 && zielStation == 36
				
				//4 Euro Fahrt Linie 4
				||startStation >= 41 && startStation <= 43 && zielStation == 46
				|| zielStation >= 41 && zielStation <= 43 && startStation == 46
				|| startStation == 00 && zielStation == 46
				
				//4 Euro Fahrt Linie 5
				|| startStation >= 51 && startStation <= 53 && zielStation == 56
				|| zielStation >= 51 && zielStation <= 53 && startStation == 56
				|| startStation == 00 && zielStation == 56) {
			
			int preis = 4;
			println("Preis: " + preis + "€");
			return preis;	
		}
		
		else {
			println("Üngültige Eingabe!");
			return 0;
		}
		
}
	
	//AUSFÜHREN DER FAHRTKOSTEN METHODE MIT SCHLEIFE FÜR a == b
	static void endKosten () {
		
		print("Geben sie die Startstation an: ");
		int a = readInt();
		print("Geben sie die Zielstation an: ");
		int b = readInt();
			
		while (a == b) {
			println("Fahrt nicht möglich! Eingabe wiederholen!\n");
			
			print("Geben sie die Startstation an: ");
			a = readInt();
			print("Geben sie die Zielstation an: ");
			b = readInt();
		}
			
		ermittleFahrtkosten(a, b);
		
	}
	
	public static void main(String[] args) {
		
		endKosten();
		
	}

}

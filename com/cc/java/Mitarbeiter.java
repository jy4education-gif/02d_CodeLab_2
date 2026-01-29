// package com.cc.java;

// public class Mitarbeiter {

//     // Felder (Attributes)
//     // Wir verwenden 'private', um die Datenkapselung zu wahren.
//     private String name;
//     private String vorname;
//     private String funktion;
//     private int eintrittsjahr;

//     /**
//      * Konstruktor zur Initialisierung eines Mitarbeiter-Objekts.
//      * Ein Konstruktor hat keinen Rückgabetyp und heißt exakt wie die Klasse!
//      */
//     public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
//         this.name = name;
//         this.vorname = vorname;
//         this.funktion = funktion;
//         this.eintrittsjahr = eintrittsjahr;
//     }

//     /**
//      * Die Methode getInfo() gibt je nach Parameter einen spezifischen Wert zurück.
//      * In einer zweiten Iteration werde ich die switch/case Getter Struktur ersetzen und versuchen 
//      * die Eingabe der Mitarbeiter Daten durch einen Setter als Feature zu ergänzen. Hier erste Iteration für Parameter-Steuerung.
//      * parameter flag Bestimmt, welche Information zurückgegeben wird.
//      * return gibt den Wert des entsprechenden Feldes als String zurück.
//      */
    //     public String getInfo(String flag) {
    //         switch (flag) {
    //             case "#name":
    //                 return name;
    //             case "#vorname":
    //                 return vorname;
    //             case "#funktion":
    //                 return funktion;
    //             case "#eintrittsjahr":
    //                 // Umwandlung von int zu String für einen einheitlichen Rückgabetyp
    //                 return String.valueOf(eintrittsjahr);
    //             default:
    //                 return "Fehler: Ungueltiger Parameter!";
    //         }
//     }
// }

// //Iteration 1.2: Übergabe von Referenzobjekten

// package com.cc.java;
// import java.time.Year;
// public class Mitarbeiter {

//     private String name;
//     private String vorname;
//     private String funktion;
//     private int eintrittsjahr;

//     public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
//         this.name = name;
//         this.vorname = vorname;
//         this.funktion = funktion;
//         this.eintrittsjahr = eintrittsjahr;
//     }

//     // Getter: hier mit einzelnen Gettern (Standard) anstatt switch/case Struktur + Feature Dienstalter: 
//     public String getName() { return name; }
//     public String getVorname() { return vorname; }
//     public String getFunktion() { return funktion; }
//     public int getEintrittsjahr() { return eintrittsjahr; }
//     public int getDienstalter() {
//         int aktuellesJahr = Year.now().getValue();
//         return aktuellesJahr - eintrittsjahr;
//     }
// }


// 2. Iteration Getter + Setter:

// package com.cc.java;

// public class Mitarbeiter {

//     private String name;
//     private String vorname;
//     private String funktion;
//     private int eintrittsjahr;

//     // Konstruktor bleibt für die Initialisierung bestehen
//     public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
//         this.name = name;
//         this.vorname = vorname;
//         this.funktion = funktion;
//         this.eintrittsjahr = eintrittsjahr;
//     }

//     // --- Getter (Leserechte) ---
//     // Erlaubt den Zugriff auf private Felder ohne Switch-Logik
//     public String getName() { return name; }
//     public String getVorname() { return vorname; }
//     public String getFunktion() { return funktion; }
//     public int getEintrittsjahr() { return eintrittsjahr; }

//     // --- Setter (Schreibrechte) ---
//     // Erlaubt es, Werte nach der Instanziierung sicher zu ändern
//     public void setName(String name) { this.name = name; }
//     public void setVorname(String vorname) { this.vorname = vorname; }
//     public void setFunktion(String funktion) { this.funktion = funktion; }
//     public void setEintrittsjahr(int eintrittsjahr) { this.eintrittsjahr = eintrittsjahr; }
// }

// // Lösung Yasin:
// package com.cc.java;

// public class Mitarbeiter {
    
//     // Felder eingenschaften
//     private String name;
//     private String vorname;
//     private String funktion;
//     private int eintrittsjahr;
    
//     // Konstruktor
//     public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
//         this.name = name;
//         this.vorname = vorname;
//         this.funktion = funktion;
//         this.eintrittsjahr = eintrittsjahr;
//     }
//     // Getter-Methoden für alle Felder
//     public String getName() {
//         return name;
//     }
    
//     public String getVorname() {
//         return vorname;
//     }
    
//     public String getFunktion() {
//         return funktion;
//     }
    
//     public int getEintrittsjahr() {
//         return eintrittsjahr;
//     }
    
//     // Methode getInfo()
//     public String getInfo(String parameter) {
// 		// toLowerCase() Großbuchstaben werden in Kleinbuchstaben umgewandelt.
//         switch (parameter.toLowerCase()) {
//             case "name":
//                 return "Name: " + name;
//             case "vorname":
//                 return "Vorname: " + vorname;
//             case "funktion":
//                 return "Funktion: " + funktion;
//             case "eintrittsjahr":
//                 return "Eintrittsjahr: " + eintrittsjahr;
//             case "vollständig":
//                 return vorname + " " + name + " - " + funktion + " (seit " + eintrittsjahr + ")";
//             case "kurz":
//                 return vorname + " " + name;
//             default:
//                 return "Ungültiger Eingabeparameter";
//         }
//     }
// }

// Lösung Dozent:

package com.cc.java;

public class Mitarbeiter {
	
	private String familyName ;
	private String firstName;
	private String role ;
	private int yearOfEntry ;
	
	public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.role = role;
		this.yearOfEntry = yearOfEntry;
	}


	public String getInfo(String flag) {
		switch (flag) {
			case "#name":
				return this.firstName +" " + this.familyName;
			case "#position":
				return this.role;
			case "#time":
				return Integer.toString(this.yearOfEntry);//"2020"
				// return this.yearOfEntry; // 2020
			default:
				return "ERROR";
		}
	}

}
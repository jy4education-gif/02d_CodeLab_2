// package com.cc.java;

// public class App {

//     public static void main(String[] args) {
        
//         // 1. Instanziierung der Mitarbeiter-Objekte über den Konstruktor
//         Mitarbeiter m1 = new Mitarbeiter("Mustermann", "Max", "Entwickler", 2018);
//         Mitarbeiter m2 = new Mitarbeiter("Schmidt", "Sybille", "Projektleiterin", 2015);
//         Mitarbeiter m3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);

//         // 2. Abruf der Informationen über die getInfo-Methode
//         // Wir nutzen die bereitgestellte output-Methode zur Anzeige
//         output("Mitarbeiter 1 Name: " + m1.getInfo("#name"));
// 		   output("Mitarbeiter 1 Vorname: " + m1.getInfo("#vorname"));
//         output("Mitarbeiter 1 Funktion: " + m1.getInfo("#funktion"));
// 		   output("Mitarbeiter 1 Eintritt: " + m1.getInfo("#eintrittsjahr"));
//         output("-------------------------");

//         output("Mitarbeiter 2 Name: " + m2.getInfo("#name"));
// 	       output("Mitarbeiter 2 Vorname: " + m2.getInfo("#vorname"));
//         output("Mitarbeiter 2 Funktion: " + m2.getInfo("#funktion"));
// 		   output("Mitarbeiter 2 Eintritt: " + m2.getInfo("#eintrittsjahr"));
//         output("-------------------------");

//         output("Mitarbeiter 3 Name: " + m3.getInfo("#name"));
// 		   output("Mitarbeiter 3 Vorname: " + m3.getInfo("#vorname"));
//         output("Mitarbeiter 3 Funktion: " + m3.getInfo("#funktion"));
// 		   output("Mitarbeiter 3 Eintritt: " + m3.getInfo("#eintrittsjahr"));
//         output("-------------------------");
        
//         // // Test eines falschen Parameters
//         // output("Test Fehlerfall: " + m3.getInfo("#gehalt"));

//     }

//     /**
//      * Hilfsmethode zur Konsolenausgabe
//      */
//     private static void output(String outStr) {
//         System.out.println(outStr);
//     }
// };

//Iteration 1.2: Übergabe von Referenzobjekten

package com.cc.java;

public class App {

    public static void main(String[] args) {
        
        // 1. Instanziierung (Referenzen m1, m2, m3 zeigen auf die Objekte im Heap) ->> Heap (global, alle Objekte) vs. Stack (lokale Var, Methodenaufrufe, primitve Datentypen)
        Mitarbeiter m1 = new Mitarbeiter("Zuckerberg", "Markus", "Entwickler", 2004);
        Mitarbeiter m2 = new Mitarbeiter("Pfirsich", "Sundar", "Projektleiter", 1998);
        Mitarbeiter m3 = new Mitarbeiter("Tore", "Willhelm", "CEO", 1975);

        // 2. "Elegante" Lösung mittels Array für Stappelverarbeitung, Referenzen werden hier gebündelt
        Mitarbeiter[] team = {m1, m2, m3};

       // 3. Iteration über das Array mit einer klassischen for-Schleife
        for (int i = 0; i < team.length; i++) {  // Wir nutzen den Index 'i', um die ID für die Anzeige zu generieren.
            displayProfile(team[i], i + 1);     // Wir übergeben das Objekt (Referenz) und den berechneten Index
        }
    }
        // 4. Ausgabe über die Methode 'displayProfile' >> Wir lassen die Instanzvariablen gemäß ReadMe unberührt und geben die ID anhand des Index aus und berechnen das Feature Dienstalter über die Systemzeit dynamisch..  
        private static void displayProfile(Mitarbeiter m, int i) {
        output(String.format("Name, Vorname: %s, %s", m.getName(), m.getVorname())); // besser als: 'output("Name, Vorname:  " + m.getName() + ", " + m.getVorname());' >> '%s' ist hier der Platzhalter für das jeweilige Argument
        output(String.format("Position, Current ID: %s, %s", m.getFunktion(), i));
        output("Dienstzeit seit: " + m.getEintrittsjahr());
        output("Dienstalter: " + m.getDienstalter() + " Jahre");
        output("-------------------------");
       
    }

    private static void output(String outStr) {
        System.out.println(outStr);
    }
}

// 2. Iteration Getter + Setter:

// package com.cc.java;

// import java.util.ArrayList;
// import java.util.List;
// // hier später evt. ergänzen java.util.Scanner; 3. Iteration? Mitarbeiterdaten über die CLI WÄHREND der Laufzeit eingeben!
// // hint für später Integer.parseInt()!
// public class App {

//     public static void main(String[] args) {
        
//         // Verwendung einer Liste statt einzelner Variablen!
//         List<Mitarbeiter> mitarbeiterListe = new ArrayList<>();

//         // Hinzufügen von Objekten direkt in die Liste
//         mitarbeiterListe.add(new Mitarbeiter("Mustermann", "Max", "Entwickler", 2018));
//         mitarbeiterListe.add(new Mitarbeiter("Schmidt", "Sybille", "Projektleiterin", 2015));
//         mitarbeiterListe.add(new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020));

//         // Beispiel für die Nutzung eines Setters (Nachträgliche Änderung)
//         mitarbeiterListe.get(0).setFunktion("Senior Entwickler");

//         // Dynamische Ausgabe über eine Schleife (Iterieren)
//         output("Aktuelle Mitarbeiterliste:");
//         output("-------------------------");

//         for (Mitarbeiter m : mitarbeiterListe) {
//             // Hier nutzen wir nun den spezifischen Getter
//             String info = m.getVorname() + " " + m.getName() + 
//                           " | Position: " + m.getFunktion() + 
//                           " | Seit: " + m.getEintrittsjahr();
//             output(info);
//         }
//     }

//     private static void output(String outStr) {
//         System.out.println(outStr);
//     }
// };
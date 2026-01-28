package com.cc.java;

public class App {

    public static void main(String[] args) {
        
        // 1. Instanziierung der Mitarbeiter-Objekte über den Konstruktor
        Mitarbeiter m1 = new Mitarbeiter("Mustermann", "Max", "Entwickler", 2018);
        Mitarbeiter m2 = new Mitarbeiter("Schmidt", "Sybille", "Projektleiterin", 2015);
        Mitarbeiter m3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);

        // 2. Abruf der Informationen über die getInfo-Methode
        // Wir nutzen die bereitgestellte output-Methode zur Anzeige
        output("Mitarbeiter 1 Name: " + m1.getInfo("#name"));
        output("Mitarbeiter 1 Funktion: " + m1.getInfo("#funktion"));
        
        output("-------------------------");

        output("Mitarbeiter 2 Vorname: " + m2.getInfo("#vorname"));
        output("Mitarbeiter 2 Eintritt: " + m2.getInfo("#eintrittsjahr"));

        output("-------------------------");

        output("Mitarbeiter 3 Name: " + m3.getInfo("#name"));
        output("Mitarbeiter 3 Funktion: " + m3.getInfo("#funktion"));
        
        // Test eines falschen Parameters
        output("Test Fehlerfall: " + m3.getInfo("#gehalt"));

    }

    /**
     * Hilfsmethode zur Konsolenausgabe
     */
    private static void output(String outStr) {
        System.out.println(outStr);
    }
};
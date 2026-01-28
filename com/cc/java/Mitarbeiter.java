package com.cc.java;

public class Mitarbeiter {

    // Felder (Attributes)
    // Wir verwenden 'private', um die Datenkapselung zu wahren.
    private String name;
    private String vorname;
    private String funktion;
    private int eintrittsjahr;

    /**
     * Konstruktor zur Initialisierung eines Mitarbeiter-Objekts.
     * Ein Konstruktor hat keinen Rückgabetyp und heißt exakt wie die Klasse!
     */
    public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
        this.name = name;
        this.vorname = vorname;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    }

    /**
     * Die Methode getInfo() gibt je nach Parameter einen spezifischen Wert zurück.
     * Didaktischer Hinweis: In der Praxis nutzt man oft Getter, aber diese 
     * "Universal-Methode" schult das Verständnis für Parameter-Steuerung.
     * * @param flag Bestimmt, welche Information zurückgegeben wird.
     * @return Der Wert des entsprechenden Feldes als String.
     */
    public String getInfo(String flag) {
        switch (flag) {
            case "#name":
                return name;
            case "#vorname":
                return vorname;
            case "#funktion":
                return funktion;
            case "#eintrittsjahr":
                // Umwandlung von int zu String für einen einheitlichen Rückgabetyp
                return String.valueOf(eintrittsjahr);
            default:
                return "Fehler: Ungültiger Parameter!";
        }
    }
}
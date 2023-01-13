package de.hebk.game;

public class Joker {

    /**
     * Attribute
      */
    private String name;

    /**
     * Konstruktor für Joker mit übergebenem Namen
     * @param pName Name des Jokers
     */
    public Joker(String pName) {
        setName(pName);
    }

    /**
     * Gibt den Namen zurück
     * @return Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setzt den Namen des Jokers
     * @param pName Name
     */
    public void setName(String pName) {
        this.name = pName;
    }
}

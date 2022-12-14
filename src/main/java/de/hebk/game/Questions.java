package de.hebk.game;

public class Questions {

    /**
     * Frage als String
     */

    private String question;

    /**
     * ID als int
     */

    private int id;

    /**
     * String-Array für die Antworten
     */

    private String[] answers = new String[4];

    /**
     * Schwierigkeit als int
     */

    private int difficulty;

    /**
     * Konstruktor für eine Frage
     * @param pID ID als int
     * @param pDifficulty Schwierigkeit als int
     * @param pQuestion Frage als String
     * @param pAnswer1 Antwort 1 (falsch) als String
     * @param pAnswer2 Antwort 2 (falsch) als String
     * @param pAnswer3 Antwort 3 (falsch) als String
     * @param pRightAnswer richtige Antwort als String
     */

    public Questions(int pID, int pDifficulty, String pQuestion, String pAnswer1, String pAnswer2, String pAnswer3, String pRightAnswer){
        setId(pID);
        setQuestion(pQuestion);
        this.answers[0] = pAnswer1;
        this.answers[1] = pAnswer2;
        this.answers[2] = pAnswer3;
        this.answers[3] = pRightAnswer;
        setDifficulty(pDifficulty);
    }

    /**
     * Gibt alle falschen Antworten zurück
     * @return Falsche Antworten als String-Array
     */

    public String[] getWrongAnswers()
    {
        String[] retAnswers = new String[3];
        for (int i = 0; i < 3; i++) {
            retAnswers[i] = answers[i];
        }
        return retAnswers;
    }

    /**
     * Gibt die richtige Antwort zurück
     * @return Richtige Antwort als String
     */

    public String getRightAnswer()
    {
        return answers[3];
    }

    /**
     * Gibt die Frage zurück
     * @return Frage als String
     */

    public String getQuestion() {
        return question;
    }

    /**
     * Gibt die Schwierigkeit wieder
     * @return Schwierigkeit als int
     */

    public int getDifficulty() {
        return difficulty;
    }

    /**
     * Gibt die ID wieder
     * @return ID als int
     */

    public int getId() {
        return id;
    }

    /**
     * Gibt den Schwierigkeitsgrad der Frage als String zurück
     * @return Schwierigkeit als String
     */
    public String getDifficultyString()
    {
        switch (this.difficulty) {
            case 1:
                return "Leicht";
            case 2:
                return "Mittel";
            case 3:
                return "Schwer";
            default:
                return "n/A";
        }
    }

    /**
     * Setzt die ID
     * @param id ID als int
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Setzt die Frage
     * @param question Frage als String
     */

    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Setzt die Schwierigkeit
     * @param difficulty Schwierigkeit als int
     */

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}

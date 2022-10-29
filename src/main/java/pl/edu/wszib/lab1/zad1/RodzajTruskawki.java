package pl.edu.wszib.lab1.zad1;

/**
 * Rodzaje truskawek:
 * Ananasowa
 * Honeoye
 * Polka
 * Kent
 * Christine
 */
public enum RodzajTruskawki {
    ANANASOWA("Ananasowa", "Białe owoce"),
    HONEOYE("Honeoye", "Wyrazista"),
    POLKA("Polka", "Najsmaczniejsza"),
    KENT("Kent", "Dla fanów słodyczy"),
    CHRISTINE("Christine", "Zaowocuje szybko i obficie"),
    BRAND_NEW("Brand new", "Zawiera wszystkie potrzebne witaminy i minerały"),
    SUPER_NEW("", "")
    ;

    private final String nazwa;
    private final String cecha;

    RodzajTruskawki(final String nazwa,
                    final String cecha) {
        this.nazwa = nazwa;
        this.cecha = cecha;
    }

    public String nazwa() {
        return nazwa;
    }

    public String cecha() {
        return cecha;
    }

    @Override
    public String toString() {
        return "RodzajTruskawki[" + name() + "]{" +
                "nazwa='" + nazwa + '\'' +
                ", cecha='" + cecha + '\'' +
                '}';
    }
}

package pl.edu.wszib.lab1.zad1;

public class Application {

    public static void main(String[] args) {
        KoktajlTroskawkowy koktajlTroskawkowy = new KoktajlTroskawkowy(
                300,
                RodzajTroskawki.ANANASOWA
        );
        koktajlTroskawkowy.jedz();
        koktajlTroskawkowy.pij();
        /**
         * Zadanie:
         * Utwórz enum RodzajSmaku zawierający wartości:
         * Troskawkowy
         * Bananowy
         * Szpinakowy
         * Ciasteczkowy
         * Jabłkowy
         *
         * A następnie zmodyfikować interfejs Smakowy
         * tak aby zwracał rodzaj smaku i dostosować resztę programu
         *
         */
    }

    public static int test(int myVar) {
        return myVar * 2;
    }
}
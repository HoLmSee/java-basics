package pl.edu.wszib.lab1.zad1;

public abstract class KoktajSmakowy extends Koktaj implements Smakowalne {
    protected final RodzajSmaku rodzajSmaku;

    protected KoktajSmakowy(int kcal,
                            RodzajSmaku rodzajSmaku) {
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    }

    @Override
    public void pij() {
        System.out.println("Koktajl o smaku" + smak() + "jest" + zrodloSmaku());

    }


    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }

    public ZrodloSmaku zrodloSmaku(){
        return switch (rodzajSmaku){
            case TRUSKAWKOWY -> ZrodloSmaku.OWOCOWY;
            case BANANOWY -> ZrodloSmaku.INNY;
            case JABLKOWY -> ZrodloSmaku.OWOCOWY;
            case SZPINAKOWY -> ZrodloSmaku.WARZYWNY;
            case CIASTECZKOWY -> ZrodloSmaku.INNY;

        };
    }
}

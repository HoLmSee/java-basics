package pl.edu.wszib.lab1.zad1;

/*public enum ZrodloSmaku {
    ANANASOWA("OWOCOWY"),
    HONEOYE("OWOCOWY"),
    POLKA("WARZYWNY"),
    KENT("INNY"),
    CHRISTINE("WARZYWNY"),
    BRAND_NEW("OWOCOWY"),
    SUPER_NEW("INNY")
    ;
 */
public enum ZrodloSmaku {
    OWOCOWY("Owocowy"),
    WARZYWNY("Warzywny"),
    INNY("Inny")
    ;
    private final String zrodlo;

    ZrodloSmaku(final String zrodlo){
        this.zrodlo = zrodlo;
    }

    @Override
    public String toString(){
        return zrodlo;
    }

}

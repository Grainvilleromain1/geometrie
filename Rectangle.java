package geometrie;
class Rectangle extends Figure {
    private double coteHorizontale;
    private double coteVerticale;
    
    Rectangle() {
        super();
        coteHorizontale = 0;
        coteVerticale = 0;
    }
    
    Rectangle(double coteHorizontale,
              double coteVerticale){
        super();
        this.coteHorizontale = coteHorizontale;
        this.coteVerticale = coteVerticale;
    }
    
    Rectangle(double coteHorizontale,
              double coteVerticale,
              Point centre) {
        super(centre);
        this.coteHorizontale = coteHorizontale;
        this.coteVerticale = coteVerticale;
    }
    
    Rectangle(Rectangle r) {
        this.setCentre(r.getCentre());
        this.coteHorizontale = r.coteHorizontale;
        this.coteVerticale = r.coteVerticale;
    }
    
    double getCoteHorizontale() {
        return coteHorizontale;
    }
    
    double getCoteVerticale() {
        return coteVerticale;
    }
    
    void setCoteHorizontale(double coteHorizontale){
        this.coteHorizontale = coteHorizontale;
    }
    
    void setCoteVerticale(double coteVerticale){
        this.coteVerticale = coteVerticale;
    }
    
    public String toString(){
        return "Centre : " + getCentre().toString() +
        "\n Cote Horizontale : " + coteHorizontale + "\n" + 
        "Cote Verticale : " + coteVerticale;
    }
    
    double calculerPerimetre() {
        return 2 * coteHorizontale + 2 * coteVerticale;
    }
    
    double calculerAire() {
        return coteHorizontale * coteVerticale;
    }
    
    boolean estInscrire(Cercle c) {
        return 4 * c.getRayon() * c.getRayon() ==
            coteHorizontale * coteHorizontale +
            coteVerticale * coteVerticale;
    }
    
    Cercle inscrire() {
        if(coteHorizontale != coteVerticale)
            return null;
        return new Cercle(coteHorizontale / 2);
    }
    
    public void zoomer(double coefficient) {
        super.zoomer(coefficient);
        coteHorizontale = coefficient * coteHorizontale;
        coteVerticale = coefficient * coteVerticale;
    }
    
    boolean estCarre() {
        return coteHorizontale == coteVerticale;
    } 
        
    public Losange pivoter() {
        if(estCarre())
            return new Losange(coteHorizontale);
        return null;
    }
}

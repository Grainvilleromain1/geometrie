package geometrie;

class Losange {
    private double cote;
    
    Losange() {
        cote = 0;
    }
    
    Losange(double cote){
        this.cote = cote;
    }
    
    Losange(Losange c) {
        this.cote = c.cote;
    }
    
    double getCote() {
        return cote;
    }
    
    void setCote(double cote) {
        this.cote = cote;
    }
        
    public String toString() {
        return "cote : " + cote;  
    }     
    
    public Rectangle pivoter() {
        return new Rectangle(cote, cote);
    }
}

package geometrie;
class Figure implements Zoomable, Deplacable, Coloriable{
    private Point centre;
    private Couleur couleur;
    
    Figure() {
        centre = new Point();
    }
    
    Figure(Point centre) {
        this.centre = centre;
    }
    
    Point getCentre() {
        return centre;
    }
    
    void setCentre(Point centre) {
        this.centre = centre;
    }
    
    public String toString() {
     return "Centre = " + centre.toString();
    }
    
    void deplacer(double a, double b) {
        centre.setX(a + centre.getX());
        centre.setY(b + centre.getY());
    }
    
    public void zoomer(double coefficient) {
        centre.setX(coefficient * centre.getX());
        centre.setY(coefficient * centre.getY());
    }
    
    public Couleur getCouleur() {
        return couleur;
    }
    
    public void setCouleur(Couleur couleur){
        this.couleur = couleur;
    }
}    
    
    

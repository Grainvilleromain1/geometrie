package geometrie;
class Point {
    private double x;
    private double y;
    
    Point() {
        x = 0;
        y = 0;
    }
    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    double getX() {
        return x;
    }
    
    double getY() {
        return y;
    }
    
    void setX(double x){
        this.x = x;
    }
    
    void setY(double y){
        this.y = y;
    }
    
    public String toString(){
        return "Abscisse : " + x + "\n" + 
        "Ordonnée : " + y;
    }
}

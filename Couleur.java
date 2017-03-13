package geometrie;

class Couleur {
    private int red;
    private int green;
    private int blue;
    
    Couleur(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }  
    
    public String toString() {
        return "rgb(" + red + ", " 
                      + green + ", " 
                      + blue +")";
    }
}
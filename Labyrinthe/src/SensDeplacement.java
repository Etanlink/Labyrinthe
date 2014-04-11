
public enum SensDeplacement {
    HAUT(0,-1),
    BAS(0, 1),
    GAUCHE(-1, 0),
    DROITE(1, 0),
    FIXE(0,0);

    private final int deltaX;
    
    private final int deltaY;
    
    SensDeplacement(int x, int y) {
    	deltaX = x;
    	deltaY = y;
    }
    
    public int x() { return deltaX; }
    public int y() { return deltaY; }

}

public class TrackCapuchin {
    private int xmonk;
    private int ymonk;
    private int xfood;
    private int yfood;


    public TrackCapuchin(int xm, int ym, int xf, int yf){
        xmonk =xm;
        ymonk = ym;
        xfood = xf;
        yfood = yf;
    }

    public int getXmonk() {
        return xmonk;
    }

    public int getYmonk() {
        return ymonk;
    }

    public int getXfood() {
        return xfood;
    }

    public int getYfood() {
        return yfood;
    }

    public void moveMonkey(int xMovement, int yMovement){
        xmonk+= xMovement;
        ymonk+= yMovement;
    }

    
}

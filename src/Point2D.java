
public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){

    }

    public Point2D(float x, float y) {

    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] temp = new float[2];
        temp[0] = getX();
        temp[1] = getY();
        return temp;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "Point 2D with x = " +getX()+ " y =" + getY();
    }


}

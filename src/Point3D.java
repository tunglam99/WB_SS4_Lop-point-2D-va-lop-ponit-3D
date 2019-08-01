public class Point3D extends Point2D{
    private float z =0.0f;

    public Point3D(){

    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z =z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y, float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ(){
        float[] temp = new float[3];
        temp[0] = this.getX();
        temp[1] = this.getY();
        temp[2] = this.getZ();
        return temp;
    }

    @Override

    public String toString(){
        return " Point 3D with x="+getX()+" y = "+getY()+ " z = " +getZ() +" Which is subclass of " + super.toString();
    }


}

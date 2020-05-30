package ru.progwards.kos;

public class Point2D{
    int x;
    int y;

    public static void main(String[] args) {
        Point2D points1 = new Point2D(6,2);
        System.out.println(points1);
        Point3D points2 = new Point3D(4,7,8);
        System.out.println(points2.toString());

    }

    public Point2D(int x, int y){

        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return x + "," + y;
    }

public static class Point3D extends Point2D{

    private int z;


    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
        }

    @Override
    public String toString() {

      return super.toString() + "," + z;
        //  return x + "," + y + "," + z;
    }

}
}

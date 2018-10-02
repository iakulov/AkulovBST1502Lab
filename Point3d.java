import java.util.Scanner;

public class Point3d{

	private double xCoord, yCoord, zCoord;

	public Point3d(double x, double y, double z){
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}

	public Point3d(){
		this(0.0, 0.0, 0.0);
	}

	public double getX(){
		return xCoord;
	}

	public double getY(){
		return yCoord;
	}

	public double getZ(){
		return zCoord;
	}

	public void setX(double val){
		xCoord = val;
	}

	public void setY(double val){
		yCoord = val;
	}

	public void setZ(double val){
		zCoord = val;
	}

	public boolean proverka(Point3d prv){
		if (prv.getX() == xCoord) && (prv.getY() == yCoord) && (prv.getZ() == zCoord)
			return true;
		return false;
	}
	public double distanceTo(Point3d per)
		{
			return Math.sqrt(Math.pow((per.getX()-xCoord), 2)+
				Math.pow((per.getY()-yCoord), 2)+
				Math.pow((per.getZ()-zCoord), 2));
		}
	
}

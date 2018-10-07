import java.util.Scanner;

public class Lab2
{
		public static void main(String[] args)
		{
			int pError=0;
			Point3d[] point = new Point3d[]{new Point3d(), new Point3d(), new Point3d()};
			Scanner scan = new Scanner(System.in);
			for (int i=0; i<=2; i++)
			{
				System.out.println("Coordinates "+i+1+" point: ");
				point[i].setX(Double.parseDouble(scan.next()));
				point[i].setY(Double.parseDouble(scan.next()));
				point[i].setZ(Double.parseDouble(scan.next()));
			}
			if (point[0].equals(point[1]) || point[0].equals(point[2]) || point[1].equals(point[2]))
			{
				System.out.println("Error! Coordinates of points are equals!");
				pError++;
			}
			if (pError==0)
			{
				double square=computeArea(point[0],point[1],point[2]);
				System.out.println("Square of triangle: "+square);
			}
		}
		
		public static double computeArea(Point3d p1, Point3d p2, Point3d p3)
		{
				double a=p1.distanceTo(p2);
				double b=p1.distanceTo(p3);
				double c=p2.distanceTo(p3);
				double s = (a+b+c)/2;
				return Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}		
}
enum GeoShape 
{
    TRIANGLE, SQUARE, RECTANGLE;
}

class EnumGeoShape
{

    public void property(GeoShape geo)
	 {	
		switch (geo)
		 {
            		case TRIANGLE:
               		System.out.println("This is a triangle.");
            		case SQUARE:
                	System.out.println("This is a square.");
            		case RECTANGLE:
                	System.out.println("This is a rectangle.");
        	 }
    	}
}

public class EnumExSwitch 
{
    public static void main(String args[]) 
	{
        	EnumGeoShape e = new EnumGeoShape();
        	e.property(GeoShape.SQUARE);
    	}
}
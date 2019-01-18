package map;

public class Location {

	private double latitude = 0;
	private double longtitude = 0;
	public Location(double lat, double lon) {
		latitude = lat;
		longtitude = lon;
	}
	public double getLat() {
		return latitude; 
	}
	public double getLon() {
		return longtitude; 
	}
	
	

}

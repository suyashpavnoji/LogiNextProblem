
public class DistanceCalculator {

	public static Double getDistance(GeoLocation source, GeoLocation destination) {
		return distance(source.getLatitude(), source.getLongitiude(), destination.getLatitude(),
				destination.getLongitiude(), DistanceUnit.KM);
	}

	private static double distance(double lat1, double lon1, double lat2, double lon2, DistanceUnit unit) {
		double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2))
				+ Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		dist = dist * unit.getValue();

		return (dist);
	}

	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}

	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}

	enum DistanceUnit {
		KM(1.609344), N(0.8684);

		Double value;

		private DistanceUnit(Double value) {
			this.value = value;
		}

		Double getValue() {
			return value;
		}
	};

}

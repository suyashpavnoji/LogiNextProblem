
public class Curator {

	private Curator() {

	}

	private static Curator instance = new Curator();

	public static Curator getInstance() {
		return instance;
	}

	public TrackingData curate(TrackingData lastLocation, TrackingData newlastLocation) {
		Double distance = DistanceCalculator.getDistance(lastLocation.getLocationData(),
				newlastLocation.getLocationData());
		if (distance > 0.5) {
			return newlastLocation;
		} else {
			return null;
		}
	}

}

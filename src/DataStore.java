import java.util.SortedSet;
import java.util.TreeSet;

public class DataStore {

	private DataStore() {

	}

	private static DataStore instance = new DataStore();

	public static DataStore getInstance() {
		return instance;
	}

	SortedSet<TrackingData> allData = new TreeSet<TrackingData>();

	TrackingData lastTrackedLocation;

	public TrackingData add(TrackingData data) {
		allData.add(data);
		lastTrackedLocation = data;
		return data;
	}

	public TrackingData getLastTrackerData() {
		return allData.last();
	}

}

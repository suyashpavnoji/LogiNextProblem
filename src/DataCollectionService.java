public class DataCollectionService {

	DataStore store = DataStore.getInstance();
	
	Curator currentCurator= Curator.getInstance();

	public TrackingData push(TrackingData data) {

		TrackingData lastData = store.getLastTrackerData();

		TrackingData curatedData = currentCurator.curate(lastData, data);

		store.add(curatedData);
		
		return curatedData;

	}

}

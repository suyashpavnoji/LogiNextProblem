
public class RealTimeMetricsEvaluation {
	
	public double SPEED_THRESHHOLD=0.5;
	
	private RealTimeMetricsEvaluation() {

	}

	private static RealTimeMetricsEvaluation instance = new RealTimeMetricsEvaluation();

	public static RealTimeMetricsEvaluation getInstance() {
		return instance;
	}
	
	public void evalueSpeed()
	{
		
	}
	
	public void wasBlocked(TrackingData oldData,TrackingData newData)
	{
		double distance=DistanceCalculator.getDistance(oldData.getLocationData(), newData.getLocationData());
		double timeInMinutes=TimeUtil.getMinutesTime(oldData.getTrackingDate(), newData.getTrackingDate());
		
		TrackingAnalysisNode node=new TrackingAnalysisNode(newData);
		
		if(distance/timeInMinutes<SPEED_THRESHHOLD)
		{
			node.setWasBlocked(true);
		}
	}

	public static evaluate(TrackingData newData)
	{
		DataStore dataStore=DataStore.getInstance();
		
		TrackingData last=dataStore.getLastTrackerData();
	}

}

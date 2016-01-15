
public class TrackingAnalysisNode {

	TrackingData data;

	Boolean wasBlocked = false;

	public TrackingAnalysisNode(TrackingData data) {
		super();
		this.data = data;
	}

	public Boolean getWasBlocked() {
		return wasBlocked;
	}

	public void setWasBlocked(Boolean wasBlocked) {
		this.wasBlocked = wasBlocked;
	}

}

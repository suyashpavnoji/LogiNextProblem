import java.time.LocalDateTime;

public class TrackingData implements Comparable<TrackingData> {

	private Double deviceId;

	private GeoLocation locationData;

	private Double batteryHealth;

	private Double speed;

	private LocalDateTime trackingDate;

	public Double getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Double deviceId) {
		this.deviceId = deviceId;
	}

	public GeoLocation getLocationData() {
		return locationData;
	}

	public void setLocationData(GeoLocation locationData) {
		this.locationData = locationData;
	}

	public Double getBatteryHealth() {
		return batteryHealth;
	}

	public void setBatteryHealth(Double batteryHealth) {
		this.batteryHealth = batteryHealth;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public LocalDateTime getTrackingDate() {
		return trackingDate;
	}

	public void setTrackingDate(LocalDateTime trackingDate) {
		this.trackingDate = trackingDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batteryHealth == null) ? 0 : batteryHealth.hashCode());
		result = prime * result + ((deviceId == null) ? 0 : deviceId.hashCode());
		result = prime * result + ((locationData == null) ? 0 : locationData.hashCode());
		result = prime * result + ((speed == null) ? 0 : speed.hashCode());
		result = prime * result + ((trackingDate == null) ? 0 : trackingDate.hashCode());
		return result;
	}

	public TrackingData(Double longtitude, Double latitude, Double batteryHealth, Double speed, String trackingDate) {
		super();
		this.locationData = new GeoLocation(longtitude, latitude);
		this.batteryHealth = batteryHealth;
		this.speed = speed;
		this.trackingDate = LocalDateTime.now();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrackingData other = (TrackingData) obj;
		if (batteryHealth == null) {
			if (other.batteryHealth != null)
				return false;
		} else if (!batteryHealth.equals(other.batteryHealth))
			return false;
		if (deviceId == null) {
			if (other.deviceId != null)
				return false;
		} else if (!deviceId.equals(other.deviceId))
			return false;
		if (locationData == null) {
			if (other.locationData != null)
				return false;
		} else if (!locationData.equals(other.locationData))
			return false;
		if (speed == null) {
			if (other.speed != null)
				return false;
		} else if (!speed.equals(other.speed))
			return false;
		if (trackingDate == null) {
			if (other.trackingDate != null)
				return false;
		} else if (!trackingDate.equals(other.trackingDate))
			return false;
		return true;
	}

	@Override
	public int compareTo(TrackingData o) {
		return this.getTrackingDate().compareTo(o.getTrackingDate());

	}

}

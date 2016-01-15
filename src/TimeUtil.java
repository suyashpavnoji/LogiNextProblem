import java.time.Duration;
import java.time.LocalDateTime;

public class TimeUtil {

	static final int MINUTES_PER_HOUR = 60;
	static final int SECONDS_PER_MINUTE = 60;
	static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;

	public static long getMinutesTime(LocalDateTime dob, LocalDateTime now) {
		LocalDateTime today = LocalDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), dob.getHour(),
				dob.getMinute(), dob.getSecond());
		Duration duration = Duration.between(today, now);

		long seconds = duration.getSeconds();

		long hours = seconds / SECONDS_PER_HOUR;
		long minutes = ((seconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE);
		
		long totalMinutes = hours * 60 + minutes;

		return totalMinutes;
	}

}

package package1;

public class TimeClassHelper {
	private int hour = 1;
	private int minute = 2;
	private int second = 3;

	public void setTime(int h, int m, int s) {
		this.hour = ((h >= 0 && h < 24) ? h : 0);
		this.minute = ((m >= 0 && m < 60) ? m : 0);
		this.second = ((s >= 0 && s < 60) ? s : 0);

	}

	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second,
				(hour < 12 ? "AM" : "PM"));
	}
}

package controflow;

public class Eligibility {
	public boolean isEligible(Student s) {
		if (s.getTenthPer() < 60) {
			return false;
		} else if (s.getTwelevePer() < 60) {
			return false;
		} else if (s.getBtechPer() < 60) {
			return false;

		} else {
			return true;
		}

	}
}

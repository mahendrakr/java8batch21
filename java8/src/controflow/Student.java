package controflow;

public class Student {

	public int id;
	public String name;
	public double tenthPer;
	public double twelevePer;
	public double btechPer;
	

	public Student(int id, String name, double tenthPer, double twelevePer, double btechPer) {
		super();
		this.id = id;
		this.name = name;
		this.tenthPer = tenthPer;
		this.twelevePer = twelevePer;
		this.btechPer = btechPer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTenthPer() {
		return tenthPer;
	}

	public void setTenthPer(double tenthPer) {
		this.tenthPer = tenthPer;
	}

	public double getTwelevePer() {
		return twelevePer;
	}

	public void setTwelevePer(double twelevePer) {
		this.twelevePer = twelevePer;
	}

	public double getBtechPer() {
		return btechPer;
	}

	public void setBtechPer(double btechPer) {
		this.btechPer = btechPer;
	}

}

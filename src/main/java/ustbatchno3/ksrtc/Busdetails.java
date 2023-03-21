package ustbatchno3.ksrtc;

import java.time.LocalTime;

public class Busdetails {
	
	private String busid,busname,drivernme;
	private int busprice;
	private LocalTime strtdt,enddt;
	public Busdetails(String busid, String busname, String drivernme, int busprice, LocalTime strtdt, LocalTime enddt) {
		super();
		this.busid = busid;
		this.busname = busname;
		this.drivernme = drivernme;
		this.busprice = busprice;
		this.strtdt = strtdt;
		this.enddt = enddt;
	}
	public String getBusid() {
		return busid;
	}
	public void setBusid(String busid) {
		this.busid = busid;
	}
	public String getBusname() {
		return busname;
	}
	public void setBusname(String busname) {
		this.busname = busname;
	}
	public String getDrivernme() {
		return drivernme;
	}
	public void setDrivernme(String drivernme) {
		this.drivernme = drivernme;
	}
	public int getBusprice() {
		return busprice;
	}
	public void setBusprice(int busprice) {
		this.busprice = busprice;
	}
	public LocalTime getStrtdt() {
		return strtdt;
	}
	public void setStrtdt(LocalTime strtdt) {
		this.strtdt = strtdt;
	}
	public LocalTime getEnddt() {
		return enddt;
	}
	public void setEnddt(LocalTime enddt) {
		this.enddt = enddt;
	}
	@Override
	public String toString() {
		return "Busdetails [busid=" + busid + ", busname=" + busname + ", drivernme=" + drivernme + ", busprice="
				+ busprice + ", strtdt=" + strtdt + ", enddt=" + enddt + "]";
	}
	
	
	
}

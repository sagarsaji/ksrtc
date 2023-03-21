package ustbatchno3.ksrtc;

//import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ksrtcdetails {

	private String source,destination;
	private LocalDateTime dte;
	private int price;
	public Ksrtcdetails(String source, String destination, LocalDateTime dte, int price) {
		super();
		this.source = source;
		this.destination = destination;
		this.dte = dte;
		this.price = price;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDateTime getDte() {
		return dte;
	}
	public void setDte(LocalDateTime dte) {
		this.dte = dte;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ksrtcdetails [source=" + source + ", destination=" + destination + ", dte=" + dte + ", price=" + price
				+ "]";
	}
	
	
	
}

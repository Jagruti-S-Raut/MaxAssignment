import java.time.LocalDate;
import java.util.Date;

public class DateRange1 {

	LocalDate startDate;
	LocalDate endDate;
	
	
	
	
	public DateRange1() {
		// TODO Auto-generated constructor stub
	}
	
	public DateRange1(LocalDate startDate, LocalDate endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public LocalDate getStartDate() {
		return startDate ;
	}
	public LocalDate getEndDate() {
		
		return endDate;
	}
	public void setStartDate(LocalDate min) {
		startDate=min;
	}
	public void setEndDate(LocalDate max) {
		endDate=max;
		
	}
}

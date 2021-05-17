


	
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.util.ArrayList;
	import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

	public class DateMerger {
		
		public List<DateRange1> mergeDate(List<DateRange1> dateRanges) {
			List<LocalDate> dateList=new ArrayList<LocalDate>();
			
			for (DateRange1 dateRange : dateRanges) {
			
				dateList.add(dateRange.getStartDate());
				dateList.add(dateRange.getEndDate());
				
			}
			DateRange1 mg=new DateRange1();
			mg.setStartDate(Collections.min(dateList));
			mg.setEndDate(Collections.max(dateList));
			List<DateRange1> finalRange=new ArrayList<DateRange1>();
			finalRange.add(mg);
			
			return finalRange;
			
		}
		
		public static void main(String[] args) {
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
			//DateRange1 range2=new DateRange1(("15 Jan 2014"),("15 Feb 2014"));
			
	        DateRange1 r1=new DateRange1(LocalDate.parse("01 Jan 2014", df),LocalDate.parse("30 Jan 2014", df));
			DateRange1 r2=new DateRange1(LocalDate.parse("15 Jan 2014", df),LocalDate.parse("15 Feb 2014", df));
			DateRange1 r3=new DateRange1(LocalDate.parse("10 Feb 2014", df),LocalDate.parse("15 Mar 2014", df));
			DateRange1 r4=new DateRange1(LocalDate.parse("10 Mar 2014", df),LocalDate.parse("15 Mar 2014", df));
			DateRange1 r5=new DateRange1(LocalDate.parse("10 Apr 2014", df),LocalDate.parse("15 May 2014", df));
			
			
			
			List<DateRange1> list=new ArrayList();
			list.add(r1);
			list.add(r2);
			list.add(r3);
			list.add(r4);
			list.add(r5);
		
			for(DateRange1 d:list)
			{
				for(DateRange1 d1:list)
				{
					System.out.println(d.getStartDate()+"-"+d1.getEndDate());
					break;
				}
				//System.out.println(r1.getStartDate()+" "+r2.getEndDate());
			}
				
			}
	
}

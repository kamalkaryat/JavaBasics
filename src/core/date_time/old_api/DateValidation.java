package core.date_time.old_api;

import java.util.regex.PatternSyntaxException;

public class DateValidation {

    /**
	 * -isValidDate() method will throw 2 kinds of exception 
	 * 	1->NumberFormatException-->If splitDate[] array is not converted into int.
	 * 	2->PatternSyntaxException-->If specified pattern doesn't match.
	 * -Dates b/w 2020-01-01 & 2999-12-31 are considered as valid or true
	 */
	
	public boolean isValidDate(String date) {
		try {
			String[] splitDate=date.split("-",3);
			try {
                int yy = Integer.parseInt(splitDate[0]);
                int mm = Integer.parseInt(splitDate[1]);
                int dd = Integer.parseInt(splitDate[2]);
					
					if(yy >=2020 && yy <3000) {	//Year condition
						if(mm >=1 && mm <=12) {		//Month condition
							//Month contains 31 days
							if(mm ==1 || mm ==3 || mm ==5 || mm ==7 || mm ==8 || mm ==10 || mm ==12) {
                                return dd > 0 && dd <= 31;
							}
							//Months contains 30 days
							else if(mm ==4 || mm ==6 || mm ==9 || mm ==11) {
                                return dd > 0 && dd <= 30;
							}
							else {
								//Condition for leap years
								if(yy %4==0)
                                    return dd > 0 && dd <= 29;
								//Condition for non-leap years
								else
                                    return dd > 0 && dd < 29;
							}
						}
						else
							return false;
					}
					else
						return false;
			}catch(NumberFormatException nfe) {
				return false;
			}
		}catch(PatternSyntaxException pse) {
			return false;
		}
	}
}

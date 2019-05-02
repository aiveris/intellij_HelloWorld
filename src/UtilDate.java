import java.util.Calendar;
import java.util.Date;

public class UtilDate {
    public static void main(String[] args) {

        // 1)	Date()	Creates a date object representing current date and time.
        // 2)	Date(long milliseconds)	Creates a date object for the given milliseconds since January 1, 1970, 00:00:00 GMT.
        Date now1 = new Date();
        // or Date(long milliseconds)	Creates a date object for the given milliseconds since January 1, 1970, 00:00:00 GMT.
        long millis = System.currentTimeMillis();
        System.out.println(millis);
        Date now2 = new Date(millis - 2);

        System.out.println(now1); // Sun Dec 31 21:31:49 CET 2017

        // 1)	boolean after(Date date)	tests if current date is after the given date.
        System.out.println(now1.after(now2));
        System.out.println(now2.after(now1));

        // 2)	boolean before(Date date)	tests if current date is before the given date.
        // 3)	Object clone()	returns the clone object of current date.
        // 4)	int compareTo(Date date)	compares current date with given date.
        // 5)	boolean equals(Date date)	compares current date with given date for equality.
        // System.out.println(now1.equals(now2));
        // System.out.println(now2.equals(now1));

        // 6)	static Date from(Instant instant) returns an instance of Date object from Instant date.
        // 7)	long getTime()	returns the time represented by this date object.
        // 8)	int hashCode()	returns the hash code value for this date object.
        // 9)	void setTime(long time)	changes the current date and time to given time.
        // 10)	Instant toInstant()	converts current date into Instant object.
        // 11)	String toString()	converts this date into Instant object.
    }
}

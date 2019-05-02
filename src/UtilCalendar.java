import java.util.Calendar;
import java.util.Date;

public class UtilCalendar {
    public static void main(String[] args) {
        // ... getting the current time from calendar
        // Calendar cal = Calendar.getInstance();
        // System.out.println(cal); // we can print out the object to see it's internals
        // Date date = cal.getTime(); // convert Calendar to Date
        // System.out.println(date); // Sun Dec 31 21:31:49 CET 2017

        // ... getting the year, day, etc from date
        Calendar cal = Calendar.getInstance();
        // cal.
        Date now = new Date();
        cal.setTime(now); // convert Date to Calendar
        System.out.println(cal.get(Calendar.YEAR)); // 2017
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // 365
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); // 52


        // 1.	public void add(int field, int amount)	Adds the specified (signed) amount of time to the given calendar field.
         cal.add(Calendar.HOUR, 20);
         System.out.println("20 days later: " + cal.getTime());

         cal.add(Calendar.DATE, 20);
         System.out.println("20 days later: " + cal.getTime());

         cal.add(Calendar.YEAR, -2);
         System.out.println("2 years earlier: " + cal.getTime());

        // 2.	public boolean after (Object when)	The method Returns true if the time represented by this Calendar is after the time represented by when Object.
        // 3.	public boolean before(Object when)	The method Returns true if the time represented by this Calendar is before the time represented by when Object.
        // 4.	public final void clear(int field)	Set the given calendar field value and the time value of this Calendar undefined.
        // 5.	public Object clone()	Clone method provides the copy of the current object.
        // 6.	public int compareTo(Calendar anotherCalendar)	The compareTo() method of Calendar class compares the time values (millisecond offsets) between two calendar object.
        // 7.	protected void complete()	It fills any unset fields in the calendar fields.
        // 8.	protected abstract void computeFields()	It converts the current millisecond time value time to calendar field values in fields[].
        // 9.	protected abstract void computeTime()	It converts the current calendar field values in fields[] to the millisecond time value time.
        // 10.	public boolean equals(Object object)	The equals() method compares two objects for equality and Returns true if they are equal.
        // 11.	public int get(int field)	In get() method fields of the calendar are passed as the parameter, and this method Returns the value of fields passed as the parameter.
        // 12.	public int getActualMaximum(int field)	Returns the Maximum possible value of the calendar field passed as the parameter to getActualMaximum() method.
        // 13.	public int getActualMinimum(int field)	Returns the Minimum possible value of the calendar field passed as parameter to getActualMinimum() methot.
        // 14.	public static Set<String> getAvailableCalendarTypes()	Returns a set which contains string set of all available calendar type supported by Java Runtime Environment.
        // 15.	public static Locale[] getAvailableLocales()	Returns an array of all locales available in java runtime environment.
        // 16.	public String getCalendarType()	Returns in string all available calendar type supported by Java Runtime Environment.
        // 17.	public String getDisplayName(int field, int style, Locale locale)	Returns the String representation of the calendar field value passed as the parameter in a given style and local.
        // 18.	public Map<String,Integer> getDisplayNames(int field, int style, Locale locale)	Returns Map representation of the calendar field value passed as the parameter in a given style and local.
        // 19.	public int getFirstDayOfWeek()	Returns the first day of the week in integer form.
        // 20.	public abstract int getGreatestMinimum(int field)	This method returns the highest minimum value of Calendar field passed as the parameter.
        System.out.println("Timezone" + cal.getTimeZone().getDisplayName());
        // 21.	public static Calendar getInstance()	This method is used with calendar object to get the instance of calendar according to current time zone set by java runtime environment
        // 22.	public abstract int getLeastMaximum(int field)	Returns smallest value from all maximum value for the field specified as the parameter to the method.
        // 23.	public abstract int getMaximum(int field)	This method is used with calendar object to get the maximum value of the specified calendar field as the parameter.
        // 24.	public int getMinimalDaysInFirstWeek()	Returns required minimum days in integer form.
        // 25.	public abstract int getMinimum(int field)	This method is used with calendar object to get the minimum value of specified calendar field as the parameter.
        // 26.	public final Date getTime()	This method gets the time value of calendar object and Returns date.
        // 27.	public long getTimeInMillis()	Returns the current time in millisecond. This method has long as return type.
        // 28.	public TimeZone getTimeZone()	This method gets the TimeZone of calendar object and Returns a TimeZone object.
        // System.out.println("Timezone " + cal.getTimeZone().getDisplayName());

        // 29.	public int getWeeksInWeekYear()	Return total weeks in week year. Weeks in week year is returned in integer form.
        // 30.	public int getWeekYear()	This method gets the week year represented by current Calendar.
        // 31.	public int hashCode()	All other classes in Java overload hasCode() method. This method Returns the hash code for calendar object.
        // 32.	protected final int internalGet(int field)	This method returns the value of the calendar field passed as the parameter.
        // 33.	Public boolean isLenient()	Return Boolean value. True if the interpretation mode of this calendar is lenient; false otherwise.
        // 34.	public final boolean isSet(int field)	This method checks if specified field as the parameter has been set or not. If not set then it returns false otherwise true.
        // 35.	public boolean isWeekDateSupported()	Checks if this calendar supports week date. The default value is false.
        // 36.	public abstract void roll(int field, boolean up)	This method increase or decrease the specified calendar field by one unit without affecting the other field
        // 37.	public void set(int field, int value)	Sets the specified calendar field by the specified value.
        // 38.	public void setFirstDayOfWeek(int value)	Sets the first day of the week. The value which is to be set as the first day of the week is passed as parameter.
        // 39.	public void setMinimalDaysInFirstWeek(int value)	Sets the minimal days required in the first week. The value which is to be set as minimal days in first week is passed as parameter.
        // 40.	public final void setTime(Date date)	Sets the Time of current calendar object. A Date object id passed as the parameter.
        // 41.	public void setTimeInMillis(long millis)	Sets the current time in millisecond.
        // 42.	public void setTimeZone(TimeZone value)	Sets the TimeZone with passed TimeZone value (object) as the parameter.
        // 43.	public void setWeekDate(int weekYear, int weekOfYear, int dayOfWeek)	Sets the current date with specified integer value as the parameter. These values are weekYear, weekOfYear and dayOfWeek.
        // 44.	public final Instant toInstant()	The toInstant() method convert the current object to an instant.
        // 45.	public String toString()	Returns string representation of the current object.
    }
}

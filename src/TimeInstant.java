import java.time.Instant;

public class TimeInstant {
    public static void main(String[] args) {

        // The java.time.Instant class models a single instantaneous point on the time-line.

        Instant now = Instant.now();
        System.out.println(now);

        Instant fromUnixTimestamp = Instant.ofEpochSecond(1262347200);
        System.out.println(fromUnixTimestamp);

        // Instant fromEpochMilli = Instant.ofEpochMilli(1262347200000l);
        // Instant fromIso8601 = Instant.parse("2010-01-01T12:00:00Z");
        // long toUnixTimestamp = now.getEpochSecond();
        // long toEpochMillis = now.toEpochMilli();
        // Instant nowPlusTenSeconds = now.plusSeconds(10);
        //
        // System.out.println(Instant.EPOCH);


        // 1	Temporal adjustInto(Temporal temporal)
        // Adjusts the specified temporal object to have this instant.
        //
        // 2	OffsetDateTime atOffset(ZoneOffset offset)
        // Combines this instant with an offset to create an OffsetDateTime.
        //
        // 3	ZonedDateTime atZone(ZoneId zone)
        // Combines this instant with a time-zone to create a ZonedDateTime.
        //
        // 4	int compareTo(Instant otherInstant)
        // Compares this instant to the specified instant.
        //
        // 5	boolean equals(Object otherInstant)
        // Checks if this instant is equal to the specified instant.
        //
        // 6	static Instant from(TemporalAccessor temporal)
        // Obtains an instance of Instant from a temporal object.
        //
        // 7	int get(TemporalField field)
        // Gets the value of the specified field from this instant as an int.
        //
        // 8	long getEpochSecond()
        // Gets the number of seconds from the Java epoch of 1970-01-01T00:00:00Z.
        //
        // 9	long getLong(TemporalField field)
        // Gets the value of the specified field from this instant as a long.
        //
        // 10	int getNano()
        // Gets the number of nanoseconds, later along the time-line, from the start of the second.
        //
        // 11	int hashCode()
        // Returns a hash code for this instant.
        //
        // 12	boolean isAfter(Instant otherInstant)
        // Checks if this instant is after the specified instant.
        //
        // 13	boolean isBefore(Instant otherInstant)
        // Checks if this instant is before the specified instant.
        //
        // 14	boolean isSupported(TemporalField field)
        // Checks if the specified field is supported.
        //
        // 15	boolean isSupported(TemporalUnit unit)
        // Checks if the specified unit is supported.
        //
        // 16	Instant minus(long amountToSubtract, TemporalUnit unit)
        // Returns a copy of this instant with the specified amount subtracted.
        //
        // 17	Instant minus(TemporalAmount amountToSubtract)
        // Returns a copy of this instant with the specified amount subtracted.
        //
        // 18	Instant minusMillis(long millisToSubtract)
        // Returns a copy of this instant with the specified duration in milliseconds subtracted.
        //
        // 19	Instant minusNanos(long nanosToSubtract)
        // Returns a copy of this instant with the specified duration in nanoseconds subtracted.
        //
        // 20	Instant minusSeconds(long secondsToSubtract)
        // Returns a copy of this instant with the specified duration in seconds subtracted.
        //
        // 21	static Instant now()
        // Obtains the current instant from the system clock.
        //
        // 22	static Instant now(Clock clock)
        // Obtains the current instant from the specified clock.
        //
        // 23	static Instant ofEpochMilli(long epochMilli)
        // Obtains an instance of Instant using milliseconds from the epoch of 1970-01-01T00:00:00Z.
        //
        // 24	static Instant ofEpochSecond(long epochSecond)
        // Obtains an instance of Instant using seconds from the epoch of 1970-01-01T00:00:00Z.
        //
        // 25	static Instant ofEpochSecond(long epochSecond, long nanoAdjustment)
        // Obtains an instance of Instant using seconds from the epoch of 1970-01-01T00:00:00Z and nanosecond fraction of second.
        //
        // 26	static Instant parse(CharSequence text)
        // Obtains an instance of Instant from a text string such as 2007-12-03T10:15:30.00Z.
        //
        // 27	Instant plus(long amountToAdd, TemporalUnit unit)
        // Returns a copy of this instant with the specified amount added.
        //
        // 28	Instant plus(TemporalAmount amountToAdd)
        // Returns a copy of this instant with the specified amount added.
        //
        // 29	Instant plusMillis(long millisToAdd)
        // Returns a copy of this instant with the specified duration in milliseconds added.
        //
        // 30	Instant plusNanos(long nanosToAdd)
        // Returns a copy of this instant with the specified duration in nanoseconds added.
        //
        // 31	Instant plusSeconds(long secondsToAdd)
        // Returns a copy of this instant with the specified duration in seconds added.
        //
        // 32	R query(TemporalQuery query)
        // Queries this instant using the specified query.
        //
        // 33	ValueRange range(TemporalField field)
        // Gets the range of valid values for the specified field.
        //
        // 34	long toEpochMilli()
        // Converts this instant to the number of milliseconds from the epoch of 1970-01-01T00:00:00Z.
        //
        // 35	String toString()
        // A string representation of this instant using ISO-8601 representation.
        //
        // 36	Instant truncatedTo(TemporalUnit unit)
        // Returns a copy of this Instant truncated to the specified unit.
        //
        // 37	long until(Temporal endExclusive, TemporalUnit unit)
        // Calculates the amount of time until another instant in terms of the specified unit.
        //
        // 38	Instant with(TemporalAdjuster adjuster)
        // Returns an adjusted copy of this instant.
        //
        // 39	Instant with(TemporalField field, long newValue)
        // Returns a copy of this instant with the specified field set to a new value.
    }
}
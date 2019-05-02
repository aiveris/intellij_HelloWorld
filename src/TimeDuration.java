import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeDuration {
    public static void main(String[] args) {

        // The java.time.Duration class models a quantity or amount of time in terms of seconds and nanoseconds.
        // It can be accessed using other duration-based units, such as minutes and hours.

        LocalTime initialTime = LocalTime.of(6, 30, 0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
        long thirty = Duration.between(finalTime, initialTime).getSeconds();
        System.out.println(thirty);

        // // The ChronoUnit enum, discussed in the The Temporal Package, defines the units used to measure time.
        // long thirty = ChronoUnit.SECONDS.between(finalTime, initialTime);


        Duration duration = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(duration);


        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        date = (LocalDateTime)duration.addTo(date);
        System.out.println(date);


        // 1	Duration abs()
        // Returns a copy of this duration with a positive length.
        //
        // 2	Temporal addTo(Temporal temporal)
        // Adds this duration to the specified temporal object.
        //
        // 3	static Duration between(Temporal startInclusive, Temporal endExclusive)
        // Obtains a Duration representing the duration between two temporal objects.
        //
        // 4	int compareTo(Duration otherDuration)
        // Compares this duration to the specified Duration.
        //
        // 5	Duration dividedBy(long divisor)
        // Returns a copy of this duration divided by the specified value.
        //
        // 6	boolean equals(Object otherDuration)
        // Checks if this duration is equal to the specified Duration.
        //
        // 7	static Duratio from(TemporalAmount amount)
        // Obtains an instance of Duration from a temporal amount.
        //
        // 8	long get(TemporalUnit unit)
        // Gets the value of the requested unit.
        //
        // 9	int getNano()
        // Gets the number of nanoseconds within the second in this duration.
        //
        // 10	long getSeconds()
        // Gets the number of seconds in this duration.
        //
        // 11	List<TemporalUnit> getUnits()
        // Gets the set of units supported by this duration.
        //
        // 12	int hashCode()
        // A hash code for this duration.
        //
        // 13	boolean isNegative()
        // Checks if this duration is negative, excluding zero.
        //
        // 14	boolean isZero()
        // Checks if this duration is zero length.
        //
        // 15	Duration minus(Duration duration)
        // Returns a copy of this duration with the specified duration subtracted.
        //
        // 16	Duration minus(long amountToSubtract, TemporalUnit unit)
        // Returns a copy of this duration with the specified duration subtracted.
        //
        // 17	Duration minusDays(long daysToSubtract)
        // Returns a copy of this duration with the specified duration in standard 24 hour days subtracted.
        //
        // 18	Duration minusHours(long hoursToSubtract)
        // Returns a copy of this duration with the specified duration in hours subtracted.
        //
        // 19	Duration minusMillis(long millisToSubtract)
        // Returns a copy of this duration with the specified duration in milliseconds subtracted.
        //
        // 20	Duration minusMinutes(long minutesToSubtract)
        // Returns a copy of this duration with the specified duration in minutes subtracted.
        //
        // 21	Duration minusNanos(long nanosToSubtract)
        // Returns a copy of this duration with the specified duration in nanoseconds subtracted.
        //
        // 22	Duration minusSeconds(long secondsToSubtract)
        // Returns a copy of this duration with the specified duration in seconds subtracted.
        //
        // 23	Duration multipliedBy(long multiplicand)
        // Returns a copy of this duration multiplied by the scalar.
        //
        // 24	Duration negated()
        // Returns a copy of this duration with the length negated.
        //
        // 25	static Duration of(long amount, TemporalUnit unit)
        // Obtains a Duration representing an amount in the specified unit.
        //
        // 26	static Duration ofDays(long days)
        // Obtains a Duration representing a number of standard 24 hour days.
        //
        // 27	static Duration ofHours(long hours)
        // Obtains a Duration representing a number of standard hours.
        //
        // 28	static Duration ofMillis(long millis)
        // Obtains a Duration representing a number of milliseconds.
        //
        // 29	static Duration ofMinutes(long minutes)
        // Obtains a Duration representing a number of standard minutes.
        //
        // 30	static Duration ofNanos(long nanos)
        // Obtains a Duration representing a number of nanoseconds.
        //
        // 31	static Duration ofSeconds(long seconds)
        // Obtains a Duration representing a number of seconds.
        //
        // 32	static Duration ofSeconds(long seconds, long nanoAdjustment)
        // Obtains a Duration representing a number of seconds and an adjustment in nanoseconds.
        //
        // 33	static Duration parse(CharSequence text)
        // Obtains a Duration from a text string such as PnDTnHnMn.nS.
        //
        // 34	Duration plus(Duration duration)
        // Returns a copy of this duration with the specified duration added.
        //
        // 35	Duration plus(long amountToAdd, TemporalUnit unit)
        // Returns a copy of this duration with the specified duration added.
        //
        // 36	Duration plusDays(long daysToAdd)
        // Returns a copy of this duration with the specified duration in standard 24 hour days added.
        //
        // 37	Duration plusHours(long hoursToAdd)
        // Returns a copy of this duration with the specified duration in hours added.
        //
        // 38	Duration plusMillis(long millisToAdd)
        // Returns a copy of this duration with the specified duration in milliseconds added.
        //
        // 39	Duration plusMinutes(long minutesToAdd)
        // Returns a copy of this duration with the specified duration in minutes added.
        //
        // 40	Duration plusNanos(long nanosToAdd)
        // Returns a copy of this duration with the specified duration in nanoseconds added.
        //
        // 41	Duration plusSeconds(long secondsToAdd)
        // Returns a copy of this duration with the specified duration in seconds added.
        //
        // 42	Temporal subtractFrom(Temporal temporal)
        // Subtracts this duration from the specified temporal object.
        //
        // 43	long toDays()
        // Gets the number of days in this duration.
        //
        // 44	long toHours()
        // Gets the number of hours in this duration.
        //
        // 45	long toMillis()
        // Converts this duration to the total length in milliseconds.
        //
        // 46	long toMinutes()
        // Gets the number of minutes in this duration.
        //
        // 47	long toNanos()
        // Converts this duration to the total length in nanoseconds expressed as a long.
        //
        // 48	String toString()
        // A string representation of this duration using ISO-8601 seconds based representation, such as PT8H6M12.345S.
        //
        // 49	Duration withNanos(int nanoOfSecond)
        // Returns a copy of this duration with the specified nano-of-second.
        //
        // 50	Duration withSeconds(long seconds)
        // Returns a copy of this duration with the specified amount of seconds.

    }
}
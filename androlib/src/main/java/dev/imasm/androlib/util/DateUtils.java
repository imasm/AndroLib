/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.imasm.androlib.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    /**
     * Strip time from date
     * @param date Original date
     * @return Original date with time set to 0
     */
    public static Date stripTime(Date date) {
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        return calendar.getTime();
    }

    /**
     * Gets date created from specified year, month (0-11) and day.
     *
     * @param year        Year number
     * @param monthOfYear The month that was set (0-11) for compatibility
     *                    with {@link Calendar}.
     * @param dayOfMonth  Day of Month
     * @return New date
     */
    public static Date getDate(int year, int monthOfYear, int dayOfMonth) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, monthOfYear, dayOfMonth);

        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        return calendar.getTime();
    }

    /**
     * Parses the specified string as a Date value.
     *
     * @param date        date in YYYYMMDD format.
     * @return New date
     */
    public static Date parseDateYYYYMMDD(String date) {

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(4, 4 + 2));
        int dayofmonth = Integer.parseInt(date.substring(6, 6 + 2));

        return getDate(year, month - 1, dayofmonth);
    }

    /**
     * Return the number of days between to dates
     * @param time1 first date
     * @param time2 second date
     * @return number of days
     */
    public static int daysBetween(long time1, long time2)
    {
        return (int)( (time2 - time1) / (1000 * 60 * 60 * 24));
    }

    /**
     * Return the number of days between to dates
     * @param date1 first date
     * @param date2 second date
     * @return number of days
     */
    public static int daysBetween(Date date1, Date date2)
    {
        return daysBetween(date1.getTime(), date2.getTime());
    }

    /**
     * Adds the specified number of days to the date.
     */
    public static Date addDays(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        return calendar.getTime();
    }

    /**
     * Adds the specified number of hours to the date.
     */
    public static Date addHours(Date date, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        return calendar.getTime();
    }

    /**
     * Adds the specified number of minutes to the date.
     */
    public static Date addMinutes(Date date, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }
    
    /**
    * Gets the current date.
    */
    public static Date today() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
    * Gets the current date and time.
    */
    public static Date now() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }
}


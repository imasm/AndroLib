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

import android.text.TextUtils;

public class NumberUtils {

    /**
     * Converts the string representation of a number to its 'integer' equivalent.
     * Returns zero if the conversion fails.
     * @param str A string containing a number to convert
     * @return A 'integer' equivalent to the number contained in str.
     */
    public static int toInt(final String str) {
        return toInt(str, 0);
    }

    /**
     * Converts the string representation of a number to its 'integer' equivalent.
     * Returns defaultValue if the conversion fails.
     * @param str A string containing a number to convert
     * @param defaultValue The default value
     * @return A 'integer' equivalent to the number contained in str.
     */
    public static int toInt(final String str, final int defaultValue) {
        if (TextUtils.isEmpty(str)) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(str);
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Converts the string representation of a number to its 'long' equivalent.
     * Returns zero if the conversion fails.
     * @param str A string containing a number to convert
     * @return A 'long' equivalent to the number contained in str.
     */
    public static long toLong(final String str) {
        return toLong(str, 0L);
    }

    /**
     * Converts the string representation of a number to its 'long' equivalent.
     * Returns defaultValue if the conversion fails.
     * @param str A string containing a number to convert
     * @param defaultValue The default value
     * @return A 'long' equivalent to the number contained in str.
     */
    public static long toLong(final String str, final long defaultValue) {
        if (TextUtils.isEmpty(str)) {
            return defaultValue;
        }
        try {
            return Long.parseLong(str);
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Converts the string representation of a number to its 'float' equivalent.
     * Returns zero if the conversion fails.
     * @param str A string containing a number to convert
     * @return A 'float' equivalent to the number contained in str.
     */
    public static float toFloat(final String str) {
        return toFloat(str, 0.0f);
    }

    /**
     * Converts the string representation of a number to its 'float' equivalent.
     * Returns defaultValue if the conversion fails.
     * @param str A string containing a number to convert
     * @param defaultValue The default value
     * @return A 'float' equivalent to the number contained in str.
     */
    public static float toFloat(final String str, final float defaultValue) {
        if (TextUtils.isEmpty(str)) {
            return defaultValue;
        }
        try {
            return Float.parseFloat(str);
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Converts the string representation of a number to its 'double' equivalent.
     * Returns zero if the conversion fails.
     * @param str A string containing a number to convert
     * @return A 'double' equivalent to the number contained in str.
     */
    public static double toDouble(final String str) {
        return toDouble(str, 0.0d);
    }

    /**
     * Converts the string representation of a number to its 'double' equivalent.
     * Returns defaultValue if the conversion fails.
     * @param str A string containing a number to convert
     * @param defaultValue The default value
     * @return A 'double' equivalent to the number contained in str.
     */
    public static double toDouble(final String str, final double defaultValue) {
        if (TextUtils.isEmpty(str)) {
            return defaultValue;
        }
        try {
            return Double.parseDouble(str);
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Converts the string representation of a number to its 'byte' equivalent.
     * Returns zero if the conversion fails.
     * @param str A string containing a number to convert
     * @return A 'byte' equivalent to the number contained in str.
     */
    public static byte toByte(final String str) {
        return toByte(str, (byte) 0);
    }

    /**
     * Converts the string representation of a number to its 'byte' equivalent.
     * Returns defaultValue if the conversion fails.
     * @param str A string containing a number to convert
     * @param defaultValue The default value
     * @return A 'byte' equivalent to the number contained in str.
     */
    public static byte toByte(final String str, final byte defaultValue) {
        if (TextUtils.isEmpty(str)) {
            return defaultValue;
        }
        try {
            return Byte.parseByte(str);
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Converts the string representation of a number to its 'short' equivalent.
     * Returns zero if the conversion fails.
     * @param str A string containing a number to convert
     * @return A 'short' equivalent to the number contained in str.
     */
    public static short toShort(final String str) {
        return toShort(str, (short) 0);
    }

    /**
     * Converts the string representation of a number to its 'short' equivalent.
     * Returns defaultValue if the conversion fails.
     * @param str A string containing a number to convert
     * @param defaultValue The default value
     * @return A 'short' equivalent to the number contained in str.
     */
    public static short toShort(final String str, final short defaultValue) {
        if (TextUtils.isEmpty(str)) {
            return defaultValue;
        }
        try {
            return Short.parseShort(str);
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }
}
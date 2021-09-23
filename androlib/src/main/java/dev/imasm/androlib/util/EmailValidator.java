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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Perform email validations.
 */
public class EmailValidator implements Serializable {

    /**
     * Singleton instance of this class, which
     *  doesn't consider local addresses as valid.
     */
    private static final EmailValidator EMAIL_VALIDATOR = new EmailValidator();

    /**
     * EMail Pattern
     */
    public static final Pattern EMAIL_ADDRESS
            = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );

    /**
     * Returns the Singleton instance of this validator.
     *
     * @return singleton instance of this validator.
     */
    public static EmailValidator getInstance() {
        return EMAIL_VALIDATOR;
    }

    /**
     * Protected constructor for subclasses to use.
     */
    protected EmailValidator() {
        super();

    }


    /**
     * <p>Checks if a field has a valid e-mail address.</p>
     *
     * @param email The value validation is being performed on.  A <code>null</code>
     *              value is considered invalid.
     * @return true if the email address is valid.
     */
    public boolean isValid(String email) {
        if (email == null) {
            return false;
        }

        //noinspection SimplifiableIfStatement
        if (email.endsWith(".")) { // check this first - it's cheap!
            return false;
        }

        return EMAIL_ADDRESS.matcher(email).matches();
    }

    /**
     * <p>Extract all valid e-mail address from string.</p>
     *
     * @return List of email addresses.
     */
    public List<String> extractAddresses(String s) {
        List<String> list = new ArrayList<>();

        Pattern p = Pattern.compile("\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b",
                Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        while (m.find())
            list.add(m.group());

        return list;
    }
}
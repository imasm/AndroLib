package imasm.androlib;

import org.junit.Test;

import imasm.androlib.util.StringUtils;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class StringUtilsTest {
    @Test
    public void isEmpty_empty() throws Exception {
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void isEmpty_null() throws Exception {
        assertTrue(StringUtils.isEmpty(null));
    }

    @Test
    public void isEmpty_notEmpty() throws Exception {
        assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void repeat_null() throws Exception {
        assertEquals(StringUtils.repeat(null, 2), null);
    }

    @Test
    public void repeat_zero() throws Exception {
        assertEquals(StringUtils.repeat("", 0), "");
    }

    @Test
    public void repeat_empty() throws Exception {
        assertEquals(StringUtils.repeat("", 2), "");
    }

    @Test
    public void repeat_singleChar() throws Exception {
        assertEquals(StringUtils.repeat("a", 3), "aaa");
    }

    @Test
    public void repeat_string() throws Exception {
        assertEquals(StringUtils.repeat("ab", 2), "abab");
    }

    @Test
    public void repeat_negative() throws Exception {
        assertEquals(StringUtils.repeat("a", -2), "");
    }


    @Test
    public void repeatSeparator_nullAll() throws Exception {
        assertEquals(StringUtils.repeat(null, null, 2), null);
    }

    @Test
    public void repeatSeparator_nullString() throws Exception {
        assertEquals(StringUtils.repeat(null, "x", 2), null);
    }

    @Test
    public void repeatSeparator_nullSeparator() throws Exception {
        assertEquals(StringUtils.repeat("", null, 0), "");
    }

    @Test
    public void repeatSeparator_emptyAll() throws Exception {
        assertEquals(StringUtils.repeat("", "", 2), "");
    }

    @Test
    public void repeatSeparator_emptyString() throws Exception {
        assertEquals(StringUtils.repeat("", "x", 3), "xx");
    }

    @Test
    public void repeatSeparator_coma() throws Exception {
        assertEquals(StringUtils.repeat("?", ", ", 3), "?, ?, ?");
    }

    @Test
    public void repeatChar_zero() throws Exception {
        assertEquals(StringUtils.repeat('e', 0), "");
    }

    @Test
    public void repeatChar_positive() throws Exception {
        assertEquals(StringUtils.repeat('e', 3), "eee");
    }

    @Test
    public void repeatChar_negative() throws Exception {
        assertEquals(StringUtils.repeat('e', -2), "");
    }


    @Test
    public void padRight_null() throws Exception {
        assertEquals(StringUtils.padRight(null, 1), null);
    }


    @Test
    public void padRight_space() throws Exception {
        assertEquals(StringUtils.padRight("", 3), "   ");
    }


    @Test
    public void padRight_text() throws Exception {
        assertEquals(StringUtils.padRight("bat", 3), "bat");
    }


    @Test
    public void padRight_larger() throws Exception {
        assertEquals(StringUtils.padRight("bat", 5), "bat  ");
    }


    @Test
    public void padRight_smaller() throws Exception {
        assertEquals(StringUtils.padRight("bat", 1), "bat");
    }


    @Test
    public void padRight_negative() throws Exception {
        assertEquals(StringUtils.padRight("bat", -1), "bat");
    }


    @Test
    public void padRightChar_null() throws Exception {
        assertEquals(StringUtils.padRight(null, 1, 'z'), null);
    }

    @Test
    public void padRightChar_empty() throws Exception {
        assertEquals(StringUtils.padRight("", 3, 'z'), "zzz");
    }

    @Test
    public void padRightChar_text() throws Exception {
        assertEquals(StringUtils.padRight("bat", 3, 'z'), "bat");
    }

    @Test
    public void padRightChar_larger() throws Exception {
        assertEquals(StringUtils.padRight("bat", 5, 'z'), "batzz");
    }

    @Test
    public void padRightChar_smaller() throws Exception {
        assertEquals(StringUtils.padRight("bat", 1, 'z'), "bat");
    }

    @Test
    public void padRightChar_negative() throws Exception {
        assertEquals(StringUtils.padRight("bat", -1, 'z'), "bat");
    }

    @Test
    public void padRightString_null() throws Exception {
        assertEquals(StringUtils.padRight(null, 1, ""), null);
    }

    @Test
    public void padRightString_empty() throws Exception {
        assertEquals(StringUtils.padRight("", 3, "z"), "zzz");
    }

    @Test
    public void padRightString_text() throws Exception {
        assertEquals(StringUtils.padRight("bat", 3, "yz"), "bat");
    }

    @Test
    public void padRightString_larger() throws Exception {
        assertEquals(StringUtils.padRight("bat", 5, "yz"), "batyz");
    }

    @Test
    public void padRightString_moreLarger() throws Exception {
        assertEquals(StringUtils.padRight("bat", 8, "yz"), "batyzyzy");
    }

    @Test
    public void padRightString_smaller() throws Exception {
        assertEquals(StringUtils.padRight("bat", 1, "yz"), "bat");
    }

    @Test
    public void padRightString_negative() throws Exception {
        assertEquals(StringUtils.padRight("bat", -1, "yz"), "bat");
    }

    @Test
    public void padRightString_nullPadding() throws Exception {
        assertEquals(StringUtils.padRight("bat", 5, null), "bat  ");
    }

    @Test
    public void padRightString_emptyPadding() throws Exception {
        assertEquals(StringUtils.padRight("bat", 5, ""), "bat  ");
    }

    // PadLeft
    @Test
    public void padLeft_null() throws Exception {
        assertEquals(StringUtils.padLeft(null, 1), null);
    }


    @Test
    public void padLeft_space() throws Exception {
        assertEquals(StringUtils.padLeft("", 3), "   ");
    }


    @Test
    public void padLeft_text() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 3), "bat");
    }


    @Test
    public void padLeft_larger() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 5), "  bat");
    }


    @Test
    public void padLeft_smaller() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 1), "bat");
    }


    @Test
    public void padLeft_negative() throws Exception {
        assertEquals(StringUtils.padLeft("bat", -1), "bat");
    }


    @Test
    public void padLeftChar_null() throws Exception {
        assertEquals(StringUtils.padLeft(null, 1, 'z'), null);
    }

    @Test
    public void padLeftChar_empty() throws Exception {
        assertEquals(StringUtils.padLeft("", 3, 'z'), "zzz");
    }

    @Test
    public void padLeftChar_text() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 3, 'z'), "bat");
    }

    @Test
    public void padLeftChar_larger() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 5, 'z'), "zzbat");
    }

    @Test
    public void padLeftChar_smaller() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 1, 'z'), "bat");
    }

    @Test
    public void padLeftChar_negative() throws Exception {
        assertEquals(StringUtils.padLeft("bat", -1, 'z'), "bat");
    }

    @Test
    public void padLeftString_null() throws Exception {
        assertEquals(StringUtils.padLeft(null, 1, ""), null);
    }

    @Test
    public void padLeftString_empty() throws Exception {
        assertEquals(StringUtils.padLeft("", 3, "z"), "zzz");
    }

    @Test
    public void padLeftString_text() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 3, "yz"), "bat");
    }

    @Test
    public void padLeftString_larger() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 5, "yz"), "yzbat");
    }

    @Test
    public void padLeftString_moreLarger() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 8, "yz"), "yzyzybat");
    }

    @Test
    public void padLeftString_smaller() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 1, "yz"), "bat");
    }

    @Test
    public void padLeftString_negative() throws Exception {
        assertEquals(StringUtils.padLeft("bat", -1, "yz"), "bat");
    }

    @Test
    public void padLeftString_nullPadding() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 5, null), "  bat");
    }

    @Test
    public void padLeftString_emptyPadding() throws Exception {
        assertEquals(StringUtils.padLeft("bat", 5, ""), "  bat");
    }

    // Remove Start

    @Test
    public void removeStart_nullString() throws Exception {
        assertEquals(StringUtils.removeStart(null, ""), null);
    }

    @Test
    public void removeStart_empty() throws Exception {
        assertEquals(StringUtils.removeStart("", ""), "");
    }

    @Test
    public void removeStart_nullRemove() throws Exception {
        assertEquals(StringUtils.removeStart("any", null), "any");
    }

    @Test
    public void removeStart_Beginning() throws Exception {
        assertEquals(StringUtils.removeStart("www.domain.com", "www."), "domain.com");
    }

    @Test
    public void removeStart_notBeginnng() throws Exception {
        assertEquals(StringUtils.removeStart("domain.com", "www."), "domain.com");
    }

    @Test
    public void removeStart_inside() throws Exception {
        assertEquals(StringUtils.removeStart("www.domain.com", "domain"), "www.domain.com");
    }

    @Test
    public void removeStart_emptyRemove() throws Exception {
        assertEquals(StringUtils.removeStart("abc", ""), "abc");
    }

    // Remove Start Ignore case

    @Test
    public void removeStartIgnoreCase_nullString() throws Exception {
        assertEquals(StringUtils.removeStartIgnoreCase(null, ""), null);
    }

    @Test
    public void removeStartIgnoreCase_empty() throws Exception {
        assertEquals(StringUtils.removeStartIgnoreCase("", ""), "");
    }

    @Test
    public void removeStartIgnoreCase_nullRemove() throws Exception {
        assertEquals(StringUtils.removeStartIgnoreCase("any", null), "any");
    }

    @Test
    public void removeStartIgnoreCase_Beginning() throws Exception {
        assertEquals(StringUtils.removeStartIgnoreCase("www.domain.com", "www."), "domain.com");
    }

    @Test
    public void removeStartIgnoreCase_Upper() throws Exception {
        assertEquals(StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."), "domain.com");
    }

    @Test
    public void removeStartIgnoreCase_notBeginnng() throws Exception {
        assertEquals(StringUtils.removeStartIgnoreCase("domain.com", "www."), "domain.com");
    }

    @Test
    public void removeStartIgnoreCase_inside() throws Exception {
        assertEquals(StringUtils.removeStartIgnoreCase("www.domain.com", "domain"), "www.domain.com");
    }

    @Test
    public void removeStartIgnoreCase_emptyRemove() throws Exception {
        assertEquals(StringUtils.removeStartIgnoreCase("abc", ""), "abc");
    }


    // Remove End

    @Test
    public void removeEnd_nullString() throws Exception {
        assertEquals(StringUtils.removeEnd(null, ""), null);
    }

    @Test
    public void removeEnd_empty() throws Exception {
        assertEquals(StringUtils.removeEnd("", ""), "");
    }

    @Test
    public void removeEnd_nullRemove() throws Exception {
        assertEquals(StringUtils.removeEnd("any", null), "any");
    }

    @Test
    public void removeEnd_Ending() throws Exception {
        assertEquals(StringUtils.removeEnd("www.domain.com", ".com"), "www.domain");
    }

    @Test
    public void removeEnd_notEnding() throws Exception {
        assertEquals(StringUtils.removeEnd("www.domain.com", ".com."), "www.domain.com");
    }

    @Test
    public void removeEnd_inside() throws Exception {
        assertEquals(StringUtils.removeEnd("www.domain.com", "domain"), "www.domain.com");
    }

    @Test
    public void removeEnd_emptyRemove() throws Exception {
        assertEquals(StringUtils.removeEnd("abc", ""), "abc");
    }

    // Remove End Ignore case

    @Test
    public void removeEndIgnoreCase_nullString() throws Exception {
        assertEquals(StringUtils.removeEndIgnoreCase(null, ""), null);
    }

    @Test
    public void removeEndIgnoreCase_empty() throws Exception {
        assertEquals(StringUtils.removeEndIgnoreCase("", ""), "");
    }

    @Test
    public void removeEndIgnoreCase_nullRemove() throws Exception {
        assertEquals(StringUtils.removeEndIgnoreCase("any", null), "any");
    }

    @Test
    public void removeEndIgnoreCase_notEnding() throws Exception {
        assertEquals(StringUtils.removeEndIgnoreCase("www.domain.com", ".com."), "www.domain.com");
    }

    @Test
    public void removeEndIgnoreCase_Ending() throws Exception {
        assertEquals(StringUtils.removeEndIgnoreCase("www.domain.com", ".com"), "www.domain");
    }

    @Test
    public void removeEndIgnoreCase_inside() throws Exception {
        assertEquals(StringUtils.removeEndIgnoreCase("www.domain.com", "domain"), "www.domain.com");
    }

    @Test
    public void removeEndIgnoreCase_emptyRemove() throws Exception {
        assertEquals(StringUtils.removeEndIgnoreCase("abc", ""), "abc");
    }

    @Test
    public void removeEndIgnoreCase_UpperString() throws Exception {
        assertEquals(StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"), "www.domain");
    }

    @Test
    public void removeEndIgnoreCase_UpperPattern() throws Exception {
        assertEquals(StringUtils.removeEndIgnoreCase("www.domain.com", ".COM"), "www.domain");
    }


    // Remove First N Chars

    @Test
    public void removeFirstN_zeros() throws Exception {
        assertEquals(StringUtils.removeFirstN("0000012345", '0'), "12345");
    }

    @Test
    public void removeFirstN_spaces() throws Exception {
        assertEquals(StringUtils.removeFirstN("     12345", ' '), "12345");
    }

    @Test
    public void removeFirstN_notBeginning() throws Exception {
        assertEquals(StringUtils.removeFirstN("1234500000", '0'), "1234500000");
    }

    @Test
    public void removeFirstN_emty() throws Exception {
        assertEquals(StringUtils.removeFirstN("", '0'), "");
    }

    @Test
    public void removeFirstN_null() throws Exception {
        assertEquals(StringUtils.removeFirstN(null, '0'), null);
    }

    // startsWith

    @Test
    public void startsWith_nullAll() throws Exception {
        assertEquals(StringUtils.startsWith(null, null), true);
    }

    @Test
    public void startsWith_nullString() throws Exception {
        assertEquals(StringUtils.startsWith(null, "abc"), false);
    }

    @Test
    public void startsWith_nullPattern() throws Exception {
        assertEquals(StringUtils.startsWith("abcdef", null), false);
    }

    @Test
    public void startsWith_true() throws Exception {
        assertEquals(StringUtils.startsWith("abcdef", "abc"), true);
    }

    @Test
    public void startsWith_false() throws Exception {
        assertEquals(StringUtils.startsWith("ABCDEF", "abc"), false);
    }

    // startsWithIgnoreCase

    @Test
    public void startsWithIgnoreCase_nullAll() throws Exception {
        assertEquals(StringUtils.startsWithIgnoreCase(null, null), true);
    }

    @Test
    public void startsWithIgnoreCase_nullString() throws Exception {
        assertEquals(StringUtils.startsWithIgnoreCase(null, "abc"), false);
    }

    @Test
    public void startsWithIgnoreCase_nullPattern() throws Exception {
        assertEquals(StringUtils.startsWithIgnoreCase("abcdef", null), false);
    }

    @Test
    public void startsWithIgnoreCase_true() throws Exception {
        assertEquals(StringUtils.startsWithIgnoreCase("abcdef", "abc"), true);
    }

    @Test
    public void startsWithIgnoreCase_upper() throws Exception {
        assertEquals(StringUtils.startsWithIgnoreCase("ABCDEF", "abc"), true);
    }


    // endsWith

    @Test
    public void endsWith_nullAll() throws Exception {
        assertEquals(StringUtils.endsWith(null, null), true);
    }

    @Test
    public void endsWith_nullString() throws Exception {
        assertEquals(StringUtils.endsWith(null, "def"), false);
    }

    @Test
    public void endsWith_nullPattern() throws Exception {
        assertEquals(StringUtils.endsWith("abcdef", null), false);
    }

    @Test
    public void endsWith_true() throws Exception {
        assertEquals(StringUtils.endsWith("abcdef", "def"), true);
    }

    @Test
    public void endsWith_upper() throws Exception {
        assertEquals(StringUtils.endsWith("ABCDEF", "def"), false);
    }

    @Test
    public void endsWith_false() throws Exception {
        assertEquals(StringUtils.endsWith("ABCDEF", "cde"), false);
    }

    // endsWithIgnoreCase

    @Test
    public void endsWithIgnoreCase_nullAll() throws Exception {
        assertEquals(StringUtils.endsWithIgnoreCase(null, null), true);
    }

    @Test
    public void endsWithIgnoreCase_nullString() throws Exception {
        assertEquals(StringUtils.endsWithIgnoreCase(null, "def"), false);
    }

    @Test
    public void endsWithIgnoreCase_nullPattern() throws Exception {
        assertEquals(StringUtils.endsWithIgnoreCase("abcdef", null), false);
    }

    @Test
    public void endsWithIgnoreCase_true() throws Exception {
        assertEquals(StringUtils.endsWithIgnoreCase("abcdef", "def"), true);
    }

    @Test
    public void endsWithIgnoreCase_upper() throws Exception {
        assertEquals(StringUtils.endsWithIgnoreCase("ABCDEF", "def"), true);
    }

    @Test
    public void endsWithIgnoreCase_false() throws Exception {
        assertEquals(StringUtils.endsWith("ABCDEF", "cde"), false);
    }

    // Extract
    @Test
    public void extract_match() throws Exception {
        assertEquals(StringUtils.extract("hamburger", 2) , "mburger");
    }

    @Test
    public void extract_beginnig() throws Exception {
        assertEquals(StringUtils.extract("hamburger", 0) , "hamburger");
    }

    @Test
    public void extract_empty() throws Exception {
        assertEquals(StringUtils.extract("", 0) , "");
    }

    @Test
    public void extract_null() throws Exception {
        assertEquals(StringUtils.extract(null, 0) , null);
    }

    @Test
    public void extract_negativeIndex()  {
        assertEquals(StringUtils.extract("hamburger", -2) , "hamburger");
    }

    @Test
    public void extract_largerIndex()  {
        assertEquals(StringUtils.extract("hamburger", 10) , "");
    }


    // Extract with length
    @Test
    public void extractWithLength_match() throws Exception {
        assertEquals(StringUtils.extract("hamburger", 2 ,4) , "mbur");
    }

    @Test
    public void extractWithLength_moreChars() throws Exception {
        assertEquals(StringUtils.extract("hamburger", 0, 10) , "hamburger");
    }

    @Test
    public void extractWithLength_empty() throws Exception {
        assertEquals(StringUtils.extract("", 0) , "");
    }

    @Test
    public void extractWithLength_null() throws Exception {
        assertEquals(StringUtils.extract(null, 0) , null);
    }

    @Test
    public void extractWithLength_negativeIndex()  {
        assertEquals(StringUtils.extract("hamburger", -5, 10) , "hambu");
    }

    @Test
    public void extractWithLength_moreNegative()  {
        assertEquals(StringUtils.extract("hamburger", -5, 2) , "");
    }

    @Test
    public void extractWithLength_largerIndex()  {
        assertEquals(StringUtils.extract("hamburger", 10, 5) , "");
    }




}
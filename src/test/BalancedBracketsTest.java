package test;

import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


//      1 - [LaunchCode]
    @Test
    public void hasBalancedBrackets_ProperString1_ShouldReturnTrue() {
        // Assert
        var string = "[LaunchCode]";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertTrue(expected);
    }

//    2 - Launch[Code]
    @Test
    public void hasBalancedBrackets_ProperString2_ShouldReturnTrue() {
        // Assert
        var string = "Launch[Code]";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertTrue(expected);
    }
//    3 - []LaunchCode
        @Test
        public void hasBalancedBrackets_ProperString3_ShouldReturnTrue() {
            // Assert
            var string = "[]LaunchCode";

            // Act
            var expected = hasBalancedBrackets(string);

            // Assert
            assertTrue(expected);
    }
//    4 -
    @Test
    public void hasBalancedBrackets_emptyString_ShouldReturnTrue() {
        // Assert
        var string = "";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertTrue(expected);
    }
//    5 - []
    @Test
    public void hasBalancedBrackets_openCloseBracket_ShouldReturnTrue() {
        // Assert
        var string = "[]";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertTrue(expected);
    }
//    6 - [[
    @Test
    public void hasBalancedBrackets_doubleOpenBrackets_ShouldReturnFalse() {
        // Assert
        var string = "[[";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertFalse(expected);
    }
//    7 - ]]
    @Test
    public void hasBalancedBrackets_doubleClosingBracket_ShouldReturnFalse() {
        // Assert
        var string = "]]";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertFalse(expected);
    }
//    8 - [[]]
    @Test
    public void hasBalancedBrackets_nestedBrackets_ShouldReturnTrue() {
        // Assert
        var string = "[[]]";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertTrue(expected);
    }
//    9  - [][]
    @Test
    public void hasBalancedBrackets_sequentialBrackets_ShouldReturnTrue() {
        // Assert
        var string = "[][]";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertTrue(expected);
    }
//    10 - ][
    @Test
    public void hasBalancedBrackets_closeOpenBracket_ShouldReturnFalse() {
        // Assert
        var string = "][";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertFalse(expected);
    }
//    11 - [LaunchCode
    @Test
    public void hasBalancedBrackets_missingCloseBracket_ShouldReturnFalse() {
        // Assert
        var string = "[LaunchCode";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertFalse(expected);
    }
//    12 - Launch]Code[
    @Test
    public void hasBalancedBrackets_closeOpenBracket2_ShouldReturnFalse() {
        // Assert
        var string = "Launch]Code[";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertFalse(expected);
    }
//    13 - [
    @Test
    public void hasBalancedBrackets_openingBracket_ShouldReturnFalse() {
        // Assert
        var string = "[";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertFalse(expected);
    }
//    14 - ]
    @Test
    public void hasBalancedBrackets_closingBracket_ShouldReturnFalse() {
        // Assert
        var string = "]";

        // Act
        var expected = hasBalancedBrackets(string);

        // Assert
        assertFalse(expected);
    }
//    15 - pass in null
    @Test(expected = NullPointerException.class)
    public void hasBalancedBrackets_returnNull_ShouldReturnFalse() {
        // Assert

        // Act
        var expected = hasBalancedBrackets(null);

        // Assert
        assertFalse(expected);
    }

}

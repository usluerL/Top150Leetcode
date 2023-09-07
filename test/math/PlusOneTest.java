package math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @DisplayName("LC 66, Plus One")
    @Test
    void plusOne() {
        PlusOne p1 = new PlusOne();
        int [] arr = {1,2,3,9};
        int[] ints = p1.plusOne(arr);
        int [] res = {1,2,4,0};

        assertArrayEquals(res,ints);
    }
}
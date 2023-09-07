package september_repractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateFromSortedTest {

    @Test
    void removeDuplicates() {

        RemoveDuplicateFromSorted pr = new RemoveDuplicateFromSorted();
        int [] arr = {2,2,2,3,3,3,4,5,5,6};
        int i = pr.removeDuplicates(arr);
        int res = 5;
        assertEquals(5,i);
    }
}
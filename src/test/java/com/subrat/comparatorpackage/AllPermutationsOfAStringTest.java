package com.subrat.comparatorpackage;

import java.util.HashSet;

@Test
public class AllPermutationsOfAStringTest {

    private AllPermutationsOfAString target = null;

    @Test
    public void findPermutations() {

        target = new AllPermutationsOfAString();
        HashSet<String> permutations = new HashSet<>();
        permutations = target.findPermutations("abc");
        Assert.assertNotNull(permutations);
        Assert.assertTrue(permutations.size() > 1);

    }
}

package org.example;

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        int h_index = 0;
        Arrays.sort(citations);
        for (int i = citations.length - 1; i >= 0; i--){
            if(citations[i] >=  citations.length - i){
                h_index = citations.length - i;
            }
        }
        return h_index;
    }
}

package com.web.service.impl;

import com.web.service.WebServie;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class WebServiceImpl implements WebServie {
    @Override
    public String checkAnagram(String s1, String s2) {
        String result = "";
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        if (arr1.length == arr2.length) {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                result = "Given Strings are Anagram";
            } else {
                result = "Given Strings are Not Anagram";
            }
        } else {
            result = "Length of the two strings are not equal!! so it won't be considered as Anagram";
        }
        return result;
    }
}

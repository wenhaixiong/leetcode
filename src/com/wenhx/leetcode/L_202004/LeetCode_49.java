package com.wenhx.leetcode.L_202004;

import java.util.*;

/**
 * 49.字母异位词分组
 *
 * @author wenhx
 * @link https://leetcode-cn.com/problems/group-anagrams/
 * @state 待完善...
 * @since 2020/4/19
 */
public class LeetCode_49 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultLst = new ArrayList<>();
        List<String> list = Arrays.asList(strs);
        list.forEach(str -> {
            char[] chars = str.toCharArray();
            Set<Character> charSet = null;
            for (char aChar : chars) {
                charSet = new HashSet<>();
                charSet.add(aChar);
            }
            Map<Set<Character>, List<String>> hashMap = new HashMap<>();
            List<String> optionList = new ArrayList<>();
            optionList.add(str);
            hashMap.put(charSet, optionList);

        });


        return resultLst;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);
        System.out.println(Arrays.toString(lists.toArray()));

    }
}

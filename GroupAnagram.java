#From an array, need to filterout all the strings that are anagrams

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagram 
{
    public static void main(String[] args) 
    {
        String array[] = {"eat", "god", "tea", "dog", "ate"};
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < array.length; i++) 
        {
            char[] ch = array[i].toCharArray();
            Arrays.parallelSort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted))
            {
                map.put(sorted, new LinkedList<String>());
            }
            map.get(sorted).add(array[i]);
        }
        System.out.println(map);
    }
}
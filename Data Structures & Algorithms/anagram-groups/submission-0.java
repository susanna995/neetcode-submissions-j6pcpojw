class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,String> mp=new HashMap<>();
        for(String s:strs)
        {
            // mp.put(s,Arrays.sort(s.toCharArray()).toString());
              char[] arr = s.toCharArray();
    Arrays.sort(arr);

    mp.put(s, new String(arr));
        }
        List<List<String>> result=new ArrayList<>();
        Set<String> seen=new HashSet<>();
        for(int i=0;i<strs.length;i++)
        {
            List<String> al=new ArrayList<>();
            if(seen.contains(strs[i])) continue;
            else{ al.add(strs[i]);
            seen.add(strs[i]);
            };
            for(int j=i+1;j<strs.length;j++)
            {
                if(mp.get(strs[i]).equals(mp.get(strs[j])))
                {
                    al.add(strs[j]);
                    seen.add(strs[j]);
                }
            }
            result.add(al);
        }
        return result;
    }
}

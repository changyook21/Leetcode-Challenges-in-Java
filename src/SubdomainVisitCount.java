public class SubdomainVisitCount {
    /*
    Example 1:
    Input:
    ["9001 discuss.leetcode.com"]
    Output:
    ["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
    Explanation:
    We only have one website domain: "discuss.leetcode.com". As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.
    */
    public List<String> subdomainVisits(String[] cpdomains) {

        HashMap<String, Integer> map = new HashMap<>();
        List<String> answer = new ArrayList<>();
        String[] divide;

        for (int i = 0; i < cpdomains.length; i++) {
            divide = cpdomains[i].split(" ");
            String current;
            for (int j = divide[1].length() - 1; j >= 0; j--) {
                if (divide[1].charAt(j) == '.' || j == 0) {
                    if (j == 0) {
                        current = divide[1].substring(j, divide[1].length());
                    }
                    else {
                        current = divide[1].substring(j+1, divide[1].length());
                    }

                    if (map.containsKey(current)) {
                        map.put(current, map.get(current) + Integer.valueOf(divide[0]));
                    }
                    else {
                        map.put(current, Integer.valueOf(divide[0]));
                    }

                }
            }
        }

        for (String cur : map.keySet()) {
            StringBuilder builder = new StringBuilder();
            builder.append(map.get(cur));
            builder.append(" ");
            builder.append(cur);
            answer.add(builder.toString());
        }
        return answer;
    }
}


class Solution {
    public String reverseString(String s) {
        char [] c = s.toCharArray();

        for (int i = c.length -1, j =0; j <= i ;i--, j++) {

            char tmp = c[j];
            c[j]= c[i];
            c[i] = tmp;
        }

        return new String(c);
    }

    public static void main (String[] args) {
        Solution l = new Solution ();

        String d = "laodi";
        System.out.println(l.reverseString(d));
    }
}


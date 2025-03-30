import java.util.Arrays;

class Solution {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        Arrays.sort(Student);
        Arrays.sort(Cookie);

        int j = 0;
        int result = 0;

        for (int i=0; i<Cookie.length; i++) {
            if (j < Student.length && Cookie[i] >= Student[j]) {
                result++;
                j++;
            }
        }

        return result;
    }
}

public class AssignCookies {
    
}

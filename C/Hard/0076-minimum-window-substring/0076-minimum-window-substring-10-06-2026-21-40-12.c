char* minWindow(char* s, char* t) {

    int need[128] = {0};

    for(int i = 0; t[i] != '\0'; i++)
        need[(unsigned char)t[i]]++;

    int count = strlen(t);

    int left = 0;
    int start = 0;
    int minLen = 1000000;

    for(int right = 0; s[right] != '\0'; right++) {

        if(need[(unsigned char)s[right]] > 0)
            count--;

        need[(unsigned char)s[right]]--;

        while(count == 0) {

            int len = right - left + 1;

            if(len < minLen) {
                minLen = len;
                start = left;
            }

            need[(unsigned char)s[left]]++;

            if(need[(unsigned char)s[left]] > 0)
                count++;

            left++;
        }
    }

    if(minLen == 1000000)
        return "";

    char* ans = malloc((minLen + 1) * sizeof(char));

    strncpy(ans, s + start, minLen);
    ans[minLen] = '\0';

    return ans;
}
int isVowel(char c);  // ← forward declaration

char* reverseVowels(char* s) {
    int l = 0, r = strlen(s) - 1;

    while (l < r) {
        while (l < r && !isVowel(s[l])) l++;
        while (l < r && !isVowel(s[r])) r--;

        if (l < r) {
            char temp = s[l];
            s[l++] = s[r];
            s[r--] = temp;
        }
    }
    return s;
}

int isVowel(char c) {
    return strchr("aeiouAEIOU", c) != NULL;
}
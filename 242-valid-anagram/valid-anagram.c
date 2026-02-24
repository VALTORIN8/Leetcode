bool isAnagram(char* s, char* t) {
    int freq1[26] = {0}, freq2[26] = {0};

    if (strlen(s) != strlen(t)) {
        return false;
    }
    for (int i = 0; s[i] != '\0'; i++) {
        freq1[s[i] - 'a']++;
        freq2[t[i] - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
        if (freq1[i] != freq2[i]) {
            return false;
        }
    }
    return true;
}
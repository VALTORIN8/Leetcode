bool isValid(char* s) {
    int n = strlen(s);
    char stack[n];      
    int top = -1;       

    for(int i = 0; s[i] != '\0'; i++) {
        char ch = s[i];

        if(ch == '(' || ch == '{' || ch == '[') {
            stack[++top] = ch;
        }
        else {
            if(top == -1) return false;

            char top_ch = stack[top--];  
            if((ch == ')' && top_ch != '(') ||
               (ch == '}' && top_ch != '{') ||
               (ch == ']' && top_ch != '[')) {
                return false;  
            }
        }
    }

    return top == -1;
}
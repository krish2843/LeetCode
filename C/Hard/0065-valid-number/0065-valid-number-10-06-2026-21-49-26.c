bool isNumber(char* s) {

    int i = 0;

    while (s[i] == ' ')
        i++;

    bool digit = false;
    bool dot = false;
    bool exponent = false;
    bool exponentDigit = false;

    for (; s[i] != '\0'; i++) {

        if (s[i] >= '0' && s[i] <= '9') {

            digit = true;

            if (exponent)
                exponentDigit = true;
        }

        else if (s[i] == '.') {

            if (dot || exponent)
                return false;

            dot = true;
        }

        else if (s[i] == 'e' || s[i] == 'E') {

            if (exponent || !digit)
                return false;

            exponent = true;
            exponentDigit = false;
        }

        else if (s[i] == '+' || s[i] == '-') {

            if (i > 0 &&
                s[i - 1] != 'e' &&
                s[i - 1] != 'E')
                return false;
        }

        else if (s[i] == ' ') {

            while (s[i] == ' ')
                i++;

            return s[i] == '\0' &&
                   digit &&
                   (!exponent || exponentDigit);
        }

        else {
            return false;
        }
    }

    return digit && (!exponent || exponentDigit);
}
#include <stdio.h>
#include <ctype.h>  // For tolower() and isalpha()

int main() {
    char str[100];
    int i, vowels = 0, consonants = 0;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);  // Reads input including spaces

    for(i = 0; str[i] != '\0'; i++) {
        char ch = tolower(str[i]);  // Convert to lowercase to simplify checking

        if (isalpha(ch)) {  // Check if the character is an alphabet
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else
                consonants++;
        }
    }

    printf("Number of vowels: %d\n", vowels);
    printf("Number of consonants: %d\n", consonants);

    return 0;
}

#include <stdio.h>
#include <ctype.h>
int main()
{
	const char keyboard[]="`1234567890-=qwertyuiop[]\\asdfghjkl;\'zxcvbnm,./";
    char words[20000];
    fgets(words,20000,stdin);
    for(int i=0;words[i];i++) {
        for(int j=0; keyboard[j]; j++) {
            if(tolower(words[i]) == keyboard[j]) {
			//	printf("%c", keyboard[j-2]);
				words[i]=keyboard[j-2];
				break;
            } else if(words[i] == ' ') {
			//	printf(" ");
				break;
            }
		}
	}
	for(int i = 0;words[i]!='\n';i++)
		printf("%c",words[i]);
    printf("\n");
    return 0;
}
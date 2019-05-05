#include <stdio.h>
#include <stdlib.h>
int main(void) {
	int n,i,max=0;
	char an[26]={0};

	scanf("%d", &n);
	for (int count=0; count <= n;) {
		int index;
		char temp;

		temp = getchar(); 

		if (temp == '\n') {
			count++;
		}
		else {
			if(temp <= 'z'&&temp >= 'a')
				index=temp - 'a';
			else if(temp <= 'Z'&&temp >= 'A')
				index=temp - 'A';
			else
				continue;

			an[index] += 1;

			if (an[index] > max)	max = an[index];
		}
	}
	for (int index = max; index > 0; index--)
		for (i = 0; i < 26; i++) {
			if (an[i] == index)
				printf("%c %d\n", ('A' + i), an[i]);
		}
	return 0;
}
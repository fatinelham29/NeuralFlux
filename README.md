//A code for word capitaligetion
#include<stdio.h>
int main()
{
    char wo[1000];
    scanf("%s",&wo);
if(wo[0]>= 'a'&&wo[0]<='z')
    wo[0] = wo[0] - 'a' + 'A';
    printf("%s",wo);
}

#include<stdlib.h>
#include<stdio.h>
#include<pthread.h>
int counter=0;
int flag[2];
int turn;
void *func1(void *message)
{
while(1)
{
flag[0]=1;
turn=1;
while(flag[1]&&turn==1);
printf("%s %d\n",(char *)message,counter);
counter++;
flag[0]=0;
if(counter==5)
{
printf("func1,  %d\n",counter);
counter=1;
exit(0);
}
}
return 0;
}
void *func2(void *message)
{
while(1)
{
flag[1]=1;
turn=0;
while(flag[0]&&turn==0);
printf("%s %d\n",(char *)message,counter);
counter++;
flag[1]=0;
if(counter==5)
{
printf("func2,  %d\n",counter);
counter=1;
exit(0);
}
}
return 0;
}
int main(int argc,char *argv[])
{
pthread_t thread1;
pthread_t thread2;
flag[0]=0;
flag[1]=0;
pthread_create(&thread1,NULL,&func1,"first");
pthread_create(&thread2,NULL,&func2,"seconed");
pthread_join(thread1,NULL);
pthread_join(thread2,NULL);
return 0;
}


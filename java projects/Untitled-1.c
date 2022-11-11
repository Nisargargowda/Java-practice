#include<stdlib.h>
int count=0;
struct node
{
int data;
struct node *link;
};
typedef struct node NODE;
NODE* HEAD;
void create_ll(int item)
{
NODE *newnode,*temp;
newnode=(NODE*)malloc(sizeof(NODE));
count++;
newnode->data=item;
newnode->link=NULL;
if(HEAD==NULL)
HEAD=newnode;
else
{
temp=HEAD;
while(temp->link!=NULL)
temp=temp->link;
temp->link=newnode;
}
}
void display(NODE *temp)
{
printf("-------------------------- \n");
printf(" The elements of list are:\n");
while(temp!=NULL)
{
printf("\t%d\n",temp->data);
temp=temp->link;
}
printf("-------------------------- \n");
}
void insert_pos(int item,int pos)
{
struct node *newnode,*temp;
int i;
newnode=(struct node *)malloc(sizeof(struct node));
count++;
newnode->data=item;
if(pos>count)
printf("Out of range\n");
else if(pos==1)
{
newnode->link=HEAD;
HEAD=newnode;
}
else
{
temp=HEAD;
for(i=1;i<pos-1 && temp!=NULL;i++)
temp=temp->link;
newnode->link=temp->link;
temp->link=newnode;
}
}
void main()
{
int item,choice,pos;
char ch;
clrscr();
HEAD=NULL;
do
{
printf("Enter the element:\t");
scanf("%d",&item);
create_ll(item);
printf("Do u want another node y/n:\t");
flushall();
scanf("%c",&ch);
}while(toupper(ch)=='Y');
display(HEAD);
printf("Enter the item to be inserted and position:\t");
scanf("%d%d",&item,&pos)
insert_pos(item,pos);
break;
display(HEAD);
getch();
}
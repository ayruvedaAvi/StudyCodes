/*
   Dynamic bhako karan le last node bhanne nai chhaina.
   We dont have a fixed size list.
*/
#include<iostream>
#include <stdlib.h>
using namespace std;
struct Node{
    struct Node * prev;
    int data;
    struct Node * next;
};
class DoublyLinkedList{
    public:
    Node *first;
    DoublyLinkedList(){
        first=nullptr;
    }
    int nNode;
    void insertFirst(int data){
        Node *temp=new Node();
        if((first->next)==nullptr){
            temp->next=nullptr;
            temp->prev=nullptr;
            temp->data=data;
            first=temp;
            nNode+=1;
        }
        else{
            temp->next=first;
            first=temp;
            nNode+=1;
        }
        //free (temp);
    }
    void insertN(int data,int choice){
        if(choice>nNode+1||choice<=0){
            cout<<"Enter valid node!\n There are "<<nNode<<" number of nodes."<<endl;
        }
        else{
            Node *temp=new Node();
            Node *temp2=new Node();
            temp2=first;
            int n= choice;
            while(n>2){
                temp2=temp2->next;
                n--;
            }
            temp2->next=temp;
            temp->next=temp2->next->next;
            temp->data=data;
            temp->prev=temp2;
            nNode+=1;
            free(temp2);
            free(temp);
        }
    }
    void deleteFirst(){
        Node *temp=new Node();
        temp=first;
        first=temp->next;
        //free(temp);
    }
    void deleteN(int choice){
        Node *temp=new Node();
        Node *temp2=new Node();
        temp2=first;
        int n=choice;
        while(n>2){
            temp2=temp2->next;
            n--;
        }
        temp=temp2->next;
        temp->prev=temp2;
        temp->next=temp2->next->next;
    }
    void displayNodes(){
        int i;
        Node *temp=new Node();
        for(i=0;i<nNode+1;i++){
            cout<<"Node no: "<<i<<" contains: "<<temp->data<<endl;
            temp=temp->next;
        }
    }
};
int main(){
    DoublyLinkedList dl;
    int choice=0,data=0;
    int loop = 0;
    while(loop!=1){
        cout<<("*********CHOICES*********\n1) Insert\n 2) Delete\n 3) Display\n 4)Exit ")<<endl;
        cout<<("Enter your choice: ")<<endl;
        cin>>choice;
        switch(choice){
            case 1:
                cout<<"Enter the position of node you want to insert: "<<endl;
                cin>>choice;
                cout<<"Enter the data: "<<endl;
                cin>>data;
                if(choice==1){
                    dl.insertFirst(data);
                }
                else{
                    dl.insertN(data,choice);
                }
            break;
            case 2:
                cout<<"Enter the node you want to delete: "<<endl;
                cin>>choice;
                if(choice==1){
                    dl.deleteFirst();
                }
                else{
                    dl.deleteN(choice);
                }
            break;
            case 3:
                dl.displayNodes();
            break;
            case 4:
                loop=1;
            break;
            default:
                cout<<"Enter a valid choice! "<<endl;
        }
    }
}
// write a program to find largest number of given array by user  

#include<stdio.h>
int main(){
    int arr[5];
    printf("Enter 5 numbers: ");
    for(int i=0;i<5;i++){
        scanf("%d",&arr[i]);
    }
    int max=arr[0];
    for(int i=1;i<5;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    printf("Largest number is : %d",max);
    return 0;
}
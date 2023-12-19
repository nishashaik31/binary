package com.abc.binary;
public class BS{
public static void main(string[] arg){
Array a=new Array[5];
a.add(5);
  a.add(6);
  a.add(7);
int first=0;
int last=a.length-1;
int mid=(first+last)/2;
int key=5;
int a[]=Sort.sorting(a);
while(first<=last){
if(a[mid]<key){
first=mid+1;
}
else if(a[mid]==key){
print("element found at index"+mid);
}
else{
last=mid-1;
}
}
if(first>last){
print("element not founded");
}
}
}

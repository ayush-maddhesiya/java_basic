#include<bits/stdc++.h>
using namespace std;

int u(int* arr, int ans,int n){
    bool flag = true;
    for (int i = 0; i < n-1; i++)
    {
        for (int j = i+1; j < n; j++)
        {
            if(arr[i] == arr[j]){
                arr[i] = arr[j] = -1;
            }
        }
        
    }
    for (int i = 0; i < n; i++)
    {
        if(arr[i] != -1){
            ans = arr[i];
        }
    }
    return ans;
}
int main()
{
    int arr[] = {2,3,1,1,2,3,4};
    int n = 7;
    cout<<u(arr,0,n);
    return 0;
}
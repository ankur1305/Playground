#include <iostream>
#include <iomanip>
using namespace std;

int main(void){
	int count=0;
	float score=0;
	while(1){
		
		if(count == 3) break;
		else{
			int n; cin>>n;
			if(n%2 != 0){
				count++;
				score++;
			}else if(n<0){
				score -= 1;
				break;
			}else{
				score -= 0.5;
			}
		}
	}
	cout << fixed << setprecision(1) << score;
	
	return 0;
}

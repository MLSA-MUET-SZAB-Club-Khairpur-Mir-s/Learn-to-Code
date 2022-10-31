#include<iostream>
using namespace std;
struct person{
	string accountdetails, withdraw, transfer, back, name, changedetails;
	int pin;
}per1,per2,per3;

int main(){
	int num, accountpin, a, b, balance1= 40000, balance2= 50000, balance3= 60000;
	int accnum, accnum1= 1234567890, accnum2= 1234567891, accnum3= 1234567892;
	char alpha, back;
	string name, name1="Muzamil", name2="Haseeb", name3="Umar";
	cout<<"\t     --------------------"<<endl;
	cout<<"\t\tBanking System"<<endl;
	cout<<"\t     --------------------"<<endl;
	start1:
	per1.name= "1.Muzamil";
	per2.name= "2.Haseeb";
	per3.name= "3.Umar";
	cout<<per1.name<<endl;
	cout<<per2.name<<endl;
	cout<<per3.name<<endl;
	cout<<"Please select your account from 1 to 3."<<endl;
	per1.accountdetails = per2.accountdetails = per3.accountdetails = "a.Account Details";
	per1.withdraw = per2.withdraw = per3.withdraw = "b.Withdraw";
	per1.transfer = per2.transfer = per3.transfer = "c.Transfer";
	per1.changedetails = per2.changedetails = per3.changedetails = "d.Change Details";
	per1.back = per2.back = per3.back = "e.Back";
	per1.pin = 1234;
	per2.pin = 2000;
	per3.pin = 2002;
	
	cin>>num;
	if(num==1){
		cout<<"Welcome "<<name1<<endl;
		cout<<"Please enter your pin."<<endl;
		cin>>num;
		if(num==per1.pin){
		label1:
		cout<<per1.accountdetails<<endl;
		cout<<per1.withdraw<<endl;
		cout<<per1.transfer<<endl;
		cout<<per1.changedetails<<endl;
		cout<<per1.back<<endl;
		cout<<"Please select the option from a to e."<<endl;
		cin>>alpha;
		switch(alpha){
			//for Account details.....
			case'a':
				cout<<"Your account type is Current."<<endl;
				cout<<"Your present amount in account is : "<<balance1<<endl;
				cout<<"Your Account Number is : "<<accnum1<<endl;
				cout<<"Press e for go back"<<endl;
				cin>>back;
				if(back=='e'){
					goto label1;
				}
				break;
			case 'b':
			    //for withdraw......
				cout<<"Please enter the amount you want to withdraw. limit is from(500 to 25000)"<<endl;
				cin>>b;
				if(b>=500 && b<=25000){
					cout<<"Withdraw successful"<<endl;
					cout<<"Thank you for your withdrw."<<endl;
					balance1=balance1-b;
				}
				else{
					cout<<"You have entered invalid limit."<<endl;
				}
				cout<<"Press e for go back."<<endl;
				cin>>back;
				if(back=='e'){
					goto label1;
				}
				break;
			case 'c':
			    //transfer.........	cout<<"enter your total amount"<<endl;
			cout<<"Your current amount present in your account is: "<<balance1<<endl;
			cout<<"Please enter the amount that you want to transfer.Limit from 500 to 25000."<<endl;
			cin>>b;
			if(b>=500 && b<=25000){
			cout<<"In which account you want to transfer the amount. Please enter the account number."<<endl;
			cin>>accnum;
			if(accnum==accnum2 || accnum==accnum3){
				cout<<"Your amount has been tranfered."<<endl;
				cout<<"Thank you for your transfer."<<endl;
				if(accnum==accnum2){
					balance2=balance2+b;
				}
				else{
					balance3=balance3+b;
				}
			}
			else{
				cout<<"Invalid Account number."<<endl;
			}
		}
		else{
			cout<<"Invalid Limit"<<endl;
		}
				cout<<"Press e for go back"<<endl;
				cin>>back;
			if('e'==back){
				goto start1;
			}
			break;
			case 'd':
				//for Change Details.....
				cout<<"Your Current name is "<<name1<<endl;
			    cout<<"Please enter your new name. "<<endl;
			    cin>>name2;
			    cout<<"Your new name is "<<name<<endl;
			    name1=name;
			    cout<<"Change your pin"<<endl;
			    cout<<"Enter your current pin."<<endl;
			    cin>>b;
			    if(b==1234){
			    	cout<<"Enter your new pin"<<endl;
			    	cin>>a;
			    	cout<<"Re-enter your new pin"<<endl;
			    	cin>>a;
			    	cout<<"Your new pin is : "<<a<<endl;
			    	b=a;
			    	 cout<<"Press e for go back. "<<endl;
			    cin>>back;
			    if(back=='e'){
			    	goto start1; 
		    }
	        }
	        break;
	        case 'e':
	        	goto start1;
	        break;
	        default:
	        	cout<<"Invalid option.";
		}
	}
		else{
			cout<<"Wrong Pin";
			cout<<"\a";
		}
    }
    if(num==2){
    	cout<<"Welcome "<<name2<<endl;
    	cout<<"Please your account pin."<<endl;
    		cin>>num;
		if(num==per2.pin){
		label2:
		cout<<per2.accountdetails<<endl;
		cout<<per2.withdraw<<endl;
		cout<<per2.transfer<<endl;
		cout<<per2.changedetails<<endl;
		cout<<per2.back<<endl;
		cout<<"Please select the option from a to e."<<endl;
		cin>>alpha;
		switch(alpha){
			//for Account details.....
			case'a':
				cout<<"Your account type is Current."<<endl;
				cout<<"Your present amount in account is : "<<balance2<<endl;
				cout<<"Your Account Number is : "<<accnum2<<endl;
				cout<<"Press e for go back"<<endl;
				cin>>back;
				if(back=='e'){
					goto label2;
				}
				break;
			case 'b':
			    //for withdraw......
				cout<<"Please enter the amount you want to withdraw. limit is from(500 to 25000)"<<endl;
				cin>>b;
				if(b>=500 && b<=25000){
					cout<<"Withdraw successful."<<endl;
					cout<<"Thank you for your withdrw."<<endl;
					balance2=balance2-b;
				}
				else{
					cout<<"You have entered invalid limit."<<endl;
				}
				cout<<"Press e for go back."<<endl;
				cin>>back;
				if(back=='e'){
					goto label2;
				}
				break;
			case 'c':
			    //transfer.........	
			cout<<"Your current amount present in your account is: "<<balance1<<endl;
			cout<<"Please enter the amount that you want to transfer.Limit from 500 to 25000."<<endl;
			cin>>b;
			if(b>=500 && b<=25000){
			cout<<"In which account you want to transfer the amount. Please enter the account number."<<endl;
			cin>>accnum;
			if(accnum==accnum1 || accnum==accnum3){
				cout<<"Your amount has been tranfered."<<endl;
				cout<<"Thank you for your transfer."<<endl;
				if(accnum==accnum1){
					balance1=balance1+b;
				}
				else{
					balance3=balance3+b;
				}
			}
			else{
				cout<<"Invalid Account number."<<endl;
			}
		}
		else{
			cout<<"Invalid Limit"<<endl;
		}
				cout<<"Press e for go back"<<endl;
				cin>>back;
			if('e'==back){
				goto start1;
			}
			break;
			case 'd':
				// Change Details.....
				cout<<"Your Current name is "<<name2<<endl;
			    cout<<"Please enter your new name. "<<endl;
			    cin>>name;
			    cout<<"Your new name is "<<name<<endl;
			    name2=name;
			    cout<<"Change your pin"<<endl;
			    cout<<"Enter your current pin."<<endl;
			    cin>>b;
			    if(b==2000){
			    	cout<<"Enter your new pin"<<endl;
			    	cin>>a;
			    	cout<<"Re-enter your new pin"<<endl;
			    	cin>>a;
			    	cout<<"Your new pin is : "<<a<<endl;
			    	b=a;
			    	 cout<<"Press e for go back. "<<endl;
			    cin>>back;
			    if(back=='e'){
			    	goto start1; 
		    }
	        }
	        break;
	        case 'e':
	        // Back.......
	        	goto start1;
	        break;
	        default:
	        	cout<<"Invalid option.";
		}	
	}
		else{
			cout<<"Wrong Pin";
			cout<<"\a";
		}
    }
	if(num==3){
		cout<<"Welcome "<<name3<<endl;
		cout<<"Please enter your account pin."<<endl;
			cin>>num;
		if(num==per3.pin){
		label3:
		cout<<per3.accountdetails<<endl;
		cout<<per3.withdraw<<endl;
		cout<<per3.transfer<<endl;
		cout<<per3.changedetails<<endl;
		cout<<per3.back<<endl;
		cout<<"Please select the option from a to e."<<endl;
		cin>>alpha;
		switch(alpha){
			//for Account details.....
			case'a':
				cout<<"Your account type is Current."<<endl;
				cout<<"Your present amount in account is : "<<balance3<<endl;
				cout<<"Your Account Number is : "<<accnum3<<endl;
				cout<<"Press e for go back"<<endl;
				cin>>back;
				if(back=='e'){
					goto label3;
				}
				break;
			case 'b':
			    //for withdraw......
				cout<<"Please enter the amount you want to withdraw. limit is from(500 to 25000)"<<endl;
				cin>>b;
				if(b>=500 && b<=25000){
					cout<<"Withdraw successful"<<endl;
					cout<<"Thank you for your withdrw."<<endl;
					balance3=balance3-b;
				}
				else{
					cout<<"You have entered invalid limit."<<endl;
				}
				cout<<"Press e for go back."<<endl;
				cin>>back;
				if(back=='e'){
					goto label3;
				}
				break;
			case 'c':
			    //transfer.........	
			cout<<"Your current amount present in your account is: "<<balance3<<endl;
			cout<<"Please enter the amount that you want to transfer."<<endl;
			cin>>b;
			if(b>=500 && b<=25000){
			cout<<"In which account you want to transfer the amount. Please enter the account number."<<endl;
			cin>>accnum;
			if(accnum==accnum2 || accnum==accnum1){
				cout<<"Your amount has been tranfered."<<endl;
				cout<<"Thank you for your transfer."<<endl;
				if(accnum==accnum2){
					balance2=balance2+b;
				}
				else{
					balance1=balance1+b;
				}
			}
			else{
				cout<<"Invalid Account number."<<endl;
			}
		}
		else{
			cout<<"Invalid Limit."<<endl;
		}
			cout<<"Press e for go back"<<endl;
			cin>>back;
			if('e'==back){
				goto start1;
			}
			break;
			case 'd':
				// Change Details.....
				cout<<"Your Current name is "<<name3<<endl;
			    cout<<"Please enter your new name. "<<endl;
			    cin>>name;
			    cout<<"Your new name is "<<name<<endl;
			    name3=name;
			    cout<<"Change your pin"<<endl;
			    cout<<"Enter your current pin."<<endl;
			    cin>>b;
			    if(b==2002){
			    	cout<<"Enter your new pin"<<endl;
			    	cin>>a;
			    	cout<<"Re-enter your new pin"<<endl;
			    	cin>>a;
			    	cout<<"Your new pin is : "<<a<<endl;
			    	b=a;
			    	 cout<<"Press e for go back. "<<endl;
			    cin>>back;
			    if(back=='e'){
			    	goto start1; 
		    }
	        }
	        break;
	        case 'e':
	        	// back......
	        	goto start1;
	        break;
	        default:
	        	cout<<"Invalid option.";
		}	
	}
		else{
			cout<<"Wrong Pin";
			cout<<"\a";
 
		}
    }
	}

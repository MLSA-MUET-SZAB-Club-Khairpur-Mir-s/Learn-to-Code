#include <iostream>
using namespace std;
int main ()
{
	char option, offer,offer2;
	int x,i;
	cout<<"Enter Helpline number of Telenor SIM!"<<endl;
	cin>>i;
	if (i==345)
	{
	Sanjai:
	cout << "For chenge Language!"<<endl;
	cout << "1 - English!"<<endl;
	cout << "2 - Urdu!"<<endl;
	cin>>x;
	if (x==1)
	{
		Manu:
		cout << "Chose any one option from below given options! "<<endl;
		cout << " 1 - All in one offers: "   <<endl;
		cout << " 2 - Your offers: "         <<endl;
		cout << " 3 - Voice and SMS offers: "<<endl;
		cout << " 4 - SMS offers: "          <<endl;
		cout << " 5 - Internate offers: "    <<endl;
		cout << " 6 - Value Services: "      <<endl;
		cout << " 7 - Package Change: "      <<endl;
		cout << " 8 - 4G SIM Check: "        <<endl;
		cout << " # - Back: "                <<endl;
		cin>>option;
		if (option=='1')
		{
			cout << "Chose any one Offer from below given offers! "<<endl;
			cout << "1 - 500 MBs and 100 min for 3-days @ Rs 50" <<endl;
			cout << "2 - 1500 MBs and 150 min for 7-days @ Rs 100" <<endl;
			cout << "3 - 3000 MBs, 150 min and 150 onnet min for 7-days @ Rs 160" <<endl;
			cout << "# - main manu: "                <<endl;
			cin >> offer;
			if (offer=='1')
			{
				cout << "You have activated All in one offer and received  500 MBs and 100 min for 3-days in Rs 50"<<endl;
				cout << "50 Rupees have been deducted from your account, offer will be Expire in 3-days "<<endl;
			}
			else if (offer=='2')
			{
				cout << "You have activated All in one offer and received  1500 MBs and 150 min for 7-days in Rs 100"<<endl;
				cout << "100 Rupees have been deducted from your account, offer will be Expire in 7-days "<<endl;
			}
			else if (offer=='3')
			{
				cout << "You have activated All in one offer and received  3000 MBs, 150 min and 150 onnet min for 7-days in Rs 160"<<endl;
				cout << "160 Rupees have been deducted from your account, offer will be Expire in 7-days "<<endl;
			}
			else if (offer=='#')
			{
				goto Manu;
			}
		}
		else if (option=='2')
		{
			cout << "Chose any one Offer from below given offers! "<<endl;
			cout << "1 - Spacil offers" <<endl;
			cout << "2 - limied time offers" <<endl;
			cout << "# - main manu: "                <<endl;
			cin >> offer;
			if (offer=='1')	
			{
			cout << "Chose any one Offer from below given Spacil offers! "<<endl;
			cout << "1 - umlimited onnet minutes for 1-day @ Rs 13" <<endl;
			cout << "2 - 1200 SMS and 100 MBs (WhatsApp) for 7-days @ Rs 10" <<endl;
			cout << "3 - 50 onnet min for 1-days @ Rs 10" <<endl;
			cout << "# - main manu: "                <<endl;
			cin >> offer2;
			if (offer2=='1')
			{
				cout << "You have activated Spacil offer and received umlimited onnet minutes for 1-day in Rs 13"<<endl;
				cout << "13 Rupees have been deducted from your account, offer will be Expire in 1-days "<<endl;
			}
			else if (offer2=='2')
			{
				cout << "You have activated Spacil offer and received 1200 SMS and 100 MBs (WhatsApp) for 7-days in Rs 10"<<endl;
				cout << "10 Rupees have been deducted from your account, offer will be Expire in 7-days "<<endl;
			}
			else if (offer2=='3')
			{
				cout << "You have activated Spacil offer and received 50 onnet min for 1-days in Rs 10"<<endl;
				cout << "10 Rupees have been deducted from your account, offer will be Expire in 1-days "<<endl;
			}
			else if (offer2=='#')
			{
				goto Manu;
			}
			}
			else if (offer=='2')
			{
				cout << "Chose any one Offer from below given Limited offers! "<<endl;
				cout << "1 - 100 SMS with 10 MB (free WhatsApp) for 7-days @ Rs 10 "<<endl;
				cout << "2 - 1000 SMS with 100 MB (free WhatsApp) for 7-days @ Rs 40 "<<endl;
				cout << "3 - 300 Local SMS for 1-days @ Rs 2"<<endl;
				cout << "4 - 3500 Local SMS for 50-days @ Rs 35"<<endl;
				cout << "5 - 1200 Local SMS with 100 MB (free WhatsApp) for 30-days @ Rs 18"<<endl;
				cout << "# - main manu: "                <<endl;
				cin >> offer2;
			if (offer2=='1')
			{
				cout << "You have activated Limited offer and received 100 SMS with 10 MB (free WhatsApp) for 7-days in Rs 10"<<endl;
				cout << "10 Rupees have been deducted from your account, offer will be Expire in 7-days "<<endl;
			}
			else if (offer2=='2')
			{
				cout << "You have activated Limited offer and received 1000 SMS with 100 MB (free WhatsApp) for 7-days in Rs 40"<<endl;
				cout << "40 Rupees have been deducted from your account, offer will be Expire in 7-days "<<endl;
			}
			else if (offer2=='3')
			{
				cout << "You have activated Limited offer and received 300 Local SMS for 1-days in Rs 2"<<endl;
				cout << "2 Rupees have been deducted from your account, offer will be Expire in 1-days "<<endl;
			}
			else if (offer2=='4')
			{
				cout << "You have activated Limited offer and received 3500 Local SMS for 50-days in Rs 35"<<endl;
				cout << "35 Rupees have been deducted from your account, offer will be Expire in 50-days "<<endl;
			}
			else if (offer2=='5')
			{
				cout << "You have activated Limited offer and received 1200 Local SMS with 100 MB (free WhatsApp) for 30-days in Rs 18"<<endl;
				cout << "18 Rupees have been deducted from your account, offer will be Expire in 30-days "<<endl;
			}
			else if (offer2=='#')
			{
				goto Manu;
			}
			}
		}
		else if (option=='3')
		{
			cout << "Chose any one Offer from below given offers! "<<endl;
			cout << "1 - 50 onnet minutes and 100 MBs for 1-days @ Rs 10" <<endl;
			cout << "2 - 100 onnet minutes for 1-days @ Rs 7" <<endl;
			cout << "3 - 250 onnet minutes, 500 SMS and 150 MBs for 3-days @ Rs 30" <<endl;
			cout << "# - main manu: "                <<endl;
			cin >> offer2;
			if (offer2=='1')
			{
				cout << "You have activated Voice and SMS offer and received 50 onnet minutes and 100 MBs for 1-days in Rs 10"<<endl;
				cout << "10 Rupees have been deducted from your account, offer will be Expire in 1-days "<<endl;
			}
			else if (offer2=='2')
			{
				cout << "You have activated Voice and SMS offer and received 100 onnet minutes for 1-days in Rs 7"<<endl;
				cout << "7 Rupees have been deducted from your account, offer will be Expire in 1-days "<<endl;
			}
			else if (offer2=='3')
			{
				cout << "You have activated Voice and SMS offer and received 250 onnet minutes, 500 SMS and 150 MBs for 3-days in Rs 30"<<endl;
				cout << "30 Rupees have been deducted from your account, offer will be Expire in 3-days "<<endl;
			}
			else if (offer2=='#')
			{
				goto Manu;
			}
		}
		else if (option=='4')
		{
			cout << "Chose any one Offer from below given offers! "<<endl;
			cout << "1 - 1200 SMS and 100 MBs (WhatsApp) for 7-Days @ Rs10" <<endl;
			cout << "2 - 10000 SMS and 300 MBs (WhatsApp/FB) for 30-days @ Rs 40" <<endl;
			cout << "# - main manu: "                <<endl;
			cin >> offer;
			if (offer=='1')
			{
				cout << "You have activated SMS offer and received 1200 SMS and 100 MBs (WhatsApp) for 7-Days in Rs10"<<endl;
				cout << "10 Rupees have been deducted from your account, offer will be Expire in 7-days "<<endl;
			}
			else if (offer=='2')
			{
				cout << "You have activated SMS offer and received 10000 SMS and 300 MBs (WhatsApp/FB) for 30-days in Rs 40"<<endl;
				cout << "40 Rupees have been deducted from your account, offer will be Expire in 30-days "<<endl;
			}
			else if (offer=='#')
			{
				goto Manu;
			}
		}
		else if (option=='5')
		{
			cout << "Chose any one Offer from below given offers! "<<endl;
			cout << "1 - 200 MBs for 3-days @ Rs 42" <<endl;
			cout << "2 - 750 MBs for 7-days @ Rs 75" <<endl;
			cout << "3 - 3 GBs for 7-days @ Rs 160" <<endl;
			cout << "4 - 2 GBs for 30-days @ Rs 170" <<endl;
			cout << "5 - 100 MBs for 1-days @ Rs 18" <<endl;
			cout << "6 - 500 MBs for 1-days @ Rs 12" <<endl;
			cout << "# - main manu: "                <<endl;
			cin >> offer;
			if (offer=='1')
			{
				cout << "You have activated Internate offer and received 200 MBs for 3-days in Rs 42"<<endl;
				cout << "42 Rupees have been deducted from your account, offer will be Expire in 3-days "<<endl;
			}
			else if (offer=='2')
			{
				cout << "You have activated Internate offer and received 750 MBs for 7-days in Rs 75"<<endl;
				cout << "75 Rupees have been deducted from your account, offer will be Expire in 7-days "<<endl;
			}
			else if (offer=='3')
			{
				cout << "You have activated Internate offer and received 3 GBs for 7-days in Rs 160"<<endl;
				cout << "160 Rupees have been deducted from your account, offer will be Expire in 7-days "<<endl;
			}
			else if (offer=='4')
			{
				cout << "You have activated Internate offer and received 2 GBs for 30-days in Rs 170"<<endl;
				cout << "170 Rupees have been deducted from your account, offer will be Expire in 30-days "<<endl;
			}
			else if (offer=='5')
			{
				cout << "You have activated Internate offer and received 100 MBs for 1-days in Rs 18"<<endl;
				cout << "18 Rupees have been deducted from your account, offer will be Expire in 1-days "<<endl;
			}
			else if (offer=='6')
			{
				cout << "You have activated Internate offer and received 500 MBs for 1-days in Rs 12"<<endl;
				cout << "12 Rupees have been deducted from your account, offer will be Expire in 1-days "<<endl;
			}
			else if (offer=='#')
			{
				goto Manu;
			}
		}
		else if (option=='6')
		{
			cout << "Chose any one Offer from below given offers! "<<endl;
			cout << "1 - Smart Tunes @ Rs (0.80/day+tex)" <<endl;
			cout << "2 - Missed call alert @ Rs (3.99/week+tex)" <<endl;
			cout << "# - main manu: "                <<endl;
			cin >> offer;
			if (offer=='1')
			{
				cout << "You have activated Value services offer smart tunes "<<endl;
				cout << "in which 0.80+tex will be deducted every day from your account "<<endl;
			}
			else if (offer=='2')
			{
				cout << "You have activated Value services offer Missed call alert"<<endl;
				cout << "in which 3.99+tex will be deducted every week from your account "<<endl;
			}
			else if (offer=='#')
			{
				goto Manu;
			}
		}
		else if (option=='7')
		{
			cout << "Chose any one Offer from below given offers! "<<endl;
			cout << "1 - Djuice team offer @ Rs 0" <<endl;
			cout << "2 - Talkshawk Economy @ Rs 10" <<endl;
			cout << "3 - TS 30 sec @ Rs 10" <<endl;
			cout << "4 - Djuice main @ Rs 10" <<endl;
			cout << "5 - Talkshawk A1 @ Rs 10" <<endl;
			cout << "6 - Talkshawk Value @ Rs 10" <<endl;
			cout << "7 - Djuice one plane offer @ Rs 0" <<endl;
			cout << "# - main manu: "                <<endl;
			cin >> offer;
			if (offer=='1')
			{
				cout << "You have activated Package change Djuice team offer free"<<endl;
				cout << "In which you can use Djuice Team Packages "<<endl;
			}
			else if (offer=='2')
			{
				cout << "You have activated Package change Talkshawk Economy offer in Rs 10"<<endl;
				cout << "In which you can use Talkshawk Economy Packages "<<endl;
			}
			else if (offer=='3')
			{
				cout << "You have activated Package change TS 30 sec offer in Rs 10"<<endl;
				cout << "In which you can use TS 30 sec Packages "<<endl;
			}
			else if (offer=='4')
			{
				cout << "You have activated Package change Djuice Main offer in Rs 10"<<endl;
				cout << "In which you can use Djuice Main Packages "<<endl;
			}
			else if (offer=='5')
			{
				cout << "You have activated Package change Talkshawk A1 offer in Rs 10"<<endl;
				cout << "In which you can use Talkshawk A1 Packages "<<endl;
			}
			else if (offer=='6')
			{
				cout << "You have activated Package change Talkshawk Value offer in Rs 10"<<endl;
				cout << "In which you can use Talkshawk Value Packages "<<endl;
			}
			else if (offer=='7')
			{
				cout << "You have activated Package change Djuice One Plane offer Free"<<endl;
				cout << "In which you can use Djuice One Plane Packages "<<endl;
			}
			else if (offer=='#')
			{
				goto Manu;
			}
		}
		else if (option=='8')
		{
		cout<<"You have a 4G SIM, In which you can use an 4G network"<<endl;
		}
		else if (option=='#')
		{
			goto Sanjai;
		}
	}
		else if (x==2)
	{
		cout<<"Please Chose language English Because  urdu language is unvalid for compiler!"<<endl;
		goto Sanjai;
	}
}
	else 
	cout<<"Please enter valid number!"<<endl;
}

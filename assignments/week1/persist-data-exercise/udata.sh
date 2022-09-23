#!/bin/bash

while IFS="," read -r fname lname email usr pwd
do
  echo
  echo $fname $lname $email $usr $pwd
  echo "+---------------------------------+"
done < MOCK_DATA.csv

read -p "Enter new data? Y/N: " YN

if [ "$YN" == "Y" ]
then
  read -p "input First Name: " fname1 ;
  read -p "input Last Name: " lname1 ;
  read -p "input email address: " email1 ;
  read -p "input username: " usr1 ;
  read -p "input password: " pwd1 ;
  echo "$fname1,$lname1,$email1,$usr1,$pwd1" >> MOCK_DATA.csv ;
  echo "New entry added to file." ;

elif [ "$YN" == "N" ]
then
  exit 0 ;
fi


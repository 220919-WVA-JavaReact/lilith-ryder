#!/bin/bash/


#- The User will be given a small menu with options of what to do.

echo "****************************"
echo "       REVADEX V 0.1        "
echo "****************************"



echo "Main Menu: Enter selection."
echo
echo "1.) Create new entry"
echo
echo "2.) Display entries "
echo
echo "3.) Search for entry"
echo
read sel

#- The User will be able to create new data to be stored

if [ $sel = 1 ]
then
  echo "Enter employee name, email, and contact number."
  read name email num
  echo "Entry has been added with ID $ID++"
  echo $ID $name $email $num >> data.csv


#- The User will be able to see all data stored formatted in a way that is easy to understand
elif [ $sel = 2 ]
then
  cat data.csv


#- The User will be able to select/search for a certain piece of data
elif [ $sel = 3 ]
then
  echo "Enter ID you would like to display."
  read sel2
  grep $sel2 data.csv
fi

#- The User will be able to delete a specific piece of data


#- The User will be able to change/update a specific piece of data

#!/bin/bash

echo "Enter 10 numbers"

read N1 N2 N3 N4 N5 N6 N7 N8 N9 N10

for [ $N1, $N2, $N3, $N4, $N5, $N6, $N7, $N8, $N9, $N10 ]=input
do

if [ $input -ge 0 ]
then echo "$input is positive"

elif [$input < 0 ]
then echo "$input is negative"
fi

done


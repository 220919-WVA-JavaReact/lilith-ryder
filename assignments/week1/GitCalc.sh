#!/bin/bash/

echo "GitCalc v0.3 started!"
echo
echo "Enter requested operation (SUM, DIF, PRD, QUO) followed by integers."
echo "Example: 'SUM 1 1'"
echo "Type EXIT to quit."
echo

#Runs loop for calculator

while true; do

# User input request

read OP N1 N2

#exits program based on specific prompt

if [ "$OP" = "EXIT" ]
then
  exit 0;
fi

#checks to make sure number values are not blank

if [ -z "$OP" ] || [ -z "N1" ] || [ -z "N2" ]
then
  echo "Input cannot be blank!" ;
  echo ;
fi

#-----------------------------------------------


#returns to prompt if non-number input specified.

if ! [[ ${N1} =~ ^[+-]?[0-9]+$ ]]
then
  echo "Input must be a number!" ;
  echo ;
fi

if ! [[ ${N2} =~ ^[+-}?[0-9]+$ ]]
then
  echo "Input must be a number!" ;
  echo ;
fi

#-----------------------------------------------

#verifies the operation specified and runs relevant operation.

if [ "$OP" = "SUM" ]
then
  echo "Result:" ;
  expr $N1 + $N2 ;
  echo ;
elif [ "$OP" = "DIF" ]
then
  echo "Result:" ;
  expr $N1 - $N2 ;
  echo ;
elif [ "$OP" = "PRD" ]
then
  echo "Result:" ;
  expr $N1 \* $N2 ;
  echo ;
elif [ "$OP" = "QUO" ]
then
  echo "Result:" ;
  expr $N1 / $N2 ;
  echo ;

#------------------------------------------------

#validates that valid operation was specified.

elif [ "$OP" != "SUM" ] || [ "$OP" != "DIF" ] || [ "$OP" != "PRD" ] || [ "$OP" != "QUO" ]
then
  echo "Invalid Operation!" ;
  echo ;
fi

#------------------------------------------------

done

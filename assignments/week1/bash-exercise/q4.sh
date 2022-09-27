#!/bin/bash

echo
pwd
echo
whoami
echo
echo "Today is: $(date)" ;
echo "No. of users logged in:  $(who --count) " ; #for all intents and purposes this line should work, it works in the console by itself, no idea why it won't run in this script.

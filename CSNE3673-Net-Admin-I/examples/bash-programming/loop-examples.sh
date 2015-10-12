#!/bin/bash

# The MIT License (MIT)
# 
# Copyright (c) 2015 Southern Nazarene University Computer Science/Network Engineering Department
# 
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
# 
# The above copyright notice and this permission notice shall be included in all
# copies or substantial portions of the Software.
# 
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.

# ******************************************************************************
# For loop examples

# Iterate through the numbers 1 through 5 and print them out
echo Print out a hard-coded sequence
for i in 1 2 3 4 5; do
    echo Index=[$i]
done

# Same as above, but generate the sequence
echo Print out a generated sequence
for i in {1..5}; do
    echo Index=[$i]
done

# Same as above, but use a more conventional format
#   NOTE: Double parenthesis are used since we are doing arithmetic
echo Print out a generated sequence using the 3-expression format
for(( i=1; i<=5; i++ ))
do
    echo Index=[$i]
done

# Print out the first 3 lines of each shell file in the current directory
echo Print out the first 3 lines of each shell file
for FILE in *.sh
do
    echo =====================================
    echo File=[$FILE]
    head -n 3 $FILE
done


# ******************************************************************************
# While loop examples

# Countdown to blastoff
echo Executing a while loop to countdown to blastoff
counter=5
while [ "$counter" -gt 0 ]; do
    echo Countdown [$counter]
    counter=$(($counter - 1))
done
echo Blastoff


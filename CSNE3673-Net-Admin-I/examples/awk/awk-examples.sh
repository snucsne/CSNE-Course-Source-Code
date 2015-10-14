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
# (g)awk examples

# Selects all the lines in the cars file that contain the string 'chevy'
echo "============================================================"
echo "Selecting all lines that contain the string 'chevy'"
gawk '/chevy/' cars
echo


# Selects all the lines in the cars file that contain the string 'chevy' and
# print the year & make:
echo "============================================================"
echo "Selecting all lines that contain 'chevy' and print the year and make"
gawk '/chevy/ {print $3, $1}' cars
echo


# Selects all the lines that contain the letter h in the first field (make):
echo "============================================================"
echo "Selecting all lines that contain the letter h in the first field"
gawk '$1 ~ /h/' cars
echo


# Selects all the lines that contain the letter h as the first character in
# the first field (make):
echo "============================================================"
echo "Selecting all lines that contain h as the first character in the first field"
gawk '$1 ~ /^h/' cars
echo


# Selects all the lines in the cars file in which the third column (year) ends in
# a 5 and prints the year, make, & price:
echo "============================================================"
echo "Selecting lines in which the third comlumn ends in 5 and prints the year, make and price"
gawk '$3 ~ /5$/ {print $3, $1, "$" $5}' cars
echo


# Selects all the lines where the price is greater than or equal to $2000 and less than $9000:
echo "============================================================"
echo "Selecting lines where the price is greater than or equal to $2000 and less than $9000"
gawk '2000 <= $5 && $5 < 9000' cars
echo

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
# Numerical comparison examples

# Create some variables
x=1
echo x=["$x"]
y=2
echo y=["$y"]
z=2
echo z=["$z"]


# Perform some comparisons
if [[ "$x" -ne "$y" ]]; then
	echo ["$x"] ne ["$y"]
fi

if [[ "$y" -eq "$z" ]]; then
	echo ["$y"] eq ["$z"]
fi

if [[ "$y" -gt "$x" ]]; then
	echo ["$y"] gt ["$x"]
fi

if [[ "$y" -ge "$z" ]]; then
	echo ["$y"] ge ["$z"]
fi

if [[ "$x" -lt "$y" ]]; then
	echo ["$x"] lt ["$y"]
fi

if [[ "$y" -le "$z" ]]; then
	echo ["$y"] le ["$z"]
fi


# ******************************************************************************
# String comparison examples

# Create some variables
a="A"
echo a=["$a"]
b="B"
echo b=["$b"]
anotherA="A"
echo anotherA=["$anotherA"]

# Perform some comparisons
if [[ "$a" == "$anotherA" ]]; then
	echo ["$a"] "==" ["$anotherA"]
fi

if [[ "$a" != "$b" ]]; then
	echo ["$a"] "!=" ["$b"]
fi
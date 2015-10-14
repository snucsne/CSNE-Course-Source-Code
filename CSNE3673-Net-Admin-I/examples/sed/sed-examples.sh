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
# sed examples

# Select the lines from file.txt that contain the string line:
echo "============================================================"
echo "Select the lines from file.txt that contain the string line"
sed -n '/line/ p' file.txt
echo


# Selects and displays lines 3 through 6 of the file file.txt:
echo "============================================================"
echo "Selects and displays lines 3 through 6 of the file file.txt"
sed -n '3,6 p' file.txt
echo


# Uses a program-file to accomplish the same thing:
echo "============================================================"
echo "Uses a program-file to accomplish the same thing"
echo "  print3_6 contents:"
cat print3_6
echo "  sed output:"
sed -n -f print3_6 file.txt
echo


# Quits after displaying the first 5 lines of the file file.txt:
echo "============================================================"
echo "Quits after displaying the first 5 lines of the file file.txt"
sed '5 q' file.txt
echo


# Selects line 2 and appends a NEWLINE and the text AFTER:
echo "============================================================"
echo "Selects line 2 and appends a NEWLINE and the text AFTER"
sed '2 a\
AFTER.' file.txt
echo


# Selects lines that begin with a non-empty character and replaces it
# with a TAB and the matched character (effectively inserting a TAB):
echo "============================================================"
echo "Insert a TAB in lines that begin with a non-empty character"
sed 's/^./\t&/' file.txt
echo


# Substitutes the word sentence for the word line in the file file.txt
# and displays each line where a substitution occurs:
echo "============================================================"
echo "Substituting 'sentence' for 'line'"
sed 's/line/sentence/p' file.txt
echo

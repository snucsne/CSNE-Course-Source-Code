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
# Greet the user by username
echo Greetings $USER

# Change to their home directory
cd $HOME

# How many files and directories do they have
FILE_COUNT=`ls | wc -l`
echo You have $FILE_COUNT files and directories in your home directory

# What shell do they use (per the passwd file)?
USER_SHELL=`grep $USER /etc/passwd | awk -F':' '{print $7}'`
echo You use the $USER_SHELL for your shell

# When did they last log out?
LAST_LOGOUT=`last -F | head -n 2 | tail -n 1 | sed 's/.* - //' | sed 's/([0-9][0-9]:[0-9][0-9])//'`
echo You last logged out at $LAST_LOGOUT

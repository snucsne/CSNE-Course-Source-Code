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
# Ch. 05 - The Shell

# ******************************************************************************
# Redirecting Standard Input and Standard Output

# Redirect output of ls to a file, overwriting any previous contents
ls /usr/bin/ > binfiles.txt
less binfiles.txt

# Redirect output of ls, but append it if the file already exists
ls /sbin/ >> binfiles.txt

# Redirect standard input
cat < binfiles.txt

# Throw the output of the ls command away
ls /etc/ > /dev/null

# Dump the contents of /dev/null, which is empty
cat < /dev/null


# ******************************************************************************
# Running Commands in the Background

# Start a GUI command in the background
pluma &

# Start a GUI command in the foreground
pluma
# Use CONTROL-Z to suspend the process
# List all the processes in this shell
jobs
# Bring it back to the foreground
fg 1

# Suspend the process again using CONTROL-Z
# Send it to the background
bg


# ******************************************************************************
# Wildcards

# TODO

# ******************************************************************************
# Builtin Commands

# List all the builtin commands
help

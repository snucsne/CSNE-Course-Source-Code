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
# Ch. 03 - The Utilities

# Prepare some files and directories
#   NOTE: This assumes that the utilities-lecture-files.tar file is located in
#         your home directory.
cd ~
mkdir utilities-lecture
cd utilities-lecture
tar xf ../utilities-lecture-files.tar

# ==============================================================================
# How to Get Help

# Get help for the 'grep' command
grep --help

# Look at the man (manual) page for 'grep'
man grep

# Get information about 'grep'
info grep


# ==============================================================================
# Basic Utilities

# List the names of files
ls /usr/bin

# Dump the contents of a file to the screen
cat /etc/passwd

# Delete a file
#   Note:  The 'touch' command can create a blank file if the file doesn't exist
touch delete-me.txt
rm delete-me.txt

# Display a text file one screen at a time
more /etc/passwd

# Display a text file one screen at a time with the ability to go backwards
less /etc/passwd


# ==============================================================================
# Working with Files

# Copy a file
cp dir1/temp.txt dir2

# Move a file
mv dir1/temp.txt dir3/different.txt

# Search through files
grep home /etc/passwd

# Display the top 6 lines of a file
head -n 6 /etc/passwd

# Display the last 6 lines of a file
tail -n 6 /etc/passwd

# Display the sorted contents of a file
sort -r names.txt

# Display the contents of a file, skipping adjacent duplicate lines
#  Note: Compare this output to 'cat names.txt'
uniq names.txt

# Compare 2 files and display differences
diff file1.txt file2.txt

# Test the contents of a given file
#   ASCII text
file /etc/passwd
#   Executable
file /bin/bash
#   Directory
file ~


# ==============================================================================
# Piping

# Search for the word 'home' in /etc/passwd,
#   remove everything but the 6th column using colons as column separators,
#   list the contents of those directories, and
#   display it to the screen
grep home /etc/passwd | awk -F ':' '{print $6;}' | ls -l | less

# Sort the names file and then remove the duplicates
sort names.txt | uniq


# ==============================================================================
# Miscellaneous Utilities

# Display a line of text
echo Greetings program

# Display the current date and time
date
# Display just the day of the week and the date
date "+%A %m-%d-%Y"

# Convert a DOS formatted file to Unix
dos2unix -n dos-file.txt dos-2-unix.txt

# Convert a Unix formatted file to DOS
unix2dos -n unix-file.txt unix-2-dos.txt

# Convert a Unix formatted file to Mac
unix2mac -n unix-file.txt unix-2-mac.txt

# ==============================================================================
# Compressing & Archiving Files

# Compress a file using the bzip compression algorithm
bzip2 uncompressed1.txt

# Decompress a file using the bzip compression algorithm
bunzip2 compressed1.txt.bz2

# Compress a file using the gzip compression algorithm
gzip uncompressed2.txt

# Decompress a file using the gzip compression algorithm
gunzip compressed2.txt.gz

# Combine all the files in the home directory into a single file and compress
#   it using the gzip algorithm
tar cvfz /tmp/all-home-files.tar.gz ~/*


# ==============================================================================
# Locating Commands

# Locate where in the search path a utility is
which dos2unix

# Searches for a utility in standard locations, not just the search path
whereis dos2unix

# Searches for utilities related to a keyword
apropos password

# Searches for files on the local system with the given name
mlocate dos2unix


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
# Ch. 04 - Linux Filesystem

# ******************************************************************************
# Pathnames

# Change directories using an absolute path
cd /var/log

# Change directories using an absolute path
cd ~/video-lecture

# Change directories using a relative path
cd ../../var/log

# Using cd without specifying a directory takes you to your home directory
cd
pwd

# Change directory to a directory with lecture files using a relative path
cd video-lecture

# List all the files, including the hidden ones
ls -a


# ******************************************************************************
# Working with Directories

# Try to create a directory with missing parent directories
mkdir long/directory/path
# Do it again but create any parent directories that don't already exist
mkdir -p long/directory/path

# Create a directory so we can delete it
mkdir dir-to-delete
# Delete it
rmdir dir-to-delete

# Create an empty file in a directory to delete
mkdir nonempty-dir-to-delete
touch nonempty-dir-to-delete/empty-file.txt
ls -l nonempty-dir-to-delete
# Try to delete the directory
rmdir nonempty-dir-to-delete
# Force it to delete
rm -rf nonempty-dir-to-delete


# ******************************************************************************
# Access Permissions

# Look at the permissions of a few files
ls -l

# Change permissions of a sample file so the owner has read/write permissions,
# the group also has read/write permission, but the world only has read
# permissions
chmod 664 permissions.txt
ls -l permissions.txt

# Update the permissions to remove write permission for groups
chmod g-w permissions.txt
ls -l permissions.txt

# The passwd utility has the setuid bit set
ls -l /usr/bin/passwd


# ******************************************************************************
# Links

# Create a symbolic link to a file buried deep in a hierarchy
ln -s very/long/directory/path/to/file.txt shortcut-file.txt
# Display the link information
ls -l shortcut-file.txt

# Create a symbolic link to a directory buried deep in a hierarchy
ln -s very/long/directory/path/to/ shortcut-dir
ls -l shortcut-dir


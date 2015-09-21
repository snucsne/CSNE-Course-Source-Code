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
# Regular Expressions

# ******************************************************************************
# A site like http://www.regexr.com/ is helpful in seeing how patterns
# are matched.

# Text used for matching
at
hat
cat
dog
bat
chat
cccccccccat
what
hatch
catch
dogcatcher
hat	bat	cat	chat
The Cat in the Hat
101 Dalmations


# ******************************************************************************
# Traditional Unix Regular Expressions

# Match any character followed by 'at'
.at

# Match an 'h' or 'c' followed by 'at'
[hc]at

# Match any text not having a 'b' or 'h' followed by 'at'
[^bh]at

# Match any text that starts with an 'h' or 'c' followed by 'at'
^[hc]at

# Match any text that ends with an 'h' or 'c' followed by 'at'
[hc]at$

# Match zero or more 'h' or 'c' characters followed by 'at'
[hc]*at

# Match an 'h' or 'c' followed by zero or more characters followed by 'at'
#   NOTE: Remember that regular expressions are greedy
[hc].*at

# Match any lowercase letter
[a-z]

# Match any uppercase letter
[A-Z]

# Match any digit
[0-9]

# Match a tab
\t


# ******************************************************************************
# POSIX Extended Regular Expressions

# Match one or more 'h' or 'c' characters followed by 'at'
[hc]+at

# Match zero or one 'h' or 'c' character followed by 'at'
[hc]?at

# Match either 'cat' or 'dog'
cat|dog


# ******************************************************************************
# Shorthand Character Classes & Boundaries

# Match any number character
\d

# Match any word character
\w

# Match any non-word character
\W

# Match any whitespace character
\s
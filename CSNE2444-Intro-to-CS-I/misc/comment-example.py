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
# Comment coding convention examples
# Brent E. Eskridge

# ==============================================================================

def iterative_multiply( x, y ):
    # Start off with a result of 0
    result = 0

    # Add x to result, y times
    for i in range(y):
        result = result + x

    # Return the result
    return result


def recursive_multiply( x, y ):
    result = 0
    # Base Case:
    # If y is 0, then x * 0 = 0
    if( 0 >= y ):
        result = 0

    # Otherwise, add x to x * (y - 1)
    else:
        result = x + recursive_multiply( x, y-1 )
    
    return result

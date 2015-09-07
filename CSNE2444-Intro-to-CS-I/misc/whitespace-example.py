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
# Whitespace coding convention examples
# Brent E. Eskridge

# ==============================================================================
# Correct indentation

# This function uses 4 spaces for indentation
def multiply( x, y ):
    z = x * y
    print(z)

# This function uses a tab to indent the first line.  Your computer may
# display it properly, or it may not.
def multiply( x, y ):
	z = x * y
    print(z)
  

# ==============================================================================
# This comment is goes to column 80 ------------------------------------------>|

# This comment goes well beyond column 80 -------------------------------------------------------------------------------------------------------------------->|


# ==============================================================================
# Use blank lines to separate sections of code that belong together

# -- Use the quadratic formula as an example --
import math

# Create our variables
a = -7
b = 2
c = 9

# Calculate the value in the square root
value_to_be_rooted = b * b - 4 * a * c
rooted_value = math.sqrt( value_to_be_rooted )

# Calculate the two different numerators
positive_numerator = -1 * b + rooted_value
negative_numerator = -1 * b - rooted_value

# Calculate the denominator
denominator = 2 * a

# Calculate the two factors
positive_factor = positive_numerator / denominator
negative_factor = negative_numerator / denominator

# Display them
print( "Positive factor [", positive_factor, "]" )
print( "Negative factor [", negative_factor, "]" )

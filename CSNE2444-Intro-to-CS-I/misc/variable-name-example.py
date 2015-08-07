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
# Variable name coding convention examples
# Brent E. Eskridge

# ==============================================================================
# Good variable names

# Descriptive
name = "Bob"

# Descriptive multiword
mean_grade = 81.2
angle_of_rotation = 30

# Descriptive constant
DAYS_IN_WEEK = 7

# Good variable names in context
dna = 'acgatagc'
last_codon_start = len(dna) - 2
protein = ""
for codon_start in range(0,last_codon_start,3):
    codon = dna[codon_start:codon_start+3]
    amino_acid = genetic_code.get(codon.upper(), 'X')
    protein = protein + amino_acid


# ==============================================================================
# Poor variable names

# Not descriptive
x = 3
stuff = "Hello"

# Name doesn't match value
name = 13

# Verb instead of a noun
calculate_mean = 55

# Incorrect capitalization and separation
MyDog = "Nikita"

# Poor variable names in context
a = 'acgatagc'
b = len(a) - 2
d = ""
for e in range(0,f,3):
    g = a[e:e+3]
    h = i.get(g.upper(), 'X')
    d = d + h


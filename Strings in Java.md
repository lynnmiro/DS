
# String, StringBuilder, and StringBuffer

String: is immutable "cannot be changed." String cannot be used by two threads simultaneously and once it assigned, it cannot be changed.

StringBuffer: is mutable "one can change the value of the object." It has same methods as StringBuilder but the good thing about StringBuffer that each method is synchronized that is thread safe which means no two threads could be accessed. Thus stringBuilder is faster than StringBuffer when calling the same method of each class. 

StringBuilder: is same as StringBuffer but the main difference between stringbuffer and stringbuilder is the last is not thread safe but it is fast 

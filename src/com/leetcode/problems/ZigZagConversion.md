# 6. ZigZag Conversion
## Description
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
(you may want to display this pattern in a fixed font for better legibility)
## Example
```$xslt
P   A   H   N
A P L S I I G
Y   I   R
```
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

```$xslt
string convert(string text, int nRows);
```

convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
## Translation
将字符串“PAYPALISHIRING”在给定数量的行上以Z字形图案书写。

## Ideas
关于 "Z" 字型图案。以 (1,2n-2) 为一个周期，T =  2n-2。

两重循环，外部循环控制 numRows，内部循环依次取值。
```$xslt
n=numRows
Δ=2n-2    1                           2n-1                         4n-3
Δ=        2                     2n-2  2n                    4n-4   4n-2
Δ=        3               2n-3        2n+1              4n-5       .
Δ=        .           .               .               .            .
Δ=        .       n+2                 .           3n               .
Δ=        n-1 n+1                     3n-3    3n-1                 5n-5
Δ=2n-2    n                           3n-2                         5n-4

作者 @HELLOKENLEE
```

## Note
注意测试数据:

```$xslt
"",1

"ASDFG",1
```
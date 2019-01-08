# 71. Simplify Path
## Description
Given an absolute path for a file (Unix-style), simplify it. 


## Example
```$xslt
For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
path = "/a/../../b/../c//.//", => "/c"
path = "/a//b////c/d//././/..", => "/a/b/c"
```


In a UNIX-style file system, a period ('.') refers to the current directory, so it can be ignored in a simplified path. 
Additionally, a double period ("..") moves up a directory, so it cancels out whatever the last directory was. For more information, look here: https://en.wikipedia.org/wiki/Path_(computing)#Unix_style

Corner Cases:

+ Did you consider the case where path = "/../"? In this case, you should return "/".

+ Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/". In this case, you should ignore redundant slashes and return "/home/foo".
## Translation
给定一个文档 (Unix-style) 的完全路径，请进行路径简化。
边界情况:

+ 你是否考虑了 路径 = "/../" 的情况？在这种情况下，你需返回 "/" 。
+ 此外，路径中也可能包含多个斜杠 '/' ，如 "/home//foo/" 。在这种情况下，你可忽略多余的斜杠，返回 "/home/foo" 。
## Ideas
将String 用 ```/ 或者 //``` 分割，遍历所有元素。

如果当前元素是 ```.``` 跳过，不做处理

如果当前元素是 ```..``` 从结果集中删除最后一个元素。（向后退一级目录，注意结果集为空的情况）

否则将当前目录加入结果集。

遍历结束后，将结果集中的元素用 ```/```拼接成目录。

## Note 
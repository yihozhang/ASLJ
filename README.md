# A Simple Lexer for Java

## Introduction

这是一个基于Java的简单词法分析器。实现的主要思想是把tokenizer视作一个在转移过程中释放副作用的有限状态机（FSM）。

## Build

使用ant进行生成：

```text
ant -f lexer.xml
```

## Run

格式：

```text
java LexerMain [<INPUTFILE>] [<OUTPUTFILE>]
```
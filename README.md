# COT5405-21sp-City-s-Skyline
This repository contains project 2 for the class of Analysis of Algorithm.

<br><br>

# COT 5405: Assignment 2

## Introduction

For this assignment, you will be doing a combination of developing algorithms and proving their correctness,
and implementing those algorithms. As before use a compiled programming language such as C++ or
Java(not python) for coding. You should make use of standard libraries, such as STL, but not use any
external libraries. Use the Discussion page to ask any questions about the use of a specific library that you are
uncertain about. For implementing the functions, you are expected to use appropriate data structures such
that the run-time and memory consumption is optimal. All written aspects of your assignments should be in
a fileresults.txt/.doc/.pdf. Before getting started, read through the whole document, so you understand
what resources are available and what you are required to do.
Lastly, you can choose to work on the assignment alone or with one partner, meaningthere should be
a maximum of two people in each group.You do not have to email us your partner’s name, just let us
know at the time of submission who your partner is. Only one person needs to submit the assignment per
group.

<br>

## Question 1 

In this problem, we will consider the following problem.

Largest Sum Problem
Input: LetX=x 1 ,....,xnbe a list of integers.
Output: Find the largest possible sum of sub-sequence of consecutive items in the list.

Example: here is an example of the Largest Sum Problem.

```
Input: 10 -20 3 4 5 -1 -1 12 -3 1
Output: 3 + 4 + 5 + -1 + -1 + 12 = 22
```
a) Formulate a divide-and-conquer algorithm for solving the Largest Sum Problem. Provide a description in
words and pseduocode.
b) Give a mathematical proof of your algorithm’s correctness.
c) State and mathematically prove the order notation (e.g., Big-Oh) for the running time of your algorithm.

<br>

## Question 2 

Think of anO(nlogn)-time divide-and-conquer algorithm that searches for atargetvalue in anm×n
integermatrix. The matrix has two interesting properties: (1) Integers in each row are sorted in ascending
from left to right. (2) Integers in each column are sorted in ascending order from top to bottom.

a) Describe the algorithm in words and in pseudocode.
b) Give a mathematical proof of your algorithm’s correctness.
c) State and mathematically prove the order notation (e.g., Big-Oh) for the running time of your algorithm.

<br>

## Question 3 

A city’s skyline is the outer contour of the silhouette formed by all the buildings in that city when viewed
from a distance. Given the locations and heights of all the buildings, return the skyline formed by these
buildings collectively.

```
You are given a list of the building x-coordinates and their heights:
```
```
(l 1 , h 1 , r 1 ),(l 2 , h 2 , r 2 ), ...,(ln, hn, rn)
```
Here, we will assume all values are between 1 and 100. The list will be sorted in increasing order of
left-most x-coordinate. Format of the output would be :

```
(x 1 , y 1 ),(x 2 , y 2 ),(x 3 , y 3 ), ...
```
This means that atx 1 we draw a building at heighty 1 untilx 2 at which point we draw a line up or down
to highy 2 and then continue horizontally untilx 3 and so on.

a) Describe anO(nlogn)-time algorithm for solving this problem. Give your description in words and
pseudocode.
b) Implement your algorithm using a compiled programming language.
c) Simulate 5 increasingly datasets by creating the following number of points selected at random: 10 points,
100 points, 1000 points, 10000 points and 100000 points. Run your algorithm on each dataset, and graph the
the run-time to illustrate the order notation of your algorithm. The graph should demonstrate anO(nlogn)
running time.

Below is an example of the input and output.

```
Input: (1, 5 ,11),(2, 7 ,6),(3, 19 ,13),(3, 25 ,14),(4, 28 ,24),(7, 16 ,12),(13, 29 ,23),(18, 22 ,19)
Output: (1,5),(2,7),(3,25),(4,28),(13,29),(23,28),(24,0)
```




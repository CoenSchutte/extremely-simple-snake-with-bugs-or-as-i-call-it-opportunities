# extremely-simple-snake-with-bugs-or-as-i-call-it-opportunities

<p align="center">
  <img src="https://i.imgur.com/qPMbgz7.png" alt="The gay snake" height="300px" />
</p>

## Explanation

This repository is meant to contain our Snake Game. We had to create a Snake Game in Java with the following requirements:

1. There is a superclass for all of the elements: the body, the head and the food
1. There are recursive functions. These are meant to increase the productivity of the program.
1. Functions make use of polymorphism. This enables us to write less code to do more.

## How to use

The easiest way to compile the java files, is to run the following command from the root directory:

```bash
javac src/*.java -d build
```

This will put all of the compiled classes in a folder called `build`. 

## I want to play another mode

You can play without walls if you pass the argument `no-walls` while opening the application. For example:

```bash
java Main --no-walls
```

This gamemode will allow you to pass through the boundaries of the game without dying. We are currently working on Battle Royale.
To see all the other flags pass the argument `--help` while opening the application. You can for example also play as a gay snake.

## This sucks! Why?

Because this is meant to be easily extendable. If you feel like there is something extremely basic that needs to be in this program, you are free to create a Pull Request. We strongly advise you to create an issue beforehand, to avoid doing work that we will not use.

## Who made this?

[@CoenSchutte](https://www.github.com/CoenSchutte) and [@Bowero](https://www.github.com/Bowero)

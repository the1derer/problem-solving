#! /bin/bash

javac $0
java $0.class < input > out
# code --diff out output

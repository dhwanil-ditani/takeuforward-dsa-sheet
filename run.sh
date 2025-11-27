#!/bin/bash

set -e

file=$1

if [ ! -f "$file" ]; then
    echo "No such file"
    exit 1
fi

parent_dir=`dirname "$1"`
filename_without_ext=`basename "$1" .java`

# check if input.txt exists
if [ ! -f "input.txt" ]; then
    echo "input.txt file does not exist"
    exit 1
fi

# check if output.txt exists
if [ ! -f "output.txt" ]; then
    touch output.txt
fi


javac "$file"
java -cp "$parent_dir" "$filename_without_ext" < input.txt > output.txt
rm "$parent_dir/$filename_without_ext.class"

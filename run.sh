#!/bin/bash

file=$1
fileDirname=${1%/*}
fileBasename=${1##*/}
fileBasenameNoExtension=${fileBasename%.*}
g++ -fdiagnostics-color=always -g ${file} -o ${fileDirname}/${fileBasenameNoExtension}
$fileDirname/${fileBasenameNoExtension}
rm $fileDirname/${fileBasenameNoExtension}
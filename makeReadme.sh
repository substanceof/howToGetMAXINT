#!/bin/bash
code="\`\`\`"
cat "readmeHead"
for fname in src/*; do
  basename=$(basename "$fname")
  ext="${basename##*.}"
  
  printf "* $fname\n$code$ext\n"
  cat "$fname"
  printf "$code\n\n"
done

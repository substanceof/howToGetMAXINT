#!/bin/bash
code="\`\`\`"
cat "readmeHead"
for fname in src/*; do
  printf "* $fname\n$code\n"
  cat "$fname"
  printf "$code\n\n"
done

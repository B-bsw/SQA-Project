#!/usr/bin/env bash
set -euo pipefail
csv=${1:?csv}; out=${2:?output}
awk -F, 'NR>1 {rows++; tests+=$9; sec+=$8; if($11!=""){line+=$11;ln++} if($12!=""){branch+=$12;bn++} if($13=="ok")ok++; else bad[$13]++} END {print "# Experiment summary\n\n| Metric | Value |\n| --- | ---: |"; printf "| Target classes processed | %d |\n| Successful coverage rows | %d |\n| Total generated tests | %d |\n| Total generation seconds | %.0f |\n",rows,ok,tests,sec; if(ln)printf "| Mean line coverage (%%) | %.2f |\n",line/ln;else print "| Mean line coverage (%) | N/A |";if(bn)printf "| Mean branch coverage (%%) | %.2f |\n",branch/bn;else print "| Mean branch coverage (%) | N/A |";print "\n## Incomplete rows";for(x in bad)printf "\n* %s: %d",x,bad[x]}' "$csv" > "$out"

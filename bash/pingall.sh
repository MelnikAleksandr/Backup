NOW=$(date +"%Y-%m-%d-%T");
LOGFILE="PINGALL-$NOW.txt";
/home/asm/bash/ping.sh >> /home/asm/bash/$LOGFILE;

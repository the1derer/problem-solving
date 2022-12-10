#!/usr/bin/env bash

# Install Fira Code font
sudo apt install fonts-firacode

# Install Icedtea as Javaws is deprecated
sudo apt install icedtea-netx

# Create a symbolic link
rm $HOME/contestapplet.conf
 # Repalce Hard Coded link by address of the directory containing this file
ln -sv /mnt/Competitive/Topcoder_Applet/contestapplet.conf $HOME

# For solving unsigned jar issue
# https://shadekcse.wordpress.com/2021/05/08/how-to-fix-topcoder-java-applet-wont-open-in-ubuntu/

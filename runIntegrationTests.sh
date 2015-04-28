#!/bin/sh
cwd=$(pwd)
cd ..  
rm -rf cordova-test-app
git clone https://github.com/hypery2k/cordova-demo-app.git cordova-test-app
cd cordova-test-app
npm install
bower install
grunt "ci:$PLATFORM" "$PLATFORM"
cordova plugin add ../cordova-certificate-plugin/
echo "Changing back to plugin directy: "$cwd
cd $cwd
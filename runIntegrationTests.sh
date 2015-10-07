#!/bin/sh
cwd=$(pwd)
cd ..  
rm -rf cordova-test-app
git clone https://github.com/hypery2k/cordova-demo-app.git cordova-test-app
cd cordova-test-app
npm install
bower install
echo "Building vanilla cordova app"
grunt "ci:$PLATFORM" "$PLATFORM"
echo "Adding plugin"
cordova plugin add ../cordova-certificate-plugin/
echo "Building vanilla cordova app with added plugin"
grunt "$PLATFORM"
echo "Changing back to plugin directy: "$cwd
cd $cwd
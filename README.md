# Certificate Plugin for Apache Cordova

[![Build Status](https://travis-ci.org/hypery2k/cordova-certificate-plugin.svg?branch=master)](https://travis-ci.org/hypery2k/cordova-certificate-plugin) [![npm version](https://badge.fury.io/js/cordova-plugin-certificates.svg)](http://badge.fury.io/js/cordova-plugin-certificates)[![Bountysource](https://www.bountysource.com/badge/tracker?tracker_id=2596540)](https://www.bountysource.com/trackers/2596540-hypery2k-cordova-certificate-plugin?utm_source=2596540&utm_medium=shield&utm_campaign=TRACKER_BADGE)

> cordova Plugin to configure SSL Certificates, currently used to enable usage of untrusted  aka self-signed SSL certifcates
 
[![NPM](https://nodei.co/npm/cordova-plugin-certificates.png)](https://nodei.co/npm/cordova-plugin-certificates/)

Feel free to **donate**

<a href='http://www.pledgie.com/campaigns/25442'><img alt='Click here to lend your support to: Owncloud Apps and make a donation at www.pledgie.com !' src='http://www.pledgie.com/campaigns/23447.png?skin_name=chrome' border='0' /></a>
<a target="_blank" href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=AGPGLZYNV6Y5S">
<img alt="" border="0" src="https://www.paypalobjects.com/de_DE/DE/i/btn/btn_donateCC_LG.gif"/>
</img></a>


## Documentation

### Install

```
cordova plugin add cordova-plugin-certificates
```

> For Cordova-Android before 4.1.0 you need to install this version

```
cordova plugin add cordova-plugin-certificates@0.5.0
```

### Usage

Activate insecure certificates
```
cordova.plugins.certificates.trustUnsecureCerts(true)
```

Dectivate insecure certificates
```
cordova.plugins.certificates.trustUnsecureCerts(false)
```

## Development

### Running integration tests

execute the `runIntegrationTests.sh` script for a specific platform:

```
PLATFORM='android' ./runIntegrationTests.sh
```

```
PLATFORM='ios' ./runIntegrationTests.sh
```


# Certificate Plugin for Apache Cordova

[![Bountysource](https://www.bountysource.com/badge/tracker?tracker_id=2596540)](https://www.bountysource.com/trackers/2596540-hypery2k-cordova-certificate-plugin?utm_source=2596540&utm_medium=shield&utm_campaign=TRACKER_BADGE)

> cordova Plugin to configure SSL Certificates, currently used to enable usage of untrusted  aka self-signed SSL certifcates


## install

```
cordova plugin add cordova-plugin-certificates
```

## Usage

Activate insecure certificates
```
cordova.plugins.certificates.trustUnsecureCerts(true)
```

Dectivate insecure certificates
```
cordova.plugins.certificates.trustUnsecureCerts(false)
```

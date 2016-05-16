# handson-your-delivery-pipeline
Enter the next generation of continuous integration and continuous delivery with this handson. Discover docker, ansible, jenkins 2.0, and pipeline

## Pre-requisites
In order to prepare for your handson session, you need to install a few things:

### Virtualbox
Install the latest version of virtualbox [here](https://www.virtualbox.org/wiki/Downloads)

### Vagrant
Install the latest version of vagrant [here](https://www.vagrantup.com/downloads.html)

### VM bootstrap
Open your favorite shell in the ./ci-server folder and run  
```sh
vagrant up
```

This may take several minutes.

N.B.: you may have to input your sudo password. Otherwise, run vagrant up under a privileged user.

Once all the steps are done, check everything works by browsing http://ci.resourcepool.io.local


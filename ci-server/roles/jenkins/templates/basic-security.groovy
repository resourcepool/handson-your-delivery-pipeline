#!groovy
import hudson.security.*
import jenkins.model.*
import jenkins.security.*

def instance = Jenkins.getInstance()

if (!instance.isUseSecurity()) {
    println "--> First launch: automatically creating local user 'admin'"

    def hudsonRealm = new HudsonPrivateSecurityRealm(false)
    hudsonRealm.createAccount('admin', 'admin')
    instance.setSecurityRealm(hudsonRealm)
    
    def strategy = new FullControlOnceLoggedInAuthorizationStrategy()
    instance.setAuthorizationStrategy(strategy)
    instance.save()
}
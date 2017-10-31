# t-mobile-report-generator

The idea is simple. Perform autologin and download latest t-mobile invoice.

## Installation
* Define 2 environment variables: 
   * export tmobile_username="your-username"
   * export tmobile_password="your-password"
* Go into cloned project  
* Build project: `mvn clean install`
* Run it `java -jar target/tmobile-report-jar-with-dependencies.jar`
* Check out your download folder! Hooray!

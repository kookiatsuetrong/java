# java
Java demo project

```
Using minimal on Ubuntu (Git, Zip, Maven, JDK15)
sudo apt update
sudo apt install zip maven tree
wget https://codestar.work/corretto.deb
sudo dpkg -i corretto.zip
sudo apt install mysql-server

git clone https://github.com/kookiatsuetrong/java
cd java
git branch
git checkout maven
mvn package
java -classpath target/project-demo.jar Start

cd
wget https://codestar.work/tomcat.jar
wget https://codestar.work/minimal.war

sudo java -jar tomcat.jar --port 80 --temp-directory /tmp minimal.war

Open web browser to http://123.123.123.123

You can't cd or change directory from minimal, all command must execute from home directory
rm -r ./java/target
git --git-dir=./java/.git checkout hibernate
mvn --file ./java package

Hibernate from Command Line
cd
cd java
git checkout hibernate
sudo mysql --execute="create database store"
sudo mysql --execute=\
"create user james identified with mysql_native_password by 'bond'"
sudo mysql --execute="grant all on store.* to james"
mvn package
java -cp target/project-demo.jar Start
'-- java
    '-- pom.xml
    '-- src
        '-- main
            '-- java
            '   '-- Start.java
            '   '-- Branch.java
            '-- resources
                '-- META-INF
                    '-- persistence.xml
                    
mvn package assembly:single
java -classpath target/project-demo-jar-with-dependencies.jar Start
sudo mysql --execute="select * from store.branch"
```

# 协议包开发maven模版

```shell

mvn archetype:generate \
-DarchetypeGroupId=org.jetlinks.protocol \
-DarchetypeArtifactId=protocol-archetype \ 
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DoutputDirectory=./  
-DgroupId=org.jetlinks.protocol \
-DartifactId=custom-protocol \
-Dversion=1.0 \
-DarchetypeCatalog=internal

```
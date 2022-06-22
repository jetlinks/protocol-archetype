# 协议包开发maven模版

`linux` 或者 `macOS` 下
```shell
mvn dependency:get \
-DremoteRepositories=https://nexus.hsweb.me/content/groups/public \
-DgroupId=org.jetlinks.protocol \
-DartifactId=protocol-archetype \
-Dversion=1.0.0-SNAPSHOT \
&& \
mvn archetype:generate \
-DarchetypeGroupId=org.jetlinks.protocol \
-DarchetypeArtifactId=protocol-archetype \
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DoutputDirectory=./ \
-DgroupId=com.domain \
-DartifactId=custom-protocol \
-Dversion=1.0 \
-DarchetypeCatalog=local \
-DinteractiveMode=false
```

`windows`下使用`PowerShell`:

```shell
mvn dependency:get `
-DremoteRepositories="https://nexus.hsweb.me/content/groups/public" `
-DgroupId="org.jetlinks.protocol" `
-DartifactId="protocol-archetype" `
-Dversion="1.0.0-SNAPSHOT" 
;
mvn archetype:generate `
-DarchetypeGroupId="org.jetlinks.protocol" `
-DarchetypeArtifactId="protocol-archetype" `
-DarchetypeVersion="1.0.0-SNAPSHOT" `
-DoutputDirectory="./" `
-DgroupId="com.domain" `
-DartifactId="custom-protocol" `
-Dversion="1.0" `
-DarchetypeCatalog="local" `
-DinteractiveMode="false"
```
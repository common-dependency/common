# maven中央仓库账号

* username: woms
* password: 19880613 


# settings.xml

```xml

<servers>
    <server>
      <id>sonatype-nexus-snapshots</id>
      <username>woms</username>
      <password>19880613</password>
    </server>
    <server>
      <id>sonatype-nexus-staging</id>
      <username>woms</username>
      <password>19880613</password>
    </server>
</servers>

```

# gpg 

```
sudo apt install dirmngr
```

- gpg --gen-key
- gpg --list-keys
- gpg --keyserver hkp://keyserver.ubuntu.com:11371 --send-keys 58455D6C0721AECFE4A8693E2F4725171700C6FD
- gpg --keyserver hkp://keyserver.ubuntu.com:11371 --receive-keys 58455D6C0721AECFE4A8693E2F4725171700C6FD

# deploy

mvn clean deploy -P sonatype-oss-release -Dgpg.passphrase=58455D6C0721AECFE4A8693E2F4725171700C6FD
> 密码: wums0613


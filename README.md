[![Build Status](https://travis-ci.com/common-dependency/common.svg?branch=master)](https://travis-ci.com/common-dependency/common)
[![Author](https://img.shields.io/badge/author-wumingsheng-red.svg)](https://champyin.com)
[![GitHub issues](https://img.shields.io/github/issues/common-dependency/common)](https://github.com/common-dependency/common/issues)
[![GitHub stars](https://img.shields.io/github/stars/common-dependency/common)](https://github.com/common-dependency/common/stargazers)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.common-dependency/common/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.common-dependency/common)
[![License](https://img.shields.io/badge/license-GPLv3-blue.svg)](http://www.gnu.org/licenses/gpl-3.0.html)
[![Docker Pull](https://img.shields.io/docker/pulls/wums/common.svg)](https://hub.docker.com/repository/docker/wums/common)
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


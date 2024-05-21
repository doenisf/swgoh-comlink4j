# swgoh-comlink4j

## Description
A java client library for the [swgoh-comlink](https://github.com/swgoh-utils/swgoh-comlink) tool.

## Usage

### Use in your Java project
This library is published via [Maven Central](https://central.sonatype.com/artifact/io.github.doenisf.comlink4j/swgoh-comlink4j). \
Use with Maven:
```
<dependency>
    <groupId>io.github.doenisf.comlink4j</groupId>
    <artifactId>swgoh-comlink4j</artifactId>
    <version>${comlink4j.version}</version>
</dependency>
```
Use with Gradle:
```
implementation group: 'io.github.doenisf.comlink4j', name: 'swgoh-comlink4j', version: '${comlink4j.version}'
```

### Prerequisites
As mentioned above, this library provides a Java wrapper for the [swgoh-comlink](https://github.com/swgoh-utils/swgoh-comlink) tool.
Since the tool is self-hosted you need to host your own instance of the tool.

The easiest way to get to know the API and this library is to use [Docker Desktop](https://www.docker.com/products/docker-desktop/) and deploy
your own version of comlink using their [Getting started guide on Docker](https://github.com/swgoh-utils/swgoh-comlink/wiki/Getting-Started#deploying-with-docker).

> [!NOTE]
> The basic constructor for the [SwgohComlinkClient](/src/main/java/io/github/doenisf/comlink4j/SwgohComlinkClient.java)
> is configured to use port 8080 instead of the default port (3000) of the comlink docker container
 
# Release notes

## 0.1.0
- Basic implementation to connect to a self-hosted instance of [swgoh-comlink](https://github.com/swgoh-utils/swgoh-comlink)
  - No support for versions with authorization enabled
- Implementation and models for the */guild*, */player* and */playerArena* endpoints

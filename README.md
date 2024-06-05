# swgoh-comlink4j

## Description
A java client library for the [swgoh-comlink](https://github.com/swgoh-utils/swgoh-comlink) tool.

## Usage

### Prerequisites
As mentioned above, this library provides a Java wrapper for the [swgoh-comlink](https://github.com/swgoh-utils/swgoh-comlink) tool.
Since the tool is self-hosted you need to host your own instance of the tool.

The easiest way to get to know the API and this library is to use [Docker Desktop](https://www.docker.com/products/docker-desktop/) and deploy
your own version of comlink using their [Getting started guide on Docker](https://github.com/swgoh-utils/swgoh-comlink/wiki/Getting-Started#deploying-with-docker).

### Use in your Java project
This library is published via [Maven Central](https://central.sonatype.com/artifact/io.github.doenisf.comlink4j/swgoh-comlink4j). \
Use with Maven:
```xml
<dependency>
    <groupId>io.github.doenisf.comlink4j</groupId>
    <artifactId>swgoh-comlink4j</artifactId>
    <version>${comlink4j.version}</version>
</dependency>
```
Use with Gradle:
````Gradle
implementation group: 'io.github.doenisf.comlink4j', name: 'swgoh-comlink4j', version: '${comlink4j.version}'
````
To use make calls to the comlink, you need to instantiate a new [SwgohComlinkApi](./src/main/java/io/github/doenisf/comlink4j/SwgohComlinkApi.java).
For this you can use the implementation [SwgohComlinkClient](./src/main/java/io/github/doenisf/comlink4j/SwgohComlinkClient.java).

Basic default usage example:

````java
import io.github.doenisf.comlink4j.SwgohComlinkApi;
import io.github.doenisf.comlink4j.SwgohComlinkClient;
import io.github.doenisf.comlink4j.model.endpoints.guild.Guild;
import io.github.doenisf.comlink4j.model.endpoints.player.Player;

SwgohComlinkApi api = new SwgohComlinkClient();
Player player = api.getPlayer(315242232);
Guild guild = api.getGuild(player.getGuildId());
````

## Support
Issues can be reported in [GitHub](https://github.com/doenisf/swgoh-comlink4j/issues).

Join the [discord server](https://discord.gg/6PBfG5MzR3).
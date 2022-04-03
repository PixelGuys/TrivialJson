# TrivialJson
## Goals
Most json libraries out there (at least the ones I've seen) are complicated to use.\
Especially for parsing config files, it can be quite tedious having to check for every single value if it exists.

So I wanted to make an easy to use json library that avoids all those checks, while still being safe from errors.\
For that I'm requiring default values that are returned if the key isn't found.

Additionally I wanted to have support for hexadecimal numbers (e.g. `0xff008b`).\
This obviously means that the parser uses a super-set of json.

The parser is also quite forgiving when it comes to smaller errors, such as missing or additional `,`.
## Example
#### Creating json
```java
JsonObject ore = new JsonObject();
ore.put("veins", 7.5);
ore.put("size", 9);
ore.put("height", 68);
ore.put("density", 0.1f);
JsonArray oreSources = new JsonArray();
oreSources.addStrings("cubyz:stone", "cubyz:soil");
ore.put("sources", oreSources);
System.out.println(json.toString());
// {"veins":7.5,"size":9,"height":68,"density":0.1,"source":["cubyz:stone", "cubyz:soil"]}
```
#### Reading json
```java
JsonObject json = JsonParser.parseObjectFromFile("path/to/file");
breakingPower = json.getFloat("breakingPower", 0);
hardness = json.getFloat("hardness", 1);
blockClass = BlockClass.valueOf(json.getString("class", "STONE").toUpperCase());
light = json.getInt("emittedLight", 0);
absorption = json.getInt("absorbedLight", 0);
lightingTransparent = json.has("absorbedLight");
// No matter what's inside of path/to/file, there will be no exception thrown here, but there will be error messages.
```
#### Changing the error output
When the parser encounters errors, it will print an error message. But it will keep parsing, trying to get some output rather than none.
```java
Json.setErrorHandler((error) -> Logger.warning(error));
// On default the error gets output to System.out.println().
```
## Usage
#### maven
Add this to your `pom.xml` file:
```xml
	<repositories>
		... (other repositories)
		<repository>
			<id>cubyz</id>
			<url>https://raw.githubusercontent.com/PixelGuys/Cubyz-Dependencies/master/</url>
			<name>cubyz</name>
		</repository>
	</repositories>
	...
		<dependency>
			<groupId>pixelguys.json</groupId>
			<artifactId>trivial-json</artifactId>
			<version>1.1</version>
		</dependency>
```
#### other
Get the jar file from the release section.

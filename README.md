# Randomusert's utils
Randomusert's utils is a minecraft mod for 26.1.2 Fabric.

## Features
Here's a rough list of features, more coming in the future:
* QOL recipes
* public API
* Items for *some* Recipes
* Blocks for *some* Items for recipes


## Developers
This mod has a public API.

To use it, add the following to your repositories:
```groovy
repositories {
    maven {
        name = "RandomusertsMaven"
        setUrl("https://raw.githubusercontent.com/randomusert/maven-repository/main/repository/releases")
    }
    maven {
        name = "RandomusertsMavenSnapshots"
        setUrl("https://raw.githubusercontent.com/randomusert/maven-repository/main/repository/snapshots")
    }
}
```

Then in dependencies:

````groovy
depedencies {
    implementation "io.github.randomusert.mods.rstsutils:${rstsUtils_version}"
}
````


After refreshing the dependencies and/or allowing intellij to sync the project, you can now import the API.


To import the API, do something like this:
````java
import io.github.randomusert.mods.rstsutils.api;
````

## Contributing
If you want to contribute, you can. You have to sign a CLA (Contributor License Agreement) to contribute.



## NOTE!
This mod is developed independently from Tin mods ecosystem. 

Whilst I am the developer and creator of it, this mod will NOT be merged into it.

Please keep that in mind.
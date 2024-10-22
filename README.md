<!-- name-start -->
# Nyctography [![CurseForge Project](https://img.shields.io/curseforge/dt/1126493?logo=curseforge&label=CurseForge&style=flat-square&labelColor=2D2D2D&color=555555)](https://www.curseforge.com/minecraft/mc-mods/nyctography) [![Modrinth Project](https://img.shields.io/modrinth/dt/ViRnT7xw?logo=modrinth&label=Modrinth&style=flat-square&labelColor=2D2D2D&color=555555)](https://modrinth.com/project/nyctography) [![Maven Project](https://img.shields.io/maven-metadata/v?style=flat-square&logoColor=D31A38&labelColor=2D2D2D&color=555555&label=Latest&logo=gradle&metadataUrl=https%3A%2F%2Fmaven.blamejared.com%2Fnet%2Fdarkhax%2Fnyctography%2Fnyctography-common-1.21.1%2Fmaven-metadata.xml)](https://maven.blamejared.com/net/darkhax/nyctography)
<!-- name-end -->
<!-- description-start -->
Adds a Nyctography font set to Minecraft. The documentation for this mod can be found [here](https://docs.darkhax.net/mods/nyctography).
<!-- description-end -->

<!-- maven-start -->
## Maven Dependency

If you are using [Gradle](https://gradle.org) to manage your dependencies, add the following into your `build.gradle` file. Make sure to replace the version with the correct one. All versions can be viewed [here](https://maven.blamejared.com/net/darkhax/nyctography).

```gradle
repositories {
    maven { 
        url 'https://maven.blamejared.com'
    }
}

dependencies {
    // NeoForge
    implementation group: 'net.darkhax.nyctography', name: 'nyctography-neoforge-1.21.1', version: '21.1.0'

    // Forge
    implementation group: 'net.darkhax.nyctography', name: 'nyctography-forge-1.21.1', version: '21.1.0'

    // Fabric & Quilt
    modImplementation group: 'net.darkhax.nyctography', name: 'nyctography-fabric-1.21.1', version: '21.1.0'

    // Common / MultiLoader / Vanilla
    compileOnly group: 'net.darkhax.nyctography', name: 'nyctography-common-1.21.1', version: '21.1.0'
}
```
<!-- maven-end -->

<!-- sponsor-start -->
## Sponsors

[![](https://assets.blamejared.com/nodecraft/darkhax.jpg)](https://nodecraft.com/r/darkhax)    
Nyctography is sponsored by Nodecraft. Use code **[DARKHAX](https://nodecraft.com/r/darkhax)** for 30% of your first month of service!
<!-- sponsor-end -->
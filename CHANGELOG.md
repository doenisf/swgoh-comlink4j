# Release notes

<!-- next-version-placeholder-->

## 0.34.0
- Switched everything to swagger generated classes
- Using comlink version 0.34.0

## 0.2.1
- Publish should now work via GitHub actions as defined in the pipeline

## 0.2.0
- No parameter constructor now using the default port 3000 instead of 8080
- Implemented support for authorization with access and secret key

## 0.1.0
- Basic implementation to connect to a self-hosted instance of [swgoh-comlink](https://github.com/swgoh-utils/swgoh-comlink)
    - No support for versions with authorization enabled
- Implementation and models for the */guild*, */player* and */playerArena* endpoints
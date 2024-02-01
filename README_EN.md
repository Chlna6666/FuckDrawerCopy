# FuckDrawerCopy

## Introduction
This is a plugin designed to address the issue of drawer duplication caused by mechanical arms excavating drawers in Minecraft servers. The plugin intercepts the behavior of specified Deployer (mechanical) excavating drawer blocks to prevent drawer duplication.

## Key Features
- Specifically targets the issue of drawer duplication caused by mechanical arms excavating drawers on mohist servers.
- Implements a blacklist to intercept the excavation behavior of specified Deployer on specific drawer blocks.

## Availability
While this plugin has been tested and proven reliable on mohist servers, its compatibility with other server types remains unverified. When using on other server types, ensure thorough testing to ensure the plugin functions correctly.

## Usage
1. Place the plugin in the server's plugin directory and start the server.
2. When the Deployer excavates drawer blocks on the blacklist, the plugin intercepts the action and cancels the excavation.
3. The plugin logs the excavation of drawer blocks by Deployer and their location coordinates to the console for monitoring and management by administrators.

## Acknowledgements
Special thanks to [SkyIce0229](https://github.com/SkyIce0229/FixCopy) for providing the block ID list, which has been instrumental in the development of this plugin.

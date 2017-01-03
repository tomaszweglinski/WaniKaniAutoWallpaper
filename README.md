# WaniKaniAutoWallpaper
WaniKani Automatic Wallpaper is a Java 1.8 application developed for Windows 10 that lets you generate and automatically update wallpaper showing your current progress on WaniKani.

## How to use
- [Download application](https://github.com/tomaszweglinski/WaniKaniAutoWallpaper/raw/master/WaniKaniAutoWallpaper.jar).
- Open directory where you saved it.
- `Shift + right click` > `Open command window here`.
- Type `java -jar WaniKaniAutoWallpaper.jar -k 9b83...edc7 --overview` in orded to generate overview of wallpapers with different fonts installed in your system (they will appear in `overview` directory). Remember to use your own API key instead of the dotted one.
- Type `java -jar WaniKaniAutoWallpaper.jar -k 9b83...edc7 -f "Font Name"` in order to generate `wallpaper.png` with the font you like.
- If you want your wallpaper to be set and updated automatically:
 - Create shortcut to `WaniKaniAutoWallpaper.jar`.
 - In shortcut properties, change destination to something similar to:<br>`C:\Path\To\Correct\Directory\WaniKaniAutoWallpaper.jar -k 9b83...edc7 -f "Font Name" --auto`
 - Press `WinKey + R`, type `shell:startup` and move the shortcut to the `Autostart` directory.
 - Updating wallpaper after reboot may take about 30 seconds.

Type `java -jar WaniKaniAutoWallpaper.jar --help` in order to see full list of options (colors, margins etc.).

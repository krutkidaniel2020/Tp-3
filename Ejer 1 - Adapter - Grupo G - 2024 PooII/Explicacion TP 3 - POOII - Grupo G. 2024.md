# Explicación Método Adapter TP3 – Ejer 1 – Grupo G
El método Adapter, permite integrar dos interfaces distintas pero sin modificar su código, TPAPaMPAdaptador actúa como intermediario entre las dos interfaces, MusicPlayer y ThirdPartyAudioPlayer, dejando en desuso la función playSong de la clase MusicPlayer y reemplazando en su lugar la función startAudio en la nueva clase  ThirdPartyAudioPlayer.  

MusicApp es la aplicación que utiliza la clase MusicPlayer sin modificar sus métodos pero agregando y adaptando el nuevo de la interface ThirdPartyAudioPlayer.
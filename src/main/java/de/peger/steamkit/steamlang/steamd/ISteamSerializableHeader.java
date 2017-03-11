package de.peger.steamkit.steamlang.steamd;

public interface ISteamSerializableHeader extends ISteamSerializable {

    default public void setEMsg(long pEMsg) {
        // Empty default implementation for compatibility reasons
    };
}

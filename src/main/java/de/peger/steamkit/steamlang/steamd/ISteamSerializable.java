package de.peger.steamkit.steamlang.steamd;

import java.nio.ByteBuffer;

public interface ISteamSerializable {

    public static final int ProtoMask = 0x80000000;
    public static final int EMsgMask = ~ProtoMask;

    public ByteBuffer serialize();

    public void deserialize(final ByteBuffer buffer);
}

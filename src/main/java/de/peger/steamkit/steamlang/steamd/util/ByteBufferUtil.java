package de.peger.steamkit.steamlang.steamd.util;

import java.nio.ByteBuffer;

/**
 * @author dpeger
 */
public class ByteBufferUtil {

    public static short getUnsignedByte(final ByteBuffer pBuffer) {
        return (short) Byte.toUnsignedInt(pBuffer.get());
    }

    public static void putUnsignedByte(final ByteBuffer pBuffer, final int pValue) {
        pBuffer.put((byte) Byte.toUnsignedInt((byte) pValue));
    }

    public static int getUnsignedShort(final ByteBuffer pBuffer) {
        return Short.toUnsignedInt(pBuffer.getShort());
    }

    public static void putUnsignedShort(final ByteBuffer pBuffer, final int pValue) {
        pBuffer.putShort((short) Short.toUnsignedInt((short) pValue));
    }

    public static long getUnsignedInt(final ByteBuffer pBuffer) {
        return Integer.toUnsignedLong(pBuffer.getInt());
    }

    public static void putUnsignedInt(final ByteBuffer pBuffer, final long pValue) {
        pBuffer.putInt((int) Integer.toUnsignedLong((int) pValue));
    }

    public static byte getByte(final ByteBuffer pBuffer) {
        return pBuffer.get();
    }

    public static void putByte(final ByteBuffer pBuffer, final byte pValue) {
        pBuffer.put(pValue);
    }

    public static short getShort(final ByteBuffer pBuffer) {
        return pBuffer.getShort();
    }

    public static void putShort(final ByteBuffer pBuffer, final short pValue) {
        pBuffer.putShort(pValue);
    }

    public static int getInt(final ByteBuffer pBuffer) {
        return pBuffer.getInt();
    }

    public static void putInt(final ByteBuffer pBuffer, final int pValue) {
        pBuffer.putInt(pValue);
    }

    public static long getLong(final ByteBuffer pBuffer) {
        return pBuffer.getLong();
    }

    public static void putLong(final ByteBuffer pBuffer, final long pValue) {
        pBuffer.putLong(pValue);
    }

    public static byte[] getBytes(final ByteBuffer pBuffer, final int pLength) {
        final byte[] tValue = new byte[pLength];
        pBuffer.get(tValue);
        return tValue;
    }

    public static void putBytes(final ByteBuffer pBuffer, final byte[] pValue) {
        pBuffer.put(pValue);
    }

}

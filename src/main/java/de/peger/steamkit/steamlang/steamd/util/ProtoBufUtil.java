package de.peger.steamkit.steamlang.steamd.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/**
 * @author dpeger
 *
 */
public class ProtoBufUtil {

    @SuppressWarnings("unchecked")
    public static <T> T parseFrom(final ByteBuffer pBuffer, final int pSize, final Class<T> pProtoBufClass) {

        final byte[] tTempProto = new byte[pSize];
        pBuffer.get(tTempProto);
        try {
            final Method tParseFrom = pProtoBufClass.getMethod("parseFrom", byte[].class);
            return (T) tParseFrom.invoke(null, tTempProto);
        } catch (final NoSuchMethodException e) {
            throw new IllegalStateException(
                    "Expected '" + pProtoBufClass.getCanonicalName() + ".parseFrom(byte[])' to be present.", e);
        } catch (final InvocationTargetException e) {
            throw new IllegalArgumentException(e.getTargetException());
        } catch (final IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

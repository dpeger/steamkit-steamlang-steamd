package de.peger.steamkit.steamlang.steamd.util;

import java.nio.ByteBuffer;

import org.junit.Assert;
import org.junit.Test;

import de.peger.steamkit.steamlang.steamd.util.ByteBufferUtil;

/**
 * @author dpeger
 */
public class ByteBufferUtilTest {

    @Test
    public void testGetUnsignedByte() {

        final short tExpectedUByte = Byte.MAX_VALUE + 10;
        final ByteBuffer tBuffer = ByteBuffer.allocate(Byte.BYTES);

        ByteBufferUtil.putUnsignedByte(tBuffer, tExpectedUByte);
        tBuffer.flip();

        final short tActualUByte = ByteBufferUtil.getUnsignedByte(tBuffer);
        Assert.assertEquals("Unsigned bytes differ", tExpectedUByte, tActualUByte);
    }

}

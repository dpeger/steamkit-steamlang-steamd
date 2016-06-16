package de.peger.steamkit.steamlang.steamd.util;

import java.nio.ByteBuffer;

import org.junit.Assert;
import org.junit.Test;
import org.opensteamworks.steamkit.proto.gc.CMsgProtoBufHeader;
import org.opensteamworks.steamkit.proto.gc.GCProtoBufMsgSrc;

public class ProtoBufUtilTest {

    @Test
    public void testParseFromHappyCase() throws Exception {

        final CMsgProtoBufHeader tExpectedProto = CMsgProtoBufHeader.newBuilder().setClientSessionId(5)
                .setTargetJobName("SomeRandomName").setGcMsgSrc(GCProtoBufMsgSrc.GCProtoBufMsgSrc_FromSystem).build();

        final byte[] tExpectedProtoBytes = tExpectedProto.toByteArray();
        final ByteBuffer tBuffer = ByteBuffer.allocate(tExpectedProtoBytes.length);
        ByteBufferUtil.putBytes(tBuffer, tExpectedProtoBytes);
        tBuffer.flip();

        final CMsgProtoBufHeader tActualProto = ProtoBufUtil.parseFrom(tBuffer, tExpectedProtoBytes.length,
                CMsgProtoBufHeader.class);

        Assert.assertEquals("Parsed ProtoBuf was not equal to source object.", tExpectedProto, tActualProto);
    }

}

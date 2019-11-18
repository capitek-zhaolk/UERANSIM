package com.runsim.backend.nas.impl.values;

import com.runsim.backend.utils.OctetInputStream;
import com.runsim.backend.utils.OctetOutputStream;
import com.runsim.backend.utils.octets.Octet3;
import com.runsim.backend.utils.octets.OctetN;

public class VPartialTrackingAreaIdentityList00 extends VPartialTrackingAreaIdentityList {
    public VMccMnc mccMnc;
    public Octet3[] tacs;

    public static VPartialTrackingAreaIdentityList00 decode(OctetInputStream stream, int count) {
        var res = new VPartialTrackingAreaIdentityList00();
        res.mccMnc = VMccMnc.decode(stream);
        res.tacs = new Octet3[count];
        for (int i = 0; i < count; i++) {
            res.tacs[i] = stream.readOctet3();
        }
        return res;
    }

    @Override
    public void encode(OctetOutputStream stream) {
        var flags = new OctetN(0, 1);
        flags = flags.setBitRange(0, 4, tacs.length);
        flags = flags.setBitRange(5, 6, 0b00);
        stream.writeOctets(flags);
        mccMnc.encode(stream);
        for (var tac : tacs) {
            stream.writeOctet3(tac);
        }
    }
}
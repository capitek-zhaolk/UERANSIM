package tr.havelsan.ueransim.ngap4.ies.octet_strings;

import tr.havelsan.ueransim.ngap4.core.*;
import tr.havelsan.ueransim.utils.bits.*;
import tr.havelsan.ueransim.utils.octets.*;
import tr.havelsan.ueransim.ngap4.ies.bit_strings.*;
import tr.havelsan.ueransim.ngap4.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap4.ies.printable_strings.*;
import tr.havelsan.ueransim.ngap4.ies.sequences.*;
import tr.havelsan.ueransim.ngap4.ies.sequence_ofs.*;
import tr.havelsan.ueransim.ngap4.ies.choices.*;
import tr.havelsan.ueransim.ngap4.ies.integers.*;
import tr.havelsan.ueransim.ngap4.ies.enumerations.*;

import java.util.List;

public class NGAP_FiveG_TMSI extends NgapOctetString {

    public NGAP_FiveG_TMSI(OctetString value) {
        super(value);
    }

    public NGAP_FiveG_TMSI(BitString value) {
        super(value);
    }

    public NGAP_FiveG_TMSI(Octet... octets) {
        super(octets);
    }

    public NGAP_FiveG_TMSI(int[] octetInts) {
        super(octetInts);
    }

    public NGAP_FiveG_TMSI(byte[] octetBytes) {
        super(octetBytes);
    }

    public NGAP_FiveG_TMSI(String hex) {
        super(hex);
    }

    @Override
    protected String getAsnName() {
        return "FiveG-TMSI";
    }

    @Override
    protected String getXmlTagName() {
        return "FiveG-TMSI";
    }
}

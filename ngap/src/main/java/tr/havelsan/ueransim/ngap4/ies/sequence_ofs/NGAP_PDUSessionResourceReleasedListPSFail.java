package tr.havelsan.ueransim.ngap4.ies.sequence_ofs;

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

public class NGAP_PDUSessionResourceReleasedListPSFail extends NgapSequenceOf<NGAP_PDUSessionResourceReleasedItemPSFail> {

    public NGAP_PDUSessionResourceReleasedListPSFail() {
        super();
    }

    public NGAP_PDUSessionResourceReleasedListPSFail(List<NGAP_PDUSessionResourceReleasedItemPSFail> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "PDUSessionResourceReleasedListPSFail";
    }

    @Override
    protected String getXmlTagName() {
        return "PDUSessionResourceReleasedListPSFail";
    }

    @Override
    public Class<NGAP_PDUSessionResourceReleasedItemPSFail> getItemType() {
        return NGAP_PDUSessionResourceReleasedItemPSFail.class;
    }
}

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

public class NGAP_PDUSessionResourceReleasedListRelRes extends NgapSequenceOf<NGAP_PDUSessionResourceReleasedItemRelRes> {

    public NGAP_PDUSessionResourceReleasedListRelRes() {
        super();
    }

    public NGAP_PDUSessionResourceReleasedListRelRes(List<NGAP_PDUSessionResourceReleasedItemRelRes> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "PDUSessionResourceReleasedListRelRes";
    }

    @Override
    protected String getXmlTagName() {
        return "PDUSessionResourceReleasedListRelRes";
    }

    @Override
    public Class<NGAP_PDUSessionResourceReleasedItemRelRes> getItemType() {
        return NGAP_PDUSessionResourceReleasedItemRelRes.class;
    }
}

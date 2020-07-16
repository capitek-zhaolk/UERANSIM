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

public class NGAP_AreaOfInterestRANNodeList extends NgapSequenceOf<NGAP_AreaOfInterestRANNodeItem> {

    public NGAP_AreaOfInterestRANNodeList() {
        super();
    }

    public NGAP_AreaOfInterestRANNodeList(List<NGAP_AreaOfInterestRANNodeItem> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "AreaOfInterestRANNodeList";
    }

    @Override
    protected String getXmlTagName() {
        return "AreaOfInterestRANNodeList";
    }

    @Override
    public Class<NGAP_AreaOfInterestRANNodeItem> getItemType() {
        return NGAP_AreaOfInterestRANNodeItem.class;
    }
}

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

public class NGAP_TNLAssociationList extends NgapSequenceOf<NGAP_TNLAssociationItem> {

    public NGAP_TNLAssociationList() {
        super();
    }

    public NGAP_TNLAssociationList(List<NGAP_TNLAssociationItem> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "TNLAssociationList";
    }

    @Override
    protected String getXmlTagName() {
        return "TNLAssociationList";
    }

    @Override
    public Class<NGAP_TNLAssociationItem> getItemType() {
        return NGAP_TNLAssociationItem.class;
    }
}

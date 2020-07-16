package tr.havelsan.ueransim.ngap4.ies.sequences;

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

public class NGAP_DRBsSubjectToStatusTransferItem extends NgapSequence {

    public NGAP_DRB_ID dRB_ID;
    public NGAP_DRBStatusUL dRBStatusUL;
    public NGAP_DRBStatusDL dRBStatusDL;

    @Override
    protected String getAsnName() {
        return "DRBsSubjectToStatusTransferItem";
    }

    @Override
    protected String getXmlTagName() {
        return "DRBsSubjectToStatusTransferItem";
    }

    @Override
    protected String[] getMemberNames() {
        return new String[]{"dRB-ID", "dRBStatusUL", "dRBStatusDL"};
    }

    @Override
    protected String[] getMemberIdentifiers() {
        return new String[]{"dRB_ID", "dRBStatusUL", "dRBStatusDL"};
    }
}

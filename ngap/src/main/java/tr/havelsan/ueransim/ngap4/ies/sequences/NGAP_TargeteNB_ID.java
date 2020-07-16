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

public class NGAP_TargeteNB_ID extends NgapSequence {

    public NGAP_GlobalNgENB_ID globalENB_ID;
    public NGAP_EPS_TAI selected_EPS_TAI;

    @Override
    protected String getAsnName() {
        return "TargeteNB-ID";
    }

    @Override
    protected String getXmlTagName() {
        return "TargeteNB-ID";
    }

    @Override
    protected String[] getMemberNames() {
        return new String[]{"globalENB-ID", "selected-EPS-TAI"};
    }

    @Override
    protected String[] getMemberIdentifiers() {
        return new String[]{"globalENB_ID", "selected_EPS_TAI"};
    }
}

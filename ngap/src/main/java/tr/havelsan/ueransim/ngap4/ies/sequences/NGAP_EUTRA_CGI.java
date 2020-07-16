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

public class NGAP_EUTRA_CGI extends NgapSequence {

    public NGAP_PLMNIdentity pLMNIdentity;
    public NGAP_EUTRACellIdentity eUTRACellIdentity;

    @Override
    protected String getAsnName() {
        return "EUTRA-CGI";
    }

    @Override
    protected String getXmlTagName() {
        return "EUTRA-CGI";
    }

    @Override
    protected String[] getMemberNames() {
        return new String[]{"pLMNIdentity", "eUTRACellIdentity"};
    }

    @Override
    protected String[] getMemberIdentifiers() {
        return new String[]{"pLMNIdentity", "eUTRACellIdentity"};
    }
}

/*
 * Copyright (c) 2020 ALİ GÜNGÖR (aligng1620@gmail.com)
 * This software and all associated files are licensed under GPL-3.0.
 */

package tr.havelsan.ueransim.app.common.contexts;

import tr.havelsan.ueransim.app.common.simctx.GnbSimContext;
import tr.havelsan.ueransim.itms.nts.NtsTask;

public class GnbRrcContext {
    public final GnbSimContext gnbCtx;

    public NtsTask ngapTask;
    public NtsTask mrTask;

    public GnbRrcContext(GnbSimContext gnbCtx) {
        this.gnbCtx = gnbCtx;
    }
}

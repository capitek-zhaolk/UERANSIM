/*
 * Copyright (c) 2020 ALİ GÜNGÖR (aligng1620@gmail.com)
 * This software and all associated files are licensed under GPL-3.0.
 */

package tr.havelsan.ueransim.app.common.contexts;

import tr.havelsan.ueransim.app.common.simctx.UeSimContext;
import tr.havelsan.ueransim.itms.nts.NtsTask;

import java.util.UUID;

public class UeMrContext {
    public final UeSimContext ueCtx;

    public NtsTask rrcTask;
    public NtsTask appTask;

    public UUID connectedGnb;

    public UeMrContext(UeSimContext ueCtx) {
        this.ueCtx = ueCtx;
    }
}

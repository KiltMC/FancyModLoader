/*
 * Copyright (c) NeoForged and contributors
 * SPDX-License-Identifier: LGPL-2.1-only
 */

package net.neoforged.fml;

import xyz.bluspring.twill.TwillConstants;

public final class FMLVersion {
    private FMLVersion() {}

    public static String getVersion() {
        // Twill: Use a custom-defined version
        return TwillConstants.FML_VERSION;
    }
}

package dev.avorakh.geoip.pub;

import lombok.Builder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Builder
public record LocationData(@NotNull String countyIsoCode, @Nullable String timeZone) {
}
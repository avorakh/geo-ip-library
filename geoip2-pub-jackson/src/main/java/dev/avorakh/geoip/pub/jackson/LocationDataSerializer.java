package dev.avorakh.geoip.pub.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import dev.avorakh.geoip.pub.LocationData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class LocationDataSerializer extends StdSerializer<LocationData> {

    public LocationDataSerializer() {

        this(null);
    }

    public LocationDataSerializer(@Nullable Class<LocationData> vc) {

        super(vc);
    }

    @Override
    public void serialize(@NotNull LocationData value, @NotNull JsonGenerator generator, @Nullable SerializerProvider provider) throws IOException {

        generator.writeStartObject();

        generator.writeStringField("countyIsoCode", value.countyIsoCode());

        if (value.timeZone() != null) {
            generator.writeStringField("timeZone", value.timeZone());
        }

        generator.writeEndObject();
    }
}


package dk.tbsalling.ais.tracker.events;

import dk.tbsalling.ais.tracker.AISTrack;

import javax.annotation.concurrent.Immutable;

/**
 * This event is fired whenever a new AisTrack is created by the tracker.
 */
@Immutable
public final class AisTrackUpdatedEvent extends AisTrackEvent {

    public AisTrackUpdatedEvent(AISTrack aisTrack) {
        super(aisTrack);
    }

    @Override
    public String toString() {
        return "AisTrackUpdatedEvent{} " + super.toString();
    }
}

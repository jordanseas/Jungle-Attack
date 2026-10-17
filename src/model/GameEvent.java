package model;

public record GameEvent(EventType type, int sourceId, int targetId, int zoneId) {
}

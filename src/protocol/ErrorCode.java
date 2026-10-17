package protocol;

public enum ErrorCode {
    MATCH_NOT_FOUND("No existe una partida con ese código"),
    MATCH_FULL("La partida ya tiene dos jugadores"),
    NICKNAME_TAKEN("Ese apodo ya está en uso en la partida"),
    INVALID_NICKNAME("El apodo debe tener entre 3 y 16 caracteres"),
    INVALID_MATCH_CODE("El código debe tener 4 letras o números"),
    WRONG_PHASE("Esa acción no se puede hacer en este momento"),
    SPECIES_TAKEN("Esa especie ya fue elegida"),
    ZONE_NOT_VISIBLE("No hay animales tuyos vivos en esa zona"),
    INVALID_DESTINATION("El destino no está sobre un camino"),
    NO_ANIMALS("Ninguno de los animales seleccionados puede moverse"),
    INVALID_TARGET("Ese objetivo no se puede atacar"),
    UNKNOWN_COMMAND("Comando desconocido"),
    MALFORMED_MESSAGE("El mensaje no tiene el formato esperado");

    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() { return message; }
}

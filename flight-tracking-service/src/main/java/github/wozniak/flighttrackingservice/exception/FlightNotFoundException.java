package github.wozniak.flighttrackingservice.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class FlightNotFoundException extends RuntimeException{

    private final HttpStatus status = HttpStatus.NOT_FOUND;

    public FlightNotFoundException(String message){
        super(message);
    }
}

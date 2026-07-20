package ac.rs.singidunum.itws.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FlightModel {
    // {
    // "id": 282493,
    // "type": {
    // "id": 2,
    // "name": "DEPARTURE"
    // },
    // "flightKey": "202607202050IDDY 19550DY 1955",
    // "flightNumber": "DY 1955",
    // "destination": "Oslo",
    // "scheduledAt": "2026-07-20T20:50:00",
    // "estimatedAt": null,
    // "connectedType": "0",
    // "connectedFlight": null,
    // "plane": "7M8",
    // "gate": "A05",
    // "terminal": "1"
    // }

    private Integer id;
    private TypeModel type;
    private String flightkey;
    private String flightNumber;
    private String destination;
    private String scheduledAt;
    private String estimatedAt;
    private String connectedType;
    private String connectedFlight;
    private String plane;
    private String gate;
    private Integer terminal;

}

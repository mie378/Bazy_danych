package ProjectBackend.webservice;

import ProjectBackend.Model.tickets.Discount;
import ProjectBackend.Model.tickets.KnownDiscountName;
import ProjectBackend.Model.tickets.Ticket;
import ProjectBackend.Model.users.User;
import ProjectBackend.Model.users.UserIdentifier;
import ProjectBackend.data.tickets.TicketDBController;
import ProjectBackend.data.tickets.TicketRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@Service
@RestController
@RequestMapping("/routes")
public class TicketController {
    @Autowired
    TicketDBController ticketDBController;
    public TicketController(TicketDBController ticketDBController){this.ticketDBController=ticketDBController;}
    @RequestMapping(path="/ticket",method= RequestMethod.POST)
    public ResponseEntity<String> buyTicket(@RequestBody Ticket ticket){
        if(!ticketDBController.saveTicket(ticket)){
            return ResponseEntity.status(540).body("{Response:Ticket cannot be bought}");
        }
        return ResponseEntity.ok().body(new Gson().toJson(ticket));
    }
    @RequestMapping(path="/tickets",method=RequestMethod.GET)
    public ResponseEntity<String> getTickets(@RequestBody UserIdentifier userIdentifier){
        return ResponseEntity.ok().body(new Gson().toJson(this.ticketDBController.getTickets(userIdentifier.getUserID())));
    }
}

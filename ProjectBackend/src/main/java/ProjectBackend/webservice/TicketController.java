package ProjectBackend.webservice;

import ProjectBackend.Model.tickets.Ticket;
import ProjectBackend.data.tickets.TicketDBController;
import ProjectBackend.data.tickets.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.sql.Date;

@Service
@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    TicketDBController ticketDBController;
    public TicketController(TicketDBController ticketDBController){this.ticketDBController=ticketDBController;}
    @RequestMapping(path="/buy",method= RequestMethod.POST)
    public String buyTicket(){
        return "OK";
    }

}

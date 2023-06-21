import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RendezVousService } from 'src/app/services/rendez-vous.service';
import { Rendez_vous } from 'src/app/models/Rendez_vous';

@Component({
  selector: 'app-appointment-list',
  templateUrl: './appointment-list.component.html',
  styleUrls: ['./appointment-list.component.css']
})
export class AppointmentListComponent implements OnInit {

  appointments: Rendez_vous[];

  constructor(private appointmentService: RendezVousService,
    private router: Router) { }

  ngOnInit(): void {

    this.getAppointments();
  }

  private getAppointments() {
    this.appointmentService.getAllRendez_Vous().subscribe(data => {this.appointments = data;
      });
  }

  deleteAppointment(id: number){ 
    this.appointmentService.deleteRdv(id).subscribe( data => { 
      console.log(data);
      this.getAppointments();
    })
  }

}

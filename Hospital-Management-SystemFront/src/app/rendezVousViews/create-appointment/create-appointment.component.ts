import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RendezVousService } from '../../services/rendez-vous.service';
import { Rendez_vous } from '../../models/Rendez_vous';

@Component({
  selector: 'app-create-appointment',
  templateUrl: './create-appointment.component.html',
  styleUrls: ['./create-appointment.component.css']
})
export class CreateAppointmentComponent implements OnInit {

  appointment: Rendez_vous = new Rendez_vous();

  constructor(private appointmentService: RendezVousService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveAppointment() {

    this.appointmentService.createRdv(this.appointment).subscribe(data => {
      console.log(data);
      this.goToAppointmentList();
    },
    error => console.log(error));
  }

  goToAppointmentList() {
    this.router.navigate(['/appointmentlist'])
  }

  onSubmit() {
    console.log(this.appointment);
    this.saveAppointment();
  }

}

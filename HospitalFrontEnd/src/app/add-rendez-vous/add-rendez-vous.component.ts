import { Component } from '@angular/core';
import { RendezVousService } from '../service/rendez-vous.service';
import { Rendez_vous } from '../models/Rendez_vous';
@Component({
  selector: 'app-add-rendez-vous',
  templateUrl: './add-rendez-vous.component.html',
  styleUrls: ['./add-rendez-vous.component.css']
})
export class AddRendezVousComponent {

  rendezVous: Rendez_vous=new  Rendez_vous();
  constructor(private RendezVousSer: RendezVousService) { }
  ngOnInit(): void {}
  saveRendezvous(): void {
    this.RendezVousSer.createRendezvous(this.rendezVous).subscribe(data => {
      console.log(data);
    });
  }
  onSubmit(): void {
    this.saveRendezvous();
  }
}










import { Component } from '@angular/core';
import { ServiceGardeService } from '../service/service-garde.service';
import { Service_de_Gardes } from '../models/Service_de_garde';

@Component({
  selector: 'app-add-service-garde',
  templateUrl: './add-service-garde.component.html',
  styleUrls: ['./add-service-garde.component.css']
})
export class AddServiceGardeComponent {

  servicegarde: Service_de_Gardes= new Service_de_Gardes();
  constructor(private serviceGardesrvc: ServiceGardeService) { }
  ngOnInit(): void {
  }
  saveserviceGarde(): void {
    this.serviceGardesrvc.createServiceGarde(this.servicegarde).subscribe(data => {
      console.log(data);
    });
  }
  onSubmit(): void {
    console.log('test');
    this.saveserviceGarde();
  }
}

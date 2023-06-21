import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewsfeedComponent } from './newsfeed/newsfeed.component';
import { DocloginComponent } from './doclogin/doclogin.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { DocdashComponent } from './docdash/docdash.component';
import { AdmindashComponent } from './admindash/admindash.component';
import { HttpClientModule } from '@angular/common/http';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { CreatepatientComponent } from './PatientViews/createpatient/createpatient.component';
import { UpdatePatientComponent } from 'src/app/PatientViews/update-patient/update-patient.component';
import { MedicineListComponent } from 'src/app/VaccinViews/medicine-list/medicine-list.component';
import { CreatemedicineComponent } from 'src/app/VaccinViews/createmedicine/createmedicine.component';
import { UpdateMedicineComponent } from './VaccinViews/update-medicine/update-medicine.component';
import { AppointmentListComponent } from 'src/app/rendezVousViews/appointment-list/appointment-list.component';
import { CreateAppointmentComponent } from './rendezVousViews/create-appointment/create-appointment.component';
import { ViewPatientComponent } from 'src/app/PatientViews/view-patient/view-patient.component';

const routes: Routes = [
  { path: '', component: NewsfeedComponent },
  { path: 'doclogin', component: DocloginComponent },
  { path: 'adlogin', component: AdminloginComponent },
  { path: 'home', component: NewsfeedComponent },
  { path: 'createpatient', component: CreatepatientComponent},
  { path: 'docdash', component: DocdashComponent },
  { path: 'updatepatient/:id', component: UpdatePatientComponent },
  { path: 'admindash', component: AdmindashComponent },
  { path: 'medicinelist', component: MedicineListComponent},
  { path: 'createmedicine', component: CreatemedicineComponent },
  { path: 'updatemedicine/:id', component: UpdateMedicineComponent },
  { path: 'appointmentlist', component: AppointmentListComponent },
  { path: 'createappointment', component: CreateAppointmentComponent},
  { path: 'viewpatient/:id', component: ViewPatientComponent }
]

@NgModule({
  declarations: [
    AppComponent,
    NewsfeedComponent,
    DocloginComponent,
    AdminloginComponent,
    DocdashComponent,
    AdmindashComponent,
    CreatepatientComponent,
    UpdatePatientComponent,
    MedicineListComponent,
    CreatemedicineComponent,
    UpdateMedicineComponent,
    AppointmentListComponent,
    CreateAppointmentComponent,
    ViewPatientComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    FormsModule,
    BrowserModule,
    Ng2SearchPipeModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

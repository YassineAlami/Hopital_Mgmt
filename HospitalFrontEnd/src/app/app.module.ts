import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FullCalendarModule } from '@fullcalendar/angular';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { MainMenuComponent } from './main-menu/main-menu.component';
import { AlertComponentComponent } from './alert-component/alert-component.component';
import { SidemenuComponent } from './sidemenu/sidemenu.component';
import { CardComponent } from './card/card.component';
import { CalandarComponent } from './calandar/calandar.component';
import { AddRendezVousComponent } from './add-rendez-vous/add-rendez-vous.component';
import { ConfirmRendezVousComponent } from './confirm-rendez-vous/confirm-rendez-vous.component';
import { AddPatientComponent } from './add-patient/add-patient.component';
import { ListPatientsComponent } from './list-patients/list-patients.component';
import { ListDossierMedicauxComponent } from './list-dossier-medicaux/list-dossier-medicaux.component';
import { ListHospitalisationsComponent } from './list-hospitalisations/list-hospitalisations.component';
import { AddServiceGardeComponent } from './add-service-garde/add-service-garde.component';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent,
    SignUpComponent,
    MainMenuComponent,
    AlertComponentComponent,
    SidemenuComponent,
    CardComponent,
    CalandarComponent,
    AddRendezVousComponent,
    ConfirmRendezVousComponent,
    AddPatientComponent,
    ListPatientsComponent,
    ListDossierMedicauxComponent,
    ListHospitalisationsComponent,
    AddServiceGardeComponent,


  ],
  imports: [
    BrowserModule,
    FullCalendarModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [HttpClientModule,HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }

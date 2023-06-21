import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  username2 = 'user'
  password2 = ''
  invalidLogin = false

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  checkLogin() {
   
  }

}
